package apiTests;

import com.assurity.ApiTechTests_RestAssured.Helpers.ReusableComponents;
import org.testng.annotations.*;

public class TechTests extends ReusableComponents {
	
	@Parameters({"statusCode","statusLine"})
	@Test
	public void validateResponse(int statusCode, String statusLine) {
		getResponseAndValidateStatus(statusCode,statusLine);
	}
	
	@Parameters({"nameKey","nameAssertValue"})
	@Test
	public void assertCarbonCreditsNameExists(String key, String assertValue) {
		validateResponseValues(key,assertValue);		
	}
	
	@Parameters({"relistKey","relistAssertValue"})
	@Test
	public void assertCanRelistIsTrue(String relistkey, boolean relistassertValue) {
		validateResponseValues(relistkey,relistassertValue);
	}
	
	@Parameters({"promotionNameKey","promotionNameAssertValue"})
	@Test
	public void assertPromotionNameValues(String promotionNameKey, String promotionNameAssertValue) {
		validateResponseArrayValues(promotionNameKey,promotionNameAssertValue);
	}
	
	@Parameters({"promotionDescKey","promotionDescAssertValue"})
	@Test
	public void assertPromotionDescriptionValues(String promotionDescKey, String promotionDescAssertValue) {
		validateResponseArrayValues(promotionDescKey,promotionDescAssertValue);
	}
}
