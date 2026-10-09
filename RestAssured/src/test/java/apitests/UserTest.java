package apitests;
import org.testng.annotations.Test;

import user.java.User;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserTest {
	@Test
	public void createUser() {
		User user = new User();
		user.setName("John");
		user.setJob("developer");
		given()
		.baseUri("https://reqres.in/")
		.headers("Content-type","application/json")
		.body(user)
		.when()
		.post("/api/users")
		.then()
		.log().body()
		.statusCode(400);
	}
}
