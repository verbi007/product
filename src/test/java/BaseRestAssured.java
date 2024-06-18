import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseRestAssured {
    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = Constants.BASE_URL;
    }
}
