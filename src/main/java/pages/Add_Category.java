package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add_Category {

	WebDriver driver;

	public Add_Category(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[type='text'][name='categorydata']")
	WebElement Category_Input_Button;
	@FindBy(how = How.CSS, using = "input[name='submit'][value='Add category']")
	WebElement Add_Category_Button;
	@FindBy(how = How.XPATH, using = "//span[text()='TestNG 2797']")
	WebElement New_Added_Category_Button;

	public void insertCategory() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Category_Input_Button.sendKeys("TestNG 2797");
	}

	public void clickOnAddCategoryButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Add_Category_Button.click();
	}

	public String New_Category() {

		return New_Added_Category_Button.getText();
	}
}
