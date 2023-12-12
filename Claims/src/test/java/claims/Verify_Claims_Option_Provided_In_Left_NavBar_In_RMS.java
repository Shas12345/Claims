package claims;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class Verify_Claims_Option_Provided_In_Left_NavBar_In_RMS extends BaseClass{
	@Test
	public void claimsOption() throws InterruptedException {
		//Verifying New Claims Dropdown and performing click action
		explicit.until(ExpectedConditions.elementToBeClickable(rmsPg.getNewClaimsLeftNavBar()));
		softassert.assertEquals(rmsPg.getNewClaimsLeftNavBar().isDisplayed(), true,
				"New Claims Dropdown is not displayed in the RMS Home page");
		extentTest.pass("New Claims Dropdown is provided in RMS Home page");
		rmsPg.getNewClaimsLeftNavBar().click();
		
		//Verifying All Three forms in  New Claims dropdown and performing click action
		explicit.until(ExpectedConditions.elementToBeClickable(rmsPg.getEeocClaim()));
		softassert.assertEquals(rmsPg.getEeocClaim().isDisplayed(), true,
				"New EEOC Claims option is not provided in the New Claims Dropdown in RMS Home Page");
		extentTest.pass("New EEOC Claims option is provided in the New Claims Dropdown in RMS Home Page");
		rmsPg.getEeocClaim().click();
		driver.navigate().back();
		rmsPg.getNewClaimsLeftNavBar().click();
		explicit.until(ExpectedConditions.elementToBeClickable(rmsPg.getGeneralLibClaim()));
		softassert.assertEquals(rmsPg.getGeneralLibClaim().isDisplayed(), true,
				"New General Liability Claims option is not provided in the New Claims Dropdown in RMS Home Page");
		extentTest.pass("New General Claim option is provided in the New Claims Dropdown in RMS Home Page");
		rmsPg.getGeneralLibClaim().click();
		driver.navigate().back();
		rmsPg.getNewClaimsLeftNavBar().click();
		explicit.until(ExpectedConditions.elementToBeClickable(rmsPg.getProfessionalLibClaim()));
		softassert.assertEquals(rmsPg.getGeneralLibClaim().isDisplayed(), true,
				"New Professional Liability Claims option is not provided in the New Claims Dropdown in RMS Home Page");
		extentTest.pass("New Professional Claim option is provided in the New Claims Dropdown in RMS Home Page");
		rmsPg.getProfessionalLibClaim().click();
		
		//Verifying Claims List Option is provided in RMS Home Page
		softassert.assertEquals(rmsPg.getClaimsList().isDisplayed(), true,
				"Claims option is not provided in Left Nav Bar of RMS Home Page");
		extentTest.pass("Claims option is provided in Left Nav Bar of RMS Home Page");
		rmsPg.getClaimsList().click();
		
		
		
		
	}

}