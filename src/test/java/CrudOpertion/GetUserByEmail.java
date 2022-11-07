package CrudOpertion;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetUserByEmail {

	@Test
	 
	public void getUserByEmail()
	{
		baseURI = "http://localhost:8080";
		given()
		.queryParam("email","ras555@gmail.com")
		.log().all().
		when()
		.get("/users")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
