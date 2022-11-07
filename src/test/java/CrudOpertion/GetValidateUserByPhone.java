package CrudOpertion;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetValidateUserByPhone {
	
		@Test
		 
		public void getValidateUserByPhone()
		{
			baseURI = "http://localhost:8080";
			given()
			.queryParam( "phone","7018530713")
			.
			when()
			.get("/users")
			
			.then()
			.assertThat().statusCode(200)
			.log().all();
		
		}
}
