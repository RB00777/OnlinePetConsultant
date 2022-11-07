package CrudOpertion;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetValidateUserbyEmail {
	@Test
	 
	public void getAllUser()
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
