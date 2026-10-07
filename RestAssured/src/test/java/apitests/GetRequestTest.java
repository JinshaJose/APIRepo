package apitests;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetRequestTest {
@Test
	public void getTodo() {
		given()
		.when()
		.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()
		.log().body()
		
		.statusCode(201);
	}
/*@Test
public void deletePost(){
	given()
	.when()
	.delete("https://jsonplaceholder.typicode.com/posts/1")
	.then()
	.statusCode(200);
	
	
}*/
}
