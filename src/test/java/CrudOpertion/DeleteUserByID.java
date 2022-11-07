package CrudOpertion;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class DeleteUserByID {
	@Test
	 
	public void deleteUserByID()
	{
		baseURI = "http://localhost:8080";
		given()
		.queryParam("id",67)
		.log().all().
		when()
		.delete("/users/delete")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
}
}
