package com.assurity.ApiTechTests_RestAssured.Helpers;

import com.assurity.ApiTechTests_RestAssured.TestConfig.TestConfigurations;
import static org.hamcrest.Matchers.*;

public class ReusableComponents extends TestConfigurations {
	
	public static void getResponseAndValidateStatus() {
		res.then().assertThat().statusCode(200).log().all();
	}
	
	public void validateCarbonCreditsNameExists() {
		res.then().assertThat().body("Name", equalTo("Carbon credits"));
	}
	
	public void validateCanRelistIsTrue() {
		res.then().assertThat().body("CanRelist", equalTo(true));
	}
	
	public void validatePromotionNameandDescription() {
		res.then().assertThat().body("Promotions.Name", hasItem("Gallery")).and()
		.body("Promotions.Description", hasItem("Good position in category"));
	}
}
