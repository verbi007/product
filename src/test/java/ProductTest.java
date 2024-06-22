import io.restassured.builder.RequestSpecBuilder;
import org.junit.jupiter.api.BeforeEach;
import product.ProductRoot;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ProductTest extends BaseRestAssured{


    @Test
    public void checkProductTest() {
        ProductRoot product = given()
                .param("number", Constants.NUMBER)
                .param("product_id", "731")
                .header("x-vkusvill-token", Constants.TOKEN)
                .when()
                .get(Constants.PRODUCT_URL)
                .then().log().all()
                .statusCode(200)
                .extract().as(ProductRoot.class);

        String title = product.getTitle();
    }
}
