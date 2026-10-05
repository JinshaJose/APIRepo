package apitests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetRequestTestDemoAPI {
@Test
	public void getTodo() {
		given()
		.header("Content-type","application/json")
		//.body(")
		.when()
		.get("http://localhost:3000/books")
		.then()
		.log().body()//.all()
		.statusCode(200);
	}
@Test
public void deletePost(){
	given()
	.when()
	.delete("http://localhost:3000/books/7JOZGmZetqM")
	.then()
	.statusCode(200);
	
	
}

}
