package Generic_Liberary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

/***
 * 
 * @author Shashank
 *
 */

public class ReadData {
	public ExtentReports extentReports;
	public ExtentTest extentTest;

	/**
	 * This method helps us to read data from property file
	 * 
	 * @param the associated key name in property file
	 * @return
	 */

	// reading from property file
	public String fromPropertyFile(String key) {
		FileInputStream fis = null;
		Properties properties = null;
		try {
			fis = new FileInputStream(new File("./src/test/resources/config.properties"));
			properties = new Properties();
			properties.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);

	}

	// extracting only single cell value from excel
	public String fromExcel(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("./TestData/HIPAA.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();

	}

	// reading date from excel
	public LocalDateTime fromExcelWithDateTime(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("./TestData/HIPAA.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue();

	}

	// getting only day from computer based on input
	public int dayFromSystem(int num) {
		LocalDateTime systemdate = LocalDateTime.now().plusDays(num);

		int day = systemdate.getDayOfMonth();
		return day;
	}

	// getting only year from computer based on input
	public int yearFromSystem(int num) {
		LocalDateTime systemdate = LocalDateTime.now().plusYears(num);

		int year = systemdate.getYear();
		return year;
	}

	// getting only month from computer based on input
	public String monthFromSystem(int num) {
		LocalDateTime systemdate = LocalDateTime.now().plusMonths(num);
		String monthName = systemdate.getMonth().name();
		String month = "" + monthName.charAt(0) + monthName.substring(1, 3).toLowerCase();
		return month;
	}

	// reading multiple data from the excel(rows and columns)
	@DataProvider
	public String[][] multipleDataFromExcel(String sheetName) {
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("./TestData/HIPAA.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheetInfo = workBook.getSheet(sheetName);
		int rowCount = sheetInfo.getPhysicalNumberOfRows() - 1;
		int columnCount = sheetInfo.getRow(1).getPhysicalNumberOfCells() - 1;
		String data[][] = new String[rowCount][columnCount];

		for (int i = 1, k = 0; i <= rowCount; i++, k++) {
			for (int j = 1, l = 0; j <= columnCount; j++, l++) {
				data[k][l] = sheetInfo.getRow(i).getCell(j).toString();
			}
		}
		return data;

	}

	// reading a single row data
	public String[][] DataFromExcel(String sheetName, int rowNo) {
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("./TestData/HIPAA.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheetInfo = workBook.getSheet(sheetName);
		int columnCount = sheetInfo.getRow(rowNo).getPhysicalNumberOfCells() - 1;
		String data[][] = new String[1][columnCount];

		for (int j = 0; j < columnCount; j++) {
			data[0][j] = sheetInfo.getRow(rowNo).getCell(j + 1).toString();
		}

		return data;

	}

	// reading month from excel
	public String readMonthFromExcel(String sheetName, int row, int col) {
		ReadData data = new ReadData();
		String dat = data.fromExcel(sheetName, row, col);

		String month = null;
		String date[] = dat.split("/");

		String m = date[1];
		int months = Integer.parseInt(m);

		switch (months) {
		case 1:
			month = "Jan";
			break;
		case 2:
			month = "Feb";
			break;
		case 3:
			month = "Mar";
			break;
		case 4:
			month = "Apr";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "Jun";
			break;
		case 7:
			month = "Jul";
			break;
		case 8:
			month = "Aug";
			break;
		case 9:
			month = "Sep";
			break;
		case 10:
			month = "Oct";
			break;
		case 11:
			month = "Nov";
			break;
		case 12:
			month = "Dec";
			break;
		}
		return month;
	}

	// reading day from excel
	public static int readDayFromExcel(String sheetName, int row, int col) {
		ReadData data = new ReadData();
		String dat = data.fromExcel(sheetName, row, col);
		String date[] = dat.split("/");
		String d = date[0];
		int day = Integer.parseInt(d);
		return day;
	}

	// reading year from excel
	public static int readyearFromExcel(String sheetName, int row, int col) {
		ReadData data = new ReadData();
		String dat = data.fromExcel(sheetName, row, col);
		String date[] = dat.split("/");
		String y = date[2];
		int year = Integer.parseInt(y);
		return year;
	}

	// method to handle dropdown
	public boolean checkDropDownListfromUIAndExcel(WebDriver driver, String ddname, String sheetname) {

		// getting expected and actual options from excel and ui
		ArrayList<String> expectedList = new ArrayList<String>();
		ArrayList<String> actualList = new ArrayList<String>();
		boolean result = false;
		int counter = 0;
		int cellNum = 0;
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("./TestData/Dropdown.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workBook.getSheet(sheetname);
		int totalcells = sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 0; i < totalcells; i++) {
			String currentCellData = sheet.getRow(0).getCell(i).getStringCellValue();
			if (currentCellData.equals(ddname)) {
				cellNum = i;
				break;
			}
		}
		int totalRows = sheet.getPhysicalNumberOfRows();
		for (int j = 1; j < totalRows - 1; j++) {
			Cell cell = sheet.getRow(j).getCell(cellNum);
			if (cell == null || cell.getCellType() == CellType.BLANK) {
				break;
			}
			String cellData = sheet.getRow(j).getCell(cellNum).getStringCellValue();
			expectedList.add(cellData);
		}
		try {
			workBook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<WebElement> ls = driver.findElements(By.xpath("//li[@class='active-result']"));
		Reporter.log("The " + ddname + " Dropdown options from UI are ", true);
		for (WebElement ele : ls) {
			String optionName = ele.getText();
			Reporter.log(optionName, true);
			actualList.add(optionName);
		}

		// comparing the both the options.
		if (expectedList.size() == actualList.size()) {
			Reporter.log("The " + ddname + " Dropdown Options from Excel are", true);
			for (int i = 0; i < expectedList.size(); i++) {
				if (expectedList.get(i).equalsIgnoreCase(actualList.get(i))) {
					Reporter.log(expectedList.get(i), true);
					continue;
				} else {
					Reporter.log("===========Mismatched between options ============ " + "\n" + "Expected===> "
							+ expectedList.get(i) + " Actual===> " + actualList.get(i), true);
					counter++;
				}
			}
			if (counter == 0) {
				Reporter.log("Options are Matching", true);
				result = true;
			} else {
				Reporter.log("Options are not Matching", true);
				result = false;
			}

		} else
			 Reporter.log("Error : DropDown options from UI are not matching with expected option in the excel", true);
			result = false;

		return result;

	}

	@DataProvider(name = "getTestData")
	public String[][] readDataForForms() {
		String[][] data = null;
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("./TestData/HIPAA.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workBook.getSheet("NewTechnologyData");
		DataFormatter formatter = new DataFormatter();

		// Get physical number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		// Get Physical number of cells
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		data = new String[rows - 1][cells];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				String cellData = formatter.formatCellValue(sheet.getRow(i).getCell(j));
				;
				data[i - 1][j] = cellData;
			}

		}
		return data;
	}

	public void handleDropdownByText(WebDriverWait explicit, WebDriver driver, WebElement dropDown, String option) {
		explicit.until(ExpectedConditions.elementToBeClickable(dropDown));
		dropDown.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (option.equals("Low") || option.equals("High") || option.equals("Medium")) {
			WebElement scrollElement = driver.findElement(By.xpath("//label[text()='Description']"));
			js.executeScript("arguments[0].scrollIntoView(false)", scrollElement);
			// explicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li[text()='"+option+"']")));
			// driver.findElement(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li[text()='"+option+"']")).click();
			driver.switchTo().activeElement().sendKeys(option, Keys.ENTER);

			//
			/*
			 * try { clickElment.click(); } catch (Exception e) { JavascriptExecutor Js1 =
			 * (JavascriptExecutor) driver; Js1.executeScript("window.scrollBy(0,500)");
			 * WebElement ele =
			 * driver.findElement(By.xpath("//ul[@class='chosen-results']/li[text()='"+
			 * option+"']")); js.executeScript("arguments[0].click()", ele);
			 * 
			 * }
			 */
		} else
			// driver.switchTo().activeElement().sendKeys(option);
			// driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//li[contains(text(),'" + option + "')]")).click();
	}

	public void readCompareColumn(String compare) {
		FileInputStream fis = null;
		Workbook workBook = null;

		try {
			fis = new FileInputStream("./TestData/Dropdown.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workBook.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 0; i < col; i++) {
			if (sheet.getRow(0).getCell(i).toString().equals(compare)) {
				System.out.println("Found duplicate");
			} else {

				System.out.println("Not found");
			}

		}
	}

	public boolean checkDDListFromUIAndExcel(WebDriver driver, String ddname, String sheetName) {
		int cellNum = 0;
		int counter = 0;
		boolean result = true;
		ArrayList<String> expectedList = new ArrayList<String>();
		ArrayList<String> actualList = new ArrayList<String>();
		File f = new File("./TestData/Dropdown.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetName);

			int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
			for (int i = 0; i < totalCells; i++) {
				String currentCellData = sheet.getRow(0).getCell(i).getStringCellValue();
				if (currentCellData.equalsIgnoreCase(ddname)) {
					cellNum = i;
					break;
				}
			}
			int totalRows = sheet.getPhysicalNumberOfRows();
			for (int j = 1; j < totalRows; j++) {
				XSSFCell cell = sheet.getRow(j).getCell(cellNum);
				if (cell == null || cell.getCellType() == CellType.BLANK) {
					break;
				}
				String cellData = sheet.getRow(j).getCell(cellNum).getStringCellValue();
				expectedList.add(cellData);
			}
			wb.close();
			List<WebElement> ls = driver.findElements(By.xpath("//li[@class='active-result']"));
			for (WebElement ele : ls) {
				String optionName = ele.getText();
				actualList.add(optionName);
			}
			// comparing
			if (expectedList.size() == actualList.size()) {
				Reporter.log("The " + ddname + " Dropdown Options from Excel are", true);
				for (int i = 0; i < expectedList.size(); i++) {
					if (expectedList.get(i).equalsIgnoreCase(actualList.get(i))) {
						Reporter.log(expectedList.get(i), true);
						continue;
					} else {
						Reporter.log("===========Mismatched between options ============ " + "\n" + "Expected===> "
								+ expectedList.get(i) + "\n" + " Actual===> " + actualList.get(i), true);
						counter++;
					}
				}
				if (counter == 0) {
					Reporter.log("Options are Matching", true);
					result = true;
				} else {
					Reporter.log("Options are not Matching", true);
					result = false;
				}

			} else
				Reporter.log("Error : DropDown options from UI are not matching with expected option in the excel",
						true);
			result = false;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return result;

	}
}
