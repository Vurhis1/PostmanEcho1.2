import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static io.restassured.RestAssured.*;
import static org.apache.http.client.utils.DateUtils.GMT;
import static org.hamcrest.Matchers.equalTo;

public class PostTest {

  @Test
  void shouldReturnDemoAccounts() {

      given()
              .baseUri("https://postman-echo.com")
              .contentType("text/plain; charset=UTF-8")
              .body("some data")
              .when()
              .post("/post")
              .then()
              .statusCode(200)
              .body("data", equalTo("some data"));

}
}
