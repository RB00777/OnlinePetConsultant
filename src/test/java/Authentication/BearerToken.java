package Authentication;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {

	
	@Test
	
	public void bearerToken() {
	
	baseURI = "http://api.github.com";
	JSONObject obj = new JSONObject();
	
	obj.put("name", "OnlinePetConsultation");
	
	given().auth().oauth2("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")
	.body(obj).contentType( ContentType.JSON)
	.when( ).post("/users/repos")
	.then().log().all();
	
	
}
}
