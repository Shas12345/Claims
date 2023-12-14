package claims;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class Creating_a_EEOC_Claim extends BaseClass {
	ArrayList<String> expected = new ArrayList<String>();
	ArrayList<String> actual = new ArrayList<String>();

	@DataProvider
	public String[][] getData() {
		String[][] TestData = readDataForForms();
		return TestData;
	}

	@Test(dataProvider = "getData")
	public void submittingaEEOCForm(String info[]) throws InterruptedException {
		for (int i = 0; i < info.length; i++) {
			expected.add(info[i]);
		}

		// Clicking on New Claim Button on RMS Home Page

		WebElement newClaim = driver.findElement(By.xpath("//span[contains(text(),'New Claim')]"));
		explicit.until(ExpectedConditions.elementToBeClickable(newClaim));
		softassert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'New Claim')]")).isDisplayed(),
				true, "New Claim Option is not provided in RMS Home Page");
		driver.findElement(By.xpath("//span[contains(text(),'New Claim')]")).click();
		extentTest.pass("Successfully verified New Claim Option in Left Nav Bar of RMS Home Page");

		// Clicking on EEOC Option
		WebElement EEOCClaim = driver.findElement(By.partialLinkText("EEOC Claim"));
		explicit.until(ExpectedConditions.elementToBeClickable(EEOCClaim));
		softassert.assertEquals(driver.findElement(By.partialLinkText("EEOC Claim")).isDisplayed(), true,
				"EEOC Claim Option is not provided in RMS Home Page");
		driver.findElement(By.partialLinkText("EEOC Claim")).click();
		extentTest.pass("Successfully verified EEOC Claim Option Under New Claim in Left Nav Bar of RMS Home Page");

		// Verifying Name Label and TextBox and Entering the data from Excel
		WebElement nameLabel = driver.findElement(By.xpath("//label[text()='Name']"));
		explicit.until(ExpectedConditions.elementToBeClickable(nameLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Name']")).isDisplayed(), true,
				"Name Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Name Label for New EEOC Claim");

		WebElement nameTB = driver.findElement(By.id("Claimant"));
		explicit.until(ExpectedConditions.elementToBeClickable(nameTB));
		softassert.assertEquals(driver.findElement(By.id("Claimant")).isDisplayed(), true,
				"Name Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Name TextBox for New EEOC Claim");
		driver.findElement(By.id("Claimant")).sendKeys(info[0]);

		// Verifying dateofIncident Label and TextBox and Entering the data from Excel
		WebElement dateofIncidentLabel = driver.findElement(By.xpath("//label[text()='Date of Incident']"));
		explicit.until(ExpectedConditions.elementToBeClickable(dateofIncidentLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Date of Incident']")).isDisplayed(), true,
				"Date of Incident Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Date of Incident Label for New EEOC Claim");

		WebElement dateofIncidentTB = driver.findElement(By.id("DateOfIncident"));
		explicit.until(ExpectedConditions.elementToBeClickable(dateofIncidentTB));
		softassert.assertEquals(driver.findElement(By.id("DateOfIncident")).isDisplayed(), true,
				"Date of Incident Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Date of Incident TextBox for New EEOC Claim");
		driver.findElement(By.id("DateOfIncident")).clear();
		driver.findElement(By.id("DateOfIncident")).sendKeys(info[1]);

		// Verifying EnteredBy Label and TextBox and Entering the data from Excel
		WebElement enteredByLabel = driver.findElement(By.xpath("//label[text()='Entered By']"));
		explicit.until(ExpectedConditions.elementToBeClickable(enteredByLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Entered By']")).isDisplayed(), true,
				"Date of Entered By Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Date of Entered By Label for New EEOC Claim");

		WebElement enteredByTB = driver.findElement(By.id("ReportedBy"));
		explicit.until(ExpectedConditions.elementToBeClickable(enteredByTB));
		softassert.assertEquals(driver.findElement(By.id("ReportedBy")).isDisplayed(), true,
				"Entered By Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Entered By TextBox for New EEOC Claim");
		String enteredByValue = driver.findElement(By.id("ReportedBy")).getAttribute("value");
		Reporter.log("Captured Data of Entered By Text box in EEOC New Claim is " + enteredByValue);
		extentTest.info("Captured Data of Entered By Text box in EEOC New Claim is " + enteredByValue);

		// Verifying EEOC Number Label and TextBox and Entering the data from Excel
		WebElement eeocLabel = driver.findElement(By.xpath("//label[text()='EEOC #']"));
		explicit.until(ExpectedConditions.elementToBeClickable(eeocLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='EEOC #']")).isDisplayed(), true,
				"EEOC # Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified EEOC # Label for New EEOC Claim");

		WebElement eeocTB = driver.findElement(By.id("EECOCNumber"));
		explicit.until(ExpectedConditions.elementToBeClickable(eeocTB));
		softassert.assertEquals(driver.findElement(By.id("EECOCNumber")).isDisplayed(), true,
				"EEOC # Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified EEOC # TextBox for New EEOC Claim");
		driver.findElement(By.id("EECOCNumber")).sendKeys(info[3]);

		// Verifying Litigation Claim Number Label and TextBox and Entering the data
		// from Excel
		WebElement litigationClaimLabel = driver.findElement(By.xpath("//label[text()='Litigation Claim #']"));
		explicit.until(ExpectedConditions.elementToBeClickable(litigationClaimLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Litigation Claim #']")).isDisplayed(),
				true, "Litigation Claim # Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Litigation Claim # Label for New EEOC Claim");

		WebElement litigationClaimTB = driver.findElement(By.id("LitigationClaimNumber"));
		explicit.until(ExpectedConditions.elementToBeClickable(litigationClaimTB));
		softassert.assertEquals(driver.findElement(By.id("LitigationClaimNumber")).isDisplayed(), true,
				"Litigation Claim # Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Litigation Claim # TextBox for New EEOC Claim");
		driver.findElement(By.id("LitigationClaimNumber")).sendKeys(info[4]);

		/*
		 * // Verifying EEOC Status Label and Dropdown and selecting the Option from
		 * Excel WebElement eeocStatusLabel =
		 * driver.findElement(By.xpath("//label[text()='EEOC Status']"));
		 * explicit.until(ExpectedConditions.elementToBeClickable(eeocStatusLabel));
		 * softassert.assertEquals(driver.findElement(By.
		 * xpath("//label[text()='EEOC Status']")).isDisplayed(), true,
		 * "EEOC Status Label is not provided for New EEOC Claim ");
		 * extentTest.pass("Successfully verified EEOC Status Label for New EEOC Claim"
		 * );
		 * 
		 * WebElement eeocStatusDropdown =
		 * driver.findElement(By.xpath("LitigationStatus_chosen"));
		 * explicit.until(ExpectedConditions.elementToBeClickable(eeocStatusDropdown));
		 * WebElement statusOption =
		 * driver.findElement(By.xpath("//li[text()='Closed']"));
		 * explicit.until(ExpectedConditions.elementToBeClickable(statusOption));
		 * driver.findElement(By.xpath("//li[text()='Closed']")).click();
		 */

		// Verifying Date Filed Label and TextBox and Entering the data from Excel
		WebElement dateFiledLabel = driver.findElement(By.xpath("//label[text()='Date Filed']"));
		explicit.until(ExpectedConditions.elementToBeClickable(dateFiledLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Date Filed']")).isDisplayed(), true,
				"Date Filed Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Date Filed Label for New EEOC Claim");

		WebElement dateofFiledTB = driver.findElement(By.id("DateFiled"));
		explicit.until(ExpectedConditions.elementToBeClickable(dateofFiledTB));
		softassert.assertEquals(driver.findElement(By.id("DateFiled")).isDisplayed(), true,
				"Date Filed Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Date Filed TextBox for New EEOC Claim");
		driver.findElement(By.id("DateFiled")).clear();
		driver.findElement(By.id("DateFiled")).sendKeys(info[6]);

		// Policy Year

		// Verifying Date Closed Label and TextBox and Entering the data from Excel
		WebElement dateClosedLabel = driver.findElement(By.xpath("//label[text()='Date Closed']"));
		explicit.until(ExpectedConditions.elementToBeClickable(dateClosedLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Date Closed']")).isDisplayed(), true,
				"Date Closed Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Date Closed Label for New EEOC Claim");

		WebElement dateClosedTB = driver.findElement(By.id("DateClosed"));
		explicit.until(ExpectedConditions.elementToBeClickable(dateClosedTB));
		softassert.assertEquals(driver.findElement(By.id("DateClosed")).isDisplayed(), true,
				"Date Closed Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Date Closed TextBox for New EEOC Claim");
		driver.findElement(By.id("DateClosed")).sendKeys(info[7]);

		// Reading Data and Selecting incident department

		WebElement departmentDropdown = driver.findElement(By.id("DepartmentId_chosen"));

		data.handleDropdownByText(explicit, driver, departmentDropdown, info[8]);

		/*
		 * WebElement departmentLabel =
		 * driver.findElement(By.xpath("//label[text()='Department']"));
		 * explicit.until(ExpectedConditions.elementToBeClickable(departmentLabel));
		 * softassert.assertEquals(driver.findElement(By.xpath(
		 * "//label[text()='Department']")).isDisplayed(), true,
		 * "Department Label is not provided for New EEOC Claim ");
		 * extentTest.pass("Successfully verified Department Label for New EEOC Claim");
		 * 
		 * WebElement departmentDropdown = driver.findElement(By.id("Department"));
		 * explicit.until(ExpectedConditions.elementToBeClickable(departmentDropdown));
		 * driver.findElement(By.id("Department")).click(); for (;;) { try { WebElement
		 * dropdownOption =
		 * driver.findElement(By.xpath("//span[text()='"+info[8]+"']"));
		 * explicit.until(ExpectedConditions.elementToBeClickable(dropdownOption));
		 * driver.findElement(By.xpath("//span[text()='Berea']")).click(); break; }
		 * catch (Exception e) { WebElement dropdownOption =
		 * driver.findElement(By.xpath("//span[text()='"+info[8]+"']"));
		 * js.executeScript("arguments[0].scrollIntoView(false)", dropdownOption);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * driver.findElement(By.xpath("//span[text()='OK']")).click();
		 */
		softassert.assertEquals(driver.findElement(By.id("DepartmentId_chosen")).isDisplayed(), true,
				"Department Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Department TextBox for New EEOC Claim");

		// Verifying Attorney Label and TextBox and Entering the data from Excel
		WebElement attorneyLabel = driver.findElement(By.xpath("//label[text()='Attorney']"));
		explicit.until(ExpectedConditions.elementToBeClickable(attorneyLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Attorney']")).isDisplayed(), true,
				"Attorney Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Attorney Label for New EEOC Claim");

		WebElement attorneyTB = driver.findElement(By.id("Attorney"));
		explicit.until(ExpectedConditions.elementToBeClickable(attorneyTB));
		softassert.assertEquals(driver.findElement(By.id("Attorney")).isDisplayed(), true,
				"Attorney Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Attorney TextBox for New EEOC Claim");
		driver.findElement(By.id("Attorney")).sendKeys(info[9]);

		// Discription Charge
		WebElement discriptionCharge = driver.findElement(By.id("DiscriminationCharge_chosen"));
		data.handleDropdownByText(explicit, driver, discriptionCharge, "Age Discrimination");

		softassert.assertEquals(driver.findElement(By.id("DiscriminationCharge_chosen")).isDisplayed(), true,
				"Discrimination Charge Dropdown is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Discrimination Charge Dropdown for New EEOC Claim");

		// Verifying Full Description Report Label and TextBox and Entering the data
		// from Excel
		WebElement fullDescriptionReportLabel = driver
				.findElement(By.xpath("//label[text()='Full Description Report']"));
		explicit.until(ExpectedConditions.elementToBeClickable(fullDescriptionReportLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Full Description Report']")).isDisplayed(),
				true, "Full Description Report Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Full Description Report Label for New EEOC Claim");

		WebElement fullDescriptionReportTB = driver.findElement(By.id("FullDescriptionReport"));
		explicit.until(ExpectedConditions.elementToBeClickable(fullDescriptionReportTB));
		softassert.assertEquals(driver.findElement(By.id("FullDescriptionReport")).isDisplayed(), true,
				"Full Description Report Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Full Description Report TextBox for New EEOC Claim");
		driver.findElement(By.id("FullDescriptionReport")).sendKeys(info[10]);

		// Verifying Settlement Reserve Label and TextBox and Entering the data from
		// Excel
		WebElement settlementReserveLabel = driver.findElement(By.xpath("//label[text()='Settlement Reserve']"));
		explicit.until(ExpectedConditions.elementToBeClickable(settlementReserveLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Settlement Reserve']")).isDisplayed(),
				true, "Settlement Reserve Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Settlement Reserve Label for New EEOC Claim");

		WebElement settlementReserveTB = driver.findElement(By.id("CompensationReserve"));
		explicit.until(ExpectedConditions.elementToBeClickable(settlementReserveTB));
		softassert.assertEquals(driver.findElement(By.id("CompensationReserve")).isDisplayed(), true,
				"Settlement Reserve Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Settlement Reserve TextBox for New EEOC Claim");
		driver.findElement(By.id("CompensationReserve")).sendKeys(info[11]);

		// Verifying Expense Reserve Label and TextBox and Entering the data from Excel
		WebElement expenseReserveLabel = driver.findElement(By.xpath("//label[text()='Expense Reserve']"));
		explicit.until(ExpectedConditions.elementToBeClickable(expenseReserveLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Expense Reserve']")).isDisplayed(), true,
				"Settlement Reserve Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Settlement Reserve Label for New EEOC Claim");

		WebElement expenseReserveTB = driver.findElement(By.id("ExpenseReserve"));
		explicit.until(ExpectedConditions.elementToBeClickable(expenseReserveTB));
		softassert.assertEquals(driver.findElement(By.id("ExpenseReserve")).isDisplayed(), true,
				"Settlement Reserve Text box is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Settlement Reserve TextBox for New EEOC Claim");
		driver.findElement(By.id("ExpenseReserve")).sendKeys(info[12]);

		// Verifying Total Label and TextBox and Entering the data from Excel
		WebElement totalLabel = driver.findElement(By.xpath("//label[text()='Total']"));
		explicit.until(ExpectedConditions.elementToBeClickable(totalLabel));
		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Total']")).isDisplayed(), true,
				"Settlement Reserve Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Settlement Reserve Label for New EEOC Claim");

		/*
		 * WebElement totalLabelTB = driver.findElement(By.id("Total"));
		 * explicit.until(ExpectedConditions.elementToBeClickable(totalLabelTB));
		 * softassert.assertEquals(driver.findElement(By.id("Total")).isDisplayed(),
		 * true, "Settlement Reserve Text box is not provided for New EEOC Claim ");
		 * extentTest.
		 * pass("Successfully verified Settlement Reserve TextBox for New EEOC Claim");
		 * driver.findElement(By.id("Total")).sendKeys(info[13]);
		 */

		// Clicking on Submit button
		WebElement submitButton = driver.findElement(By.id("submitBtn"));
		explicit.until(ExpectedConditions.elementToBeClickable(submitButton));
		driver.findElement(By.id("submitBtn")).click();

		// Navigating to Claim List and selecting the created EEOC Claim
		WebElement loadingEle = driver.findElement(By.id("claim_list_table_wrapper"));
		explicit.until(ExpectedConditions.visibilityOf(loadingEle));
		for (;;) {
			try {
				driver.findElement(By.xpath("//a[text()='" + info[0] + "']/../../..//i[@title='Attachments']")).click();
				break;
			} catch (Exception e) {
				basePg.getNextButton().click();
			}
		}

		// Adding an attachment and deleting it
		WebElement addButtononattachment = driver.findElement(By.xpath("//button[text()='Add']"));
		explicit.until(ExpectedConditions.visibilityOf(addButtononattachment));
		driver.findElement(By.xpath("//button[text()='Add']")).click();

//Verifying Title Textbox on Attachment Popup
		WebElement titleTb = driver.findElement(By.id("Title"));
		explicit.until(ExpectedConditions.elementToBeClickable(titleTb));
		softassert.assertEquals(titleTb.isDisplayed(), true,
				"Title Textbox is not provided for attachment popup for EEOC Claim");
		Reporter.log("Title Textbox is provided for attachment popup", true);
		extentTest.pass("Title Textbox is provided for attachment popup for EEOC Claim");
		driver.findElement(By.id("Title")).sendKeys("SampleTest");

		// Verifying File Choosen Button on Attachment Popup

		WebElement fileUpload = driver.findElement(By.id("file"));
		explicit.until(ExpectedConditions.elementToBeClickable(fileUpload));
		softassert.assertEquals(fileUpload.isDisplayed(), true,
				"File Choosen button is not provided for attachment popup for EEOC Claim");
		Reporter.log("File Choosen button is provided for attachment popup for EEOC Claim", true);
		extentTest.pass("File Choosen button is provided for attachment popup for EEOC Claim");
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\Admin\\git\\MDR\\MDR\\testData\\IncidentByMonth.Pdf");

//Verifying Upload button on Attachment Popup

		WebElement uploadButton = driver.findElement(By.id("Upload"));
		explicit.until(ExpectedConditions.elementToBeClickable(uploadButton));
		softassert.assertEquals(uploadButton.isDisplayed(), true,
				"File Upload button is not provided for attachment popup for EEOC Claim");
		Reporter.log("File Upload button is provided for attachment popup for EEOC Claim", true);
		extentTest.pass("File Upload button is provided for attachment popup for EEOC Claim");
		driver.findElement(By.id("Upload")).click();

		Reporter.log("Sucessfully Added a attachment to the EEOC Claim", true);
		extentTest.pass("Sucessfully Added a attachment to the EEOC Claim");

//Deleting an added attachment
		for (;;) {
			try {
				driver.findElement(By.xpath("//a[text()='" + info[0] + "']/../../..//i[@title='Attachments']"));
				break;
			} catch (Exception e) {
				basePg.getNextButton().click();
			}
		}
		WebElement arrowButton1 = driver
				.findElement(By.xpath("//a[text()='" + info[0] + "']/../../..//i[@title='Attachments']"));
		softassert.assertEquals(arrowButton1.isDisplayed(), true,
				"Attachment button is not provided for EEOC Claim in Claim list page");
		Reporter.log("Verifyed action arrow button for EEOC Claim in Claim list page", true);
		extentTest.info("Verifyed attachment icon button under Actions for EEOC Claim in Claim list page");
		driver.findElement(By.xpath("//a[text()='" + info[0] + "']/../../..//i[@title='Attachments']")).click();

		// driver.findElement(By.xpath("(//a[contains(text(),'Attachments')])[3]")).click();

		WebElement deleteButton = driver.findElement(By.xpath("//a[text()='SampleTest']/../..//i"));
		explicit.until(ExpectedConditions.elementToBeClickable(deleteButton));
		softassert.assertEquals(deleteButton.isDisplayed(), true,
				"Delete button is not provided for attachment popup for EEOC Claim");
		Reporter.log("Delete button is provided for attachment popup for EEOC Claim", true);
		extentTest.pass("Delete button is provided for attachment popup for EEOC Claim");
		driver.findElement(By.xpath("//a[text()='SampleTest']/../..//i")).click();

		WebElement attachmentMsg = driver
				.findElement(By.xpath("//div[@class='bootstrap-growl alert alert-success alert-dismissible']"));

		String attachmentInfo = attachmentMsg.getText();
		Reporter.log("Attachement removed Successfully for EEOC Claim" + attachmentInfo, true);
		extentTest.pass("Attachement removed Successfully for EEOC Claim" + attachmentInfo);

		// Adding expense/Settlement

		for (;;) {
			try {
				driver.findElement(By.xpath("//a[text()='" + info[0] + "']")).click();
				break;
			} catch (Exception e) {
				basePg.getNextButton().click();
			}
		}
		WebElement claimDetailCollapse = driver.findElement(By.partialLinkText("Claim Details"));
		explicit.until(ExpectedConditions.elementToBeClickable(claimDetailCollapse));
		driver.findElement(By.partialLinkText("Claim Details")).click();

		WebElement manageExpenseSettlement = driver.findElement(By.partialLinkText("Manage Expense/Settlement Paid"));
		explicit.until(ExpectedConditions.elementToBeClickable(manageExpenseSettlement));
		js.executeScript("arguments[0].scrollIntoView(true)", manageExpenseSettlement);

		driver.findElement(By.partialLinkText("Manage Expense/Settlement Paid")).click();
		extentTest.pass("Successfully Clicked on Expense/Settlement section under EEOC Claims Details");

		WebElement addExpenseButton = driver
				.findElement(By.xpath("(//button[contains(@class,'btn btn-sm btn-success btn-white btn-round')])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)", addExpenseButton);
		explicit.until(ExpectedConditions.elementToBeClickable(addExpenseButton));
		extentTest.pass("Successfully Clicked on Add Expense/Settlement button under EEOC Claims Details");
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-sm btn-success btn-white btn-round')])[1]"))
				.click();
		driver.findElement(By.xpath("(//h3[@class='header smaller lighter blue'])[5]"));

		WebElement loadele = driver.findElement(By.xpath("(//h3[@class='header smaller lighter blue'])[5]"));
		explicit.until(ExpectedConditions.visibilityOf(loadele));

		// Verifying Payment type label and radio button

		WebElement paymentType = driver.findElement(By.xpath("//label[text()='Payment Type']"));
		explicit.until(ExpectedConditions.visibilityOf(paymentType));

		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Payment Type']")).isDisplayed(), true,
				"Payment Type Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Payment Type Label for New EEOC Claim");

		driver.findElement(By.xpath("//input[@value='Expense']")).click();

		// Invoice Number

		WebElement invoiceNumber = driver.findElement(By.xpath("//label[text()='Invoice Number']"));
		explicit.until(ExpectedConditions.visibilityOf(invoiceNumber));

		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Invoice Number']")).isDisplayed(), true,
				"Invoice Number Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Invoice Number Label for New EEOC Claim");

		driver.findElement(By.id("InvoiceNumber")).sendKeys("123N123");
		String invoiceNumberData = driver.findElement(By.id("InvoiceNumber")).getAttribute("value");

		extentTest.pass("Successfully Entered Invoice Number Text box for New EEOC Claim");

		// UnderWriter

		WebElement attorney = driver.findElement(By.xpath("//label[@for='Underwriter']"));
		explicit.until(ExpectedConditions.visibilityOf(attorney));

		softassert.assertEquals(driver.findElement(By.xpath("//label[@for='Underwriter']")).isDisplayed(), true,
				"Attorney Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Attorney Label for New EEOC Claim");

		driver.findElement(By.id("Underwriter")).sendKeys("123N123");
		String attorneyonAddPopup = driver.findElement(By.id("Underwriter")).getAttribute("value");
		extentTest.pass("Successfully Entered UnderWriter Text box for New EEOC Claim");

		// Inv.Date

		WebElement invDate = driver.findElement(By.xpath("//label[text()='Inv.Date']"));
		explicit.until(ExpectedConditions.visibilityOf(invDate));

		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Inv.Date']")).isDisplayed(), true,
				"Inv.Date Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Inv.Date Label for New EEOC Claim");

		driver.findElement(By.id("InvDate")).clear();
		driver.findElement(By.id("InvDate")).sendKeys("11/08/2023");
		String invDateDataonAddPopup = driver.findElement(By.id("InvDate")).getAttribute("value");
		extentTest.pass("Successfully Entered InvDate Text box for New EEOC Claim");

		// Inv.Date Paid WebElement invPaidDate =
		WebElement invPaidDate = driver.findElement(By.xpath("//label[text()='Inv.Date Paid']"));
		explicit.until(ExpectedConditions.visibilityOf(invPaidDate));

		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Inv.Date Paid']")).isDisplayed(), true,
				"Inv.Date Paid Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Inv.Date Paid Label for New EEOC Claim");

		driver.findElement(By.id("InvPaymentDate")).sendKeys("12/08/2023");
		String invDatePaidDataonAddPopup = driver.findElement(By.id("InvPaymentDate")).getAttribute("value");
		extentTest.pass("Successfully Entered InvDatePaid Text box for New EEOC Claim");

		// Fees WebElement fees =
		WebElement fees = driver.findElement(By.xpath("//label[text()='Fees']"));
		explicit.until(ExpectedConditions.visibilityOf(fees));

		softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Fees']")).isDisplayed(), true,
				"Fees Label is not provided for New EEOC Claim ");
		extentTest.pass("Successfully verified Fees Label for New EEOC Claim");

		driver.findElement(By.id("Fees")).sendKeys("20");
		String feesDataonAddPopup = driver.findElement(By.id("Fees")).getAttribute("value");

		extentTest.pass("Successfully Entered Fees Text box for New EEOC Claim");

		WebElement fileUploadonExp = driver.findElement(By.id("file"));
		explicit.until(ExpectedConditions.elementToBeClickable(fileUploadonExp));
		softassert.assertEquals(driver.findElement(By.id("file")).isDisplayed(), true,
				"File Choosen button is not provided for Add Expense/Settlement popup for EEOC Claim");
		Reporter.log("File Choosen button is provided for Add Expense/Settlement popup for EEOC Claim", true);
		extentTest.pass("File Choosen button is provided for Add Expense/Settlement popup for EEOC Claim");
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\Admin\\git\\MDR\\MDR\\testData\\IncidentByMonth.Pdf");

		// Clicking on save button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		extentTest.pass("Successfully added a Expense/Settlement for EEOC Claim");

		// Editing a Added Expense/Settlement

		WebElement ManageExpense = driver.findElement(By.partialLinkText("Manage Expense/Settlement Paid"));
		explicit.until(ExpectedConditions.elementToBeClickable(ManageExpense));
		driver.findElement(By.partialLinkText("Manage Expense/Settlement Paid")).click();

		// Verifiying Invoice Number
		WebElement editExpense = driver
				.findElement(By.xpath("//a[text()='" + invoiceNumberData + "']/../../..//i[@title='Edit expense']"));
		explicit.until(ExpectedConditions.elementToBeClickable(editExpense));
		driver.findElement(By.xpath("//a[text()='" + invoiceNumberData + "']/../../..//i[@title='Edit expense']"))
				.click();

		String invoiceOnEditPage = driver.findElement(By.id("InvoiceNumber")).getAttribute("value");

		softassert.assertEquals(invoiceNumberData, invoiceOnEditPage,
				"Invoice number is not Matching on Edit Manage Expense/Settlement popup");
		extentTest.pass("Invoice Data is Matched on Edit Expense/Settlement popup");

		// Verifying Attorney
		String attorneyOnEditPopup = driver.findElement(By.id("Underwriter")).getAttribute("value");
		softassert.assertEquals(attorneyonAddPopup, attorneyOnEditPopup,
				"Attorney is not Matching on Edit Manage Expense/Settlement popup");
		extentTest.pass("Attorney Data is Matched on Edit Expense/Settlement popup");

//Verifying Inv Date
		String invDateonEditPopup = driver.findElement(By.id("InvDate")).getAttribute("value");
		softassert.assertEquals(invDateDataonAddPopup, invDateonEditPopup,
				"InvDate is not Matching on Edit Manage Expense/Settlement popup");
		extentTest.pass("InvDate Data is Matched on Edit Expense/Settlement popup");

//Verifying Inv.Date Paid
		String invDatePaidonEditPage = driver.findElement(By.id("InvPaymentDate")).getAttribute("value");
		softassert.assertEquals(invDatePaidDataonAddPopup, invDatePaidonEditPage,
				"InvDatePaid is not Matching on Edit Manage Expense/Settlement popup");
		extentTest.pass("InvDatePaid Data is Matched on Edit Expense/Settlement popup");

//Verifying Fees 
		String feesonEditPopup = driver.findElement(By.id("Fees")).getAttribute("value");
		softassert.assertEquals(feesDataonAddPopup, feesonEditPopup,
				"Fees is not Matching on Edit Manage Expense/Settlement popup");
		extentTest.pass("Fees Data is Matched on Edit Expense/Settlement popup");

//Editing Fees data and save it 
		driver.findElement(By.id("Fees")).clear();
		driver.findElement(By.id("Fees")).sendKeys("40");
		extentTest.pass("Sucessfully edited Fees Data is on Edit Expense/Settlement popup");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		//Deleting an added Manage Expense/Settlement 
		WebElement ManageExpensetoDelete = driver.findElement(By.partialLinkText("Manage Expense/Settlement Paid"));
		explicit.until(ExpectedConditions.elementToBeClickable(ManageExpensetoDelete));
		driver.findElement(By.partialLinkText("Manage Expense/Settlement Paid")).click();
		
		WebElement deleteExpense = driver
				.findElement(By.xpath("//a[text()='" + invoiceNumberData + "']/../../..//i[@title='Delete']"));
		explicit.until(ExpectedConditions.elementToBeClickable(deleteExpense));
		driver.findElement(By.xpath("//a[text()='" + invoiceNumberData + "']/../../..//i[@title='Delete']"))
				.click();
		
	WebElement yesButton = driver.findElement(By.xpath("//span[text()='YES']"));
	explicit.until(ExpectedConditions.elementToBeClickable(yesButton));
	driver.findElement(By.xpath("//span[text()='YES']")).click();
	
	
WebElement deletePopup = driver.findElement(By.xpath("//div[@class='bootstrap-growl alert alert-success alert-dismissible']"));
explicit.until(ExpectedConditions.elementToBeClickable(deletePopup));
extentTest.pass("Sucessfully deleted added Manage Expense/Settlement");


//Adding Manage Expense/Settlement Reserve

WebElement expenseReserve = driver.findElement(By.partialLinkText("Manage Expense/Settlement Reserve"));
explicit.until(ExpectedConditions.elementToBeClickable(expenseReserve));
driver.findElement(By.partialLinkText("Manage Expense/Settlement Reserve")).click();

//clicking on add Reserve Button
WebElement addReserveButton = driver.findElement(By.xpath("(//button[contains(@class,'btn btn-sm btn-success btn-white btn-round')])[2]"));
explicit.until(ExpectedConditions.elementToBeClickable(addReserveButton));
driver.findElement(By.xpath("(//button[contains(@class,'btn btn-sm btn-success btn-white btn-round')])[2]")).click();
softassert.assertEquals(driver.findElement(By.xpath("(//button[contains(@class,'btn btn-sm btn-success btn-white btn-round')])[2]")).isDisplayed(), true,
		"Add Reserve Button is not provided in Manage Expense/Settlement Reserve");
extentTest.pass("Successfully verified Inv.Date Label for New EEOC Claim");
extentTest.pass("Sucessfully Clicked Add Reserve Button");

//Add Reserve Popup

WebElement reserveType = driver.findElement(By.xpath("//label[text()='ReserveType']"));
explicit.until(ExpectedConditions.elementToBeClickable(reserveType));
softassert.assertEquals(driver.findElement(By.xpath("//label[text()='ReserveType']")).isDisplayed(), true,
		"Reserve Type Label is not provided in Add Reserve Popup");
extentTest.pass("Sucessfully Verified Reserve Type Label in  Add Reserve popup");

//Selecting Expense Radio button
driver.findElement(By.xpath("//input[@id='ReserveType' and @value = 'Expense']")).click();

//Verifying Date Label
WebElement Date = driver.findElement(By.xpath("//label[text()='Date']"));
explicit.until(ExpectedConditions.elementToBeClickable(Date));
softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Date']")).isDisplayed(), true,
		"Date Label is not provided in Add Reserve Popup");
extentTest.pass("Sucessfully Verified Date Label in Add Reserve popup");

driver.findElement(By.id("PaymentDate")).clear();
driver.findElement(By.id("PaymentDate")).sendKeys("12/09/2023");
String dateonAddReservePage = driver.findElement(By.id("PaymentDate")).getAttribute("value");
extentTest.pass("Sucessfully Entered Date Text Box in Add Reserve popup");


//Verifying Reserve Label

WebElement Reserve = driver.findElement(By.xpath("//label[text()='Reserve']"));
explicit.until(ExpectedConditions.elementToBeClickable(Date));
softassert.assertEquals(driver.findElement(By.xpath("//label[text()='Reserve']")).isDisplayed(), true,
		"Reserve Label is not provided in Add Reserve Popup");
extentTest.pass("Sucessfully Verified Reserve Label in Add Reserve popup");

driver.findElement(By.id("Reserve")).sendKeys("400000");
String reserveonAddReservePage = driver.findElement(By.id("Reserve")).getAttribute("value");
extentTest.pass("Sucessfully Entered Reserve Text Box in Add Reserve popup");

//Clicking on Save Button
WebElement saveButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
explicit.until(ExpectedConditions.elementToBeClickable(saveButton));
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
extentTest.pass("Sucessfully Added a Expense/Settlement Reserve ");

//Edit Expense/Settlement Reserve

WebElement expenseReserveforEdit = driver.findElement(By.partialLinkText("Manage Expense/Settlement Reserve"));
explicit.until(ExpectedConditions.elementToBeClickable(expenseReserveforEdit));
driver.findElement(By.partialLinkText("Manage Expense/Settlement Reserve")).click();


WebElement editReserve = driver.findElement(By.xpath("//span[text()='"+reserveonAddReservePage+"']/../..//i[@title='Edit expense']"));
explicit.until(ExpectedConditions.elementToBeClickable(editReserve));
driver.findElement(By.xpath("//span[text()='"+reserveonAddReservePage+"']/../..//i[@title='Edit expense']")).click();

String dateonEditReservePopup = driver.findElement(By.id("PaymentDate")).getAttribute("value");
softassert.assertEquals(dateonAddReservePage, dateonEditReservePopup,"Date data is not matching on Edit Reserve Popup");

extentTest.pass("Sucessfully verified Date data on Edit Reserve Popup");

String reserveonEditReservePopup = driver.findElement(By.id("Reserve")).getAttribute("value");
softassert.assertEquals(reserveonAddReservePage, reserveonEditReservePopup,"Reserve data is not matching on Edit Reserve Popup");

extentTest.pass("Sucessfully verified Reserve data on Edit Reserve Popup");

//Changing Reserve data and updating
driver.findElement(By.id("Reserve")).clear();
 driver.findElement(By.id("Reserve")).sendKeys("578785");
 String reserveDataonEditReservePage = driver.findElement(By.id("Reserve")).getAttribute("value");
 extentTest.pass("Sucessfully Edited Manage Reserve/Settlemetn data on Edit Reserve Popup");
 
WebElement saveButtonforEditReserve = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
explicit.until(ExpectedConditions.elementToBeClickable(saveButtonforEditReserve));
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

WebElement expenseReserveforDelete = driver.findElement(By.partialLinkText("Manage Expense/Settlement Reserve"));
explicit.until(ExpectedConditions.elementToBeClickable(expenseReserveforDelete));
driver.findElement(By.partialLinkText("Manage Expense/Settlement Reserve")).click();

WebElement deleteReserve = driver.findElement(By.xpath("//span[text()='"+reserveDataonEditReservePage+"']/../..//i[@title='Delete']"));
explicit.until(ExpectedConditions.elementToBeClickable(deleteReserve));
driver.findElement(By.xpath("//span[text()='"+reserveDataonEditReservePage+"']/../..//i[@title='Delete']")).click();

driver.findElement(By.xpath("//span[text()='YES']")).click();

WebElement deletePopupforExpenseReserve = driver.findElement(By.xpath("//div[@class='bootstrap-growl alert alert-success alert-dismissible']"));
explicit.until(ExpectedConditions.elementToBeClickable(deletePopupforExpenseReserve));
extentTest.pass("Sucessfully deleted added Manage Expense/Settlement Reserve");










		
		
		
		

	}

	@DataProvider
	public String[][] readDataForForms() {
		String[][] data = null;
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("C:\\Users\\Admin\\git\\MDR\\MDR\\testData\\MDRTestData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workBook.getSheet("EEOCClaim");
		DataFormatter formatter = new DataFormatter();

		// Get Administrative number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		// Get Administrative number of cells
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		data = new String[rows - 1][cells];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				String cellData = formatter.formatCellValue(sheet.getRow(i).getCell(j));
				data[i - 1][j] = cellData;
			}

		}
		return data;
	}
}