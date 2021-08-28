package com.assurity.ApiTechTests_RestAssured.Helpers;

import com.assurity.ApiTechTests_RestAssured.TestConfig.TestConfigurations;
import static org.hamcrest.Matchers.*;

public class ReusableComponents extends TestConfigurations {
	
	public void getResponseAndValidateStatus(int statusCode, String statusLine) {
		res.then().assertThat().statusCode(statusCode).and().statusLine(statusLine).log().all();
	}
	
	public void validateResponseValues(String key, Object assertionValue) {
		res.then().assertThat().body(key, equalTo(assertionValue));
	}
	
	public void validateResponseArrayValues(String key, Object assertionValue) {
		res.then().assertThat().body(key, hasItem(assertionValue));
	}
}
