package test;

 import static io.restassured.RestAssured.*;
 import static io.restassured.matcher.RestAssuredMatchers.*;
 import  static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Test2 {

	
	
	  @Test 
	  public void get_method() { 
		  baseURI="https://reqres.in/api";
		  given().get("/users/2").then().statusCode(200).log().all();
	  }
	 
	 
	
	@Test
	public void post_Method1()
	{
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", "vinay");
		map.put("job", "teamlead");
		
		System.out.println(map);
	}
	
	@Test
	public void post_method2()
	{
	JSONObject response=new JSONObject();
	response.put("name", "vinay_m");
	response.put("role", "team head");
	
	//System.out.println(response);
	
	given().accept(ContentType.JSON)
	.body(response.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	}
	

}
