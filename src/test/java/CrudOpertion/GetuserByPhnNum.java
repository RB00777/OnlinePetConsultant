package CrudOpertion;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetuserByPhnNum {
	@Test
	 
	public void getuserByPhnNum()
	{
		baseURI = "http://localhost:8080";
		given()
		.queryParam("phone","7018530713")
		.log().all().
		when()
		.get("/users")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
}
}