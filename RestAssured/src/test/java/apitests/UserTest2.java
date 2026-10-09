package apitests;
import org.testng.annotations.Test;

import user.java.User;
import user.java.User2;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserTest2 {
	@Test(priority = 1)
	public void updateUser() {
		User2 user2 = new User2("John","tester");
		given()
		.baseUri("https://reqres.in/")
		.headers("Content-type","application/json")
		.body(user2)
		.when()
		.put("/api/users/2")
		.then()
		.log().body()
		.log().all()
		.body("name",equalTo("John"))
		.body("job",equalTo("tester"))
		.body("name", notNullValue())
		.time(lessThan(3000l))
		//.cookie("sessionId",notNullValue())
		//.cookie("sessionId",equalTo("abc123"))
		.statusCode(200);
	}
	/*@Test(priority = 2)
	public void updateJob() {
		User2 user2 = new User2("dev");
		given()
		.baseUri("https://reqres.in/")
		.headers("Content-type","application/json")
		.body(user2)
		.when()
		.patch("/api/users/2")
		.then()
		.log().body()
		.log().all()
		.statusCode(200);
	}*/
}
