package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Duplicate_Category {


	WebDriver driver;

	public Duplicate_Category(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[type='text'][name='categorydata']")
	WebElement Category_Input_Button;
	@FindBy(how = How.CSS, using = "input[name='submit'][value='Add category']")
	WebElement Add_Category_Button;
	@FindBy(how = How.CSS, using="body")
	WebElement Error_Message_Element;
	@FindBy(how = How.XPATH, using="/html/body/a[2]")
	WebElement NeverMind_buttton;
	
	
	
	public void insertCategory(String categoryName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Category_Input_Button.sendKeys(categoryName);
		
	}

	public void clickOnAddCategoryButton() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Add_Category_Button.click();
	}
	public String getErrorMessage() {
		return Error_Message_Element.getText();
		
	}
	public void nevermindButton() {
		NeverMind_buttton.click();
	}
}
