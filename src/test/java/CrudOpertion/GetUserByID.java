package CrudOpertion;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetUserByID {


		@Test
		 
		public void getUserByID()
		{
			baseURI = "http://localhost:8080";
			given()
			.queryParam("id",76)
			.log().all().
			when()
			.get("/users")
			
			.then()
			.assertThat().statusCode(200)
			.log().all();
		
		}
}
