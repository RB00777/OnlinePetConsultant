package CrudOpertion;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class GetAllUser {

	@Test
	 
	public void getAllUser()
	{
		baseURI = "http://localhost:8080";
		when()
		.get("/users")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	
	}
	
}
