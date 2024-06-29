import io.restassured.builder.RequestSpecBuilder;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jdbc.HibernateRunner;
import jdbc.entity.ArchivedProduct;
import jdbc.entity.Product;
import org.junit.jupiter.api.*;
import product.ProductRoot;

import static io.restassured.RestAssured.given;

public class ProductTest extends BaseRestAssured{
    private static HibernateRunner hr;

    @BeforeEach
    public void setUp(){
        hr = new HibernateRunner();
        hr.getSessionFactory().openSession();
    }

    @AfterAll
    public static void tearDown(){
        hr.getSessionFactory().close();
    }

    @Test
    public void checkProductTest() {
        HibernateRunner hr = new HibernateRunner();

        hr.getSessionFactory().openSession();
//        CriteriaBuilder cb = hr.getSession().getCriteriaBuilder();
//        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
//        Root<Product> root = cq.from(Product.class);
//        cq.select(root).where(cb.equal(root.get("id"), 731));

        Product productDB = new Product();
        productDB = hr.findById( productDB, 731);
//        productDB = hr.getSession().createQuery(cq).getSingleResult();

        ProductRoot product = given()
                .param("number", Constants.NUMBER)
                .param("product_id", "731")
                .header("x-vkusvill-token", Constants.TOKEN)
                .when()
                .get(Constants.PRODUCT_URL)
                .then().log().all()
                .statusCode(200)
                .extract().as(ProductRoot.class);

        Assertions.assertEquals(product.getTitle(), productDB.getProductName());
        Assertions.assertEquals(product.getId(), productDB.getId());
    }

    @Test
    public void checkArchivedProductTest() {
        ArchivedProduct productDB = new ArchivedProduct();
        productDB = hr.findById( productDB, 300);

        ProductRoot archivedProduct = given()
                .param("number", Constants.NUMBER)
                .param("product_id", "300")
                .header("x-vkusvill-token", Constants.TOKEN)
                .when()
                .get(Constants.PRODUCT_URL)
                .then().log().all()
                .statusCode(200)
                .extract().as(ProductRoot.class);

        Assertions.assertEquals(archivedProduct.getTitle(), productDB.getProductName());
        Assertions.assertEquals(archivedProduct.getId(), productDB.getId());
    }
}
