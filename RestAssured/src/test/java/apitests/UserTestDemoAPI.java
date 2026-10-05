package apitests;
import org.testng.annotations.Test;

import user.java.User;
import user.java.UserDemoAPI;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

public class UserTestDemoAPI {
	@Test
	public void createUser() {
		UserDemoAPI userdemo = new UserDemoAPI();
		userdemo.setBookId(8);
		userdemo.setTitle("Clean Code");
		userdemo.setAuthor("Robert");
		userdemo.setIsbn(142536799);
		userdemo.setPrice(45.52);
		userdemo.setInStock(true);
		userdemo.setPublishedYear(2008);
		//userdemo.setGenres(new String[] {"Java","sql"});
		List<String>genres = Arrays.asList("Java","sql");
		
		userdemo.setRating(4.8);
		userdemo.setGenres(genres);
		
				
		given()
		.baseUri("http://localhost:3000")
		.headers("Content-type","application/json")
		.body(userdemo)
		.when()
		.post("/books")
		.then()
		.log().body()
		.statusCode(201);
	}

}
