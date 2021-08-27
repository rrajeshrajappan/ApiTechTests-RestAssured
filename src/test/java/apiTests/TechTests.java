package apiTests;


import com.assurity.ApiTechTests_RestAssured.Helpers.ReusableComponents;

import org.testng.annotations.*;

public class TechTests extends ReusableComponents {

	@Test
	public void validateResponse() {
		getResponseAndValidateStatus();
	}
	
	@Test
	public void assertCarbonCreditsNameExists() {
		validateCarbonCreditsNameExists();		
	}
	
	@Test
	public void assertCanRelistIsTrue() {
		validateCanRelistIsTrue();
	}
	
	@Test
	public void assertPromotionNameandDescriptionValues() {
		validatePromotionNameandDescription();
	}
}
