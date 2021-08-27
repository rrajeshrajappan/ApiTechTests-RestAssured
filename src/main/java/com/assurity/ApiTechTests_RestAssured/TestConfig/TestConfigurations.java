package com.assurity.ApiTechTests_RestAssured.TestConfig;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestConfigurations {
	public static String baseUrl = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
	public static Response res = get(baseUrl);
}
