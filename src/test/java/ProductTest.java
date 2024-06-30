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

    @BeforeEach
    public void setUp(){
        HibernateRunner.getSessionFactory().openSession();
    }

    @AfterAll
    public static void tearDown(){
        HibernateRunner.getSessionFactory().close();
    }

    @Test
    public void checkProductTest() {
        Product productDB = new Product();
        productDB = HibernateRunner.findById( productDB, 731);

        ProductRoot product = given()
                .param("number", Constants.NUMBER)
                .param("product_id", "731")
                .header("x-vkusvill-token", Constants.TOKEN)
                .when()
                .get(Constants.BASE_URL + Constants.PRODUCT_URL)
                .then().log().all()
                .statusCode(200)
                .extract().as(ProductRoot.class);

        Assertions.assertEquals(product.getTitle(), productDB.getProductName());
        Assertions.assertEquals(product.getId(), productDB.getId());
    }

    @Test
    public void checkArchivedProductTest() {
        ArchivedProduct productDB = new ArchivedProduct();
        productDB = HibernateRunner.findById( productDB, 300);
        HibernateRunner.getSession().close();



        ProductRoot archivedProduct = given()
                .param("number", Constants.NUMBER)
                .param("product_id", "300")
                .header("x-vkusvill-token", Constants.TOKEN)
                .when()
                .get(Constants.BASE_URL + Constants.PRODUCT_URL)
                .then().log().all()
                .statusCode(200)
                .extract().as(ProductRoot.class);

        Assertions.assertFalse(archivedProduct.getTitle().equals(productDB.getProductName()));
        Assertions.assertEquals(archivedProduct.getId(), productDB.getId());
    }

}
