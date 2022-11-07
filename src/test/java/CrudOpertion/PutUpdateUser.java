package CrudOpertion;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutUpdateUser {

	
	@Test
	
	public void putUpdateUser() {
	
	JSONObject obj = new JSONObject();
	
	obj.put("address","bnrnp");
	obj.put("email" ,"jhjkjfk@gmail.com");
	obj.put("id", 76);
	obj.put("name","brhkjkrfkjf");
	obj.put( "otp", 4567);
	obj.put("password","jnj@001");
	obj.put("phone","6370998667");
    obj.put("username","njjissjs");
    
    given()
    .contentType(ContentType.JSON)
    .body( obj)
    .when()
    .put("/users")
    .then()
    .assertThat()
    .statusCode(201)
    .log().all();
	
	}	
}
