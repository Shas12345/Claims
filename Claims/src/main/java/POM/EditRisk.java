package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditRisk {
	public EditRisk(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath = "//i[contains(@class,'pencil')]")WebElement editIconButton;
	private @FindBy(xpath = "//i[contains(@class,'trash')]")WebElement deleteIconButton;
	
	
	
	
	

}
