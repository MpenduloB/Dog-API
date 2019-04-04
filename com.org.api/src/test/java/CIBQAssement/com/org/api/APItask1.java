package CIBQAssement.com.org.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;



public class APItask1 {

	@Test
	public void TC101_AllDogBreeds() {
		
		Response resp = when().		
				get("https://dog.ceo/api/breeds/list/all");
	
		System.out.println(resp.asString());
		//Assert.assertEquals(resp.getStatusCode(), 200);
		
	}
	
	@Test
	public void TC102_VerifyRetreiver() {
		
		String retrieveExist = when().
		
				get("https://dog.ceo/api/breed/retriever").
				then().
				contentType(ContentType.JSON).
				extract().
				path("retriever");
				
		
		System.out.println("Retreiver does exist " + retrieveExist);
	
	
	}
	
	@Test
	public void TC103_RetreiverList() {
		
		Response resp = when().
				get("https://dog.ceo/api/breed/retriever/list");
			
		System.out.println(resp.asString());
	
	}
	
	@Test
	public void TC104_GoldenRandomImg() {
		
		Response resp = when().
				get("https://dog.ceo/api/breed/retriever/images/random");
			
		System.out.println(resp.asString());
	
	}
}
