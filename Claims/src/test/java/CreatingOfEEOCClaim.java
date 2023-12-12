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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class CreatingOfEEOCClaim extends BaseClass {
	ArrayList<String> expected = new ArrayList<String>();
	ArrayList<String> actual = new ArrayList<String>();

	
	@DataProvider
	public String[][] getData() {
		String[][] TestData = readDataForForms();
		return TestData;
	}
		@Test(dataProvider = "getData")
		public void newEEOCClaim(String info[]) throws InterruptedException {
			for (int i = 0; i < info.length; i++) {
				expected.add(info[i]);
			}
			
			
			explicit.until(ExpectedConditions.elementToBeClickable(rmsPg.getNewClaimsLeftNavBar()));
			rmsPg.getNewClaimsLeftNavBar().click();
			explicit.until(ExpectedConditions.visibilityOf(rmsPg.getEeocClaim()));
			rmsPg.getEeocClaim().click();
			// Capturing the EEOC Claim Number from the TextBox
			explicit.until(ExpectedConditions.visibilityOf(eeocClaim.getCliamNumberTextbox()));
			String claimNumber = eeocClaim.getCliamNumberTextbox().getAttribute("value");
			Reporter.log("The claim Number captured is " + claimNumber, true);
			extentTest.info("The claim Number captured is " + claimNumber);
			expected.add(0, claimNumber);
			
			//Reading the data from excel and selecting the date for Date of Incident
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getDateOfIncidentTextbox()));
			eeocClaim.getDateOfIncidentTextbox().clear();
			eeocClaim.getDateOfIncidentTextbox().sendKeys(info[0]);
			
			//Reading the data from excel and selecting the name for Claimant
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getClaimantTextbox()));
			eeocClaim.getClaimantTextbox().sendKeys(info[1]);
			
			//Reading the data from excel and entering the Number for EEOCNumber
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.geteEOCNumberTextbox()));
			eeocClaim.geteEOCNumberTextbox().sendKeys(info[2]);
			
			//Reading the data from excel and entering the Number for LitigationNumber
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getLitigationClaimNumberTextbox()));
			eeocClaim.getLitigationClaimNumberTextbox().sendKeys(info[3]);
			
			//Reading the data from excel and selecting the status for LitigationStatus
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getLitigationStatusDropdown()));
			eeocClaim.getLitigationStatusDropdown().click();
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getSearchBoxForLitigationStatus()));
			//driver.findElement(By.xpath("//li[text()='"+info[4]+"']")).click();
		//	eeocClaim.getSearchBoxForLitigationStatus().sendKeys(info[4]);
			//eeocClaim.getSearchBoxForLitigationStatus().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			
			Thread.sleep(3000);
			//Reading the data from excel and selecting the date for Date Filed
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getDateFiledTextbox()));
			eeocClaim.getDateFiledTextbox().clear();
			eeocClaim.getDateFiledTextbox().sendKeys(info[5]);
			
			//Reading the data from excel and selecting the year for Policy Year
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getPolicyYearDropdown()));
			eeocClaim.getPolicyYearDropdown().click();
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getSearchBoxForPolicyYear()));
		WebElement scrollEle = driver.findElement(By.xpath("//li[text()='"+info[6]+"']"));
			js.executeScript("arguments[0].scrollIntoView(false)", scrollEle);
			driver.findElement(By.xpath("//li[text()='"+info[6]+"']")).click();
		//	eeocClaim.getSearchBoxForPolicyYear().sendKeys(Keys.ENTER);
			
			
			
			//Reading the data from excel and selecting the date for Date Closed
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getDateClosedTextbox()));
			eeocClaim.getDateClosedTextbox().sendKeys(info[7]);
			
			//Reading the data from excel and selecting the department
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getDepartmentIcon()));
			eeocClaim.getDepartmentIcon().click();
		Thread.sleep(3000);
	//	explicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='"+info[8]+"'])[2]/..")));
			driver.findElement(By.xpath("(//span[text()='"+info[8]+"'])[2]/..")).click();
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getOkButton()));
			eeocClaim.getOkButton().click();
			
			//Reading the data from excel and selecting the Name for Attorney
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getAttorneyTextbox()));
			eeocClaim.getAttorneyTextbox().sendKeys(info[9]);
			
			//Reading the data from excel and entering the Name for Discrimination Charge
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getDescriminationChargeTextbox()));
			eeocClaim.getDescriminationChargeTextbox().sendKeys(info[10]);
			
			//Reading the data from excel and entering the amount for Settlement Reserve
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getCompensationReserveTextbox()));
			eeocClaim.getCompensationReserveTextbox().sendKeys(info[10]);
			
			//Reading the data from excel and entering the amount for Settlement Reserve
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getExpenseReserveTextbox()));
			eeocClaim.getExpenseReserveTextbox().sendKeys(info[11]);
			
			//Clicking on Submit Button
			explicit.until(ExpectedConditions.elementToBeClickable(eeocClaim.getSubmitButton()));
			eeocClaim.getSubmitButton().click();
			
			
			
				
			}
	
	@DataProvider
	public String[][] readDataForForms() {
		String[][] data = null;
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Claims\\TestData\\ClaimsData.xlsx");
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
		Sheet sheet = workBook.getSheet("EEOC");
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
