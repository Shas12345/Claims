import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class AddingExpenseSettlemet extends BaseClass{
	
@Test
	public void submittingaEEOCForm() throws InterruptedException {
		
	WebElement claimList = driver.findElement(By.xpath("//span[contains(text(),'Claims')]"));
	explicit.until(ExpectedConditions.elementToBeClickable(claimList));
	driver.findElement(By.xpath("//span[contains(text(),'Claims')]")).click();
WebElement claims = driver.findElement(By.xpath("//a[text()='Adam']"));
explicit.until(ExpectedConditions.elementToBeClickable(claims));
driver.findElement(By.xpath("//a[text()='Adam']")).click();


WebElement manageExpenseSettlement = driver.findElement(By.partialLinkText("Manage Expense/Settlement"));
js.executeScript("arguments[0].scrollIntoView(true)", manageExpenseSettlement);
explicit.until(ExpectedConditions.elementToBeClickable(manageExpenseSettlement));

driver.findElement(By.partialLinkText("Manage Expense/Settlement")).click();
extentTest.pass("Successfully Clicked on Expense/Settlement section under EEOC Claims Details");

WebElement addExpenseButton = driver.findElement(By.xpath("//button[@onclick='addExpenseSettlement(13);']"));
js.executeScript("arguments[0].scrollIntoView(true)", addExpenseButton);
explicit.until(ExpectedConditions.visibilityOf(addExpenseButton));
extentTest.pass("Successfully Clicked on Add Expense/Settlement button under EEOC Claims Details");
driver.findElement(By.xpath("//button[@onclick='addExpenseSettlement(13);']")).click();
driver.findElement(By.xpath("(//h3[@class='header smaller lighter blue'])[5]"));

WebElement loadele = driver.findElement(By.xpath("(//h3[@class='header smaller lighter blue'])[5]"));
explicit.until(ExpectedConditions.visibilityOf(loadele));

//Verifying Payment type label and radio button

WebElement paymentType = driver.findElement(By.xpath("//label[text()='Payment Type']"));
explicit.until(ExpectedConditions.visibilityOf(paymentType));

softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Payment Type']")).isDisplayed(), true,
	"Payment Type Label is not provided for New EEOC Claim ");
extentTest.pass("Successfully verified Payment Type Label for New EEOC Claim");

driver.findElement(By.xpath("//input[@value='Expense']")).click();

//Invoice Number

WebElement invoiceNumber = driver.findElement(By.xpath("//label[text()='Invoice Number']"));
explicit.until(ExpectedConditions.visibilityOf(invoiceNumber));

softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Invoice Number']")).isDisplayed(), true,
	"Invoice Number Label is not provided for New EEOC Claim ");
extentTest.pass("Successfully verified Invoice Number Label for New EEOC Claim");

driver.findElement(By.id("InvoiceNumber")).sendKeys("123N123");
extentTest.pass("Successfully Entered Invoice Number Text box for New EEOC Claim");

//UnderWriter

WebElement underWriter = driver.findElement(By.xpath("//label[text()='Underwriter']"));
explicit.until(ExpectedConditions.visibilityOf(underWriter));

softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Underwriter']")).isDisplayed(), true,
	"UnderWriter Label is not provided for New EEOC Claim ");
extentTest.pass("Successfully verified UnderWriter Label for New EEOC Claim");

driver.findElement(By.id("Underwriter")).sendKeys("123N123");
extentTest.pass("Successfully Entered UnderWriter Text box for New EEOC Claim");

//Inv.Date

WebElement invDate = driver.findElement(By.xpath("//label[text()='Inv.Date']"));
explicit.until(ExpectedConditions.visibilityOf(invDate));

softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Inv.Date']")).isDisplayed(), true,
	"Inv.Date Label is not provided for New EEOC Claim ");
extentTest.pass("Successfully verified Inv.Date Label for New EEOC Claim");

driver.findElement(By.id("InvDate")).sendKeys("11/08/2023");
extentTest.pass("Successfully Entered InvDate Text box for New EEOC Claim");

//Inv.Date Paid
WebElement invPaidDate = driver.findElement(By.xpath("//label[text()='Inv.Date Paid']"));
explicit.until(ExpectedConditions.visibilityOf(invPaidDate));

softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Inv.Date Paid']")).isDisplayed(), true,
	"Inv.Date Paid Label is not provided for New EEOC Claim ");
extentTest.pass("Successfully verified Inv.Date Paid Label for New EEOC Claim");

driver.findElement(By.id("InvPaymentDate")).sendKeys("12/08/2023");
extentTest.pass("Successfully Entered InvDatePaid Text box for New EEOC Claim");

//Fees
WebElement fees = driver.findElement(By.xpath("//label[text()='Fees']"));
explicit.until(ExpectedConditions.visibilityOf(fees));

softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Fees']")).isDisplayed(), true,
	"Fees Label is not provided for New EEOC Claim ");
extentTest.pass("Successfully verified Fees Label for New EEOC Claim");

driver.findElement(By.id("InvPaymentDate")).sendKeys("20");
extentTest.pass("Successfully Entered Fees Text box for New EEOC Claim");

WebElement fileUploadonExp = driver.findElement(By.id("file"));
explicit.until(ExpectedConditions.elementToBeClickable(fileUploadonExp));
softassert.assertEquals(driver.findElement(By.id("file")).isDisplayed(), true,
	"File Choosen button is not provided for Add Expense/Settlement popup for EEOC Claim");
Reporter.log("File Choosen button is provided for Add Expense/Settlement popup for EEOC Claim", true);
extentTest.pass("File Choosen button is provided for Add Expense/Settlement popup for EEOC Claim");
driver.findElement(By.id("file"))
	.sendKeys("C:\\Users\\Admin\\git\\MDR\\MDR\\testData\\IncidentByMonth.Pdf");

//Clicking on save button
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

extentTest.pass("Successfully added a Expense/Settlement for EEOC Claim");

}
}
