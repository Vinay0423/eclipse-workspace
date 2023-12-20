package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethod {

	@Test
	public void get_method()
	{
	Response response = RestAssured.get("https://reqres.in/api/users/2");
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.getContentType());
	System.out.println(response.getHeaders());
	System.out.println(response.getBody().asString());
	}
}
