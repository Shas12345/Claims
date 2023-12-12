package claims;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class Verification_of_Dob_Field_In_Professional_Liability extends BaseClass {
	@Test
	public void dobFieldforProfessionalLiabilityClaim() throws InterruptedException {
		// Clicking on New Claim Button on RMS Home Page

		WebElement newClaim = driver.findElement(By.xpath("//span[contains(text(),'New Claim')]"));
		explicit.until(ExpectedConditions.elementToBeClickable(newClaim));
		softassert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'New Claim')]")).isDisplayed(),
				true, "New Claim Option is not provided in RMS Home Page");
		driver.findElement(By.xpath("//span[contains(text(),'New Claim')]")).click();
		extentTest.pass("Successfully verified New Claim Option in Left Nav Bar of RMS Home Page");

		// Clicking on Professional Liability Claim Option
		WebElement EEOCClaim = driver.findElement(By.partialLinkText("Professional Liability Claim"));
		explicit.until(ExpectedConditions.elementToBeClickable(EEOCClaim));
		softassert.assertEquals(driver.findElement(By.partialLinkText("Professional Liability Claim")).isDisplayed(), true,
				"Professional Liability Claim Option is not provided in RMS Home Page");
		driver.findElement(By.partialLinkText("Professional Liability Claim")).click();
		extentTest.pass(
				"Successfully verified Professional Liability Claim Option Under New Claim in Left Nav Bar of RMS Home Page");

		// Verifying Name Label and TextBox and Entering the data from Excel
		WebElement nameLabel = driver.findElement(By.xpath("//label[text()='Name']"));
		explicit.until(ExpectedConditions.elementToBeClickable(nameLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Name']")).isDisplayed(), true,
				"Name Label is not provided for New Professional Liability Claim ");
		extentTest.pass("Successfully verified Name Label for New Professional Liability Claim");

		WebElement nameTB = driver.findElement(By.id("Claimant"));
		explicit.until(ExpectedConditions.elementToBeClickable(nameTB));
		softassert.assertEquals(driver.findElement(By.id("Claimant")).isDisplayed(), true,
				"Name Text box is not provided for New Professional Liability Claim ");
		extentTest.pass("Successfully verified Name TextBox for New Professional Liability Claim");
		driver.findElement(By.id("Claimant")).sendKeys("John");
		String claimentName = driver.findElement(By.id("Claimant")).getAttribute("value");

		// Verifying DOB Label and TextBox and Entering the data from Excel
		WebElement dobLabel = driver.findElement(By.xpath("//label[text()='DOB']"));
		explicit.until(ExpectedConditions.elementToBeClickable(dobLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='DOB']")).isDisplayed(), true,
				"Date of Birth Label is not provided for New Professional Liability Claim ");
		extentTest.pass("Successfully verified Date of Birth Label for New Professional Liability Claim");

		WebElement dobTB = driver.findElement(By.id("DOB"));
		explicit.until(ExpectedConditions.elementToBeClickable(dobTB));
		softassert.assertEquals(driver.findElement(By.id("DOB")).isDisplayed(), true,
				"Date of Birth Text box is not provided for New Professional Liability Claim ");
		extentTest.pass("Successfully verified Date of Birth TextBox for New Professional Liability Claim");

		softassert.assertEquals(driver.findElement(By.id("DOB")).isDisplayed(), true,
				"DOB Text box is not provided for New Professional Liability Claim ");
		extentTest.pass("Successfully verified DOB TextBox for New Professional Liability Claim");
		driver.findElement(By.id("DOB")).sendKeys("12/06/1999");
		String dobonNewClaimPaage = driver.findElement(By.id("DOB")).getAttribute("value");

//Clicking on Submit button
		WebElement submitButton = driver.findElement(By.id("submitBtn"));
		explicit.until(ExpectedConditions.elementToBeClickable(submitButton));
		driver.findElement(By.id("submitBtn")).click();

//Navigating to Claim List and selecting the created Professional Liability Claim
		WebElement loadingEle = driver.findElement(By.id("claim_list_table_wrapper"));
		explicit.until(ExpectedConditions.visibilityOf(loadingEle));
		for (;;) {
			try {
				driver.findElement(By.xpath("//a[text()='" + claimentName + "']/../../..//i[@title='Claims Details']"))
						.click();
				break;
			} catch (Exception e) {
				basePg.getNextButton().click();
			}
		}

//Verifying Dob field in Claim Details Page
		String dobTBonDetailsPage = driver.findElement(By.id("DOB")).getAttribute("value");
		softassert.assertEquals(dobonNewClaimPaage, dobTBonDetailsPage,
				"DOB is not matching in Claim Details Page for Professional Liability Claim");
		extentTest.pass("Successfully verified DOB Data in Claim Details for General Liabiblty Claim");

//Editing Dob Field
		driver.findElement(By.id("DOB")).clear();
		driver.findElement(By.id("DOB")).sendKeys("14/04/1998");
		String dobDataonUpdate = driver.findElement(By.id("DOB")).getAttribute("value");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

//waiting until updation message conformation
		WebElement updationMsg = driver
				.findElement(By.xpath("//div[@class='bootstrap-growl alert alert-success alert-dismissible']"));
		explicit.until(ExpectedConditions.visibilityOf(updationMsg));
		extentTest.info(
				driver.findElement(By.xpath("//div[@class='bootstrap-growl alert alert-success alert-dismissible']"))
						.getText());

		String dobAfterUpdate = driver.findElement(By.id("DOB")).getAttribute("value");

		softassert.assertEquals(dobAfterUpdate, dobDataonUpdate,
				"DOB is not matching in Claim Details Page after updating for Professional Liability Claim");
		extentTest.pass("Successfully verified DOB Data in Claim Details after Updation for General Liabiblty Claim");

	}

}
