package CrudOpertion;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostMethod {

	@Test
	
	public void postMethod() {
		
		
		JSONObject obj=new JSONObject();
		
		
	    obj.put("address","bbrrrs");
	    obj.put("email","ram665554@gmail.com");
	    obj.put("id",114);
	    obj.put("name","rameshkpaikray");
	    obj.put( "otp", 42);
	    obj.put( "password","reeng@135");
	    obj.put("phone","7328000094237");
	    obj.put( "username","st1341");
	    
	    
	    given()
	    .contentType(ContentType.JSON)
	    .body( obj)
	    .when()
	    .post("/users/save")
	    .then().assertThat().statusCode(201)
	    .log().all();
		
	}
}
