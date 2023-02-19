package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Month_DropDown{
	WebDriver driver;

	public Month_DropDown(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS ,using ="select[name = 'due_month']")WebElement dueMonthDropdown;
	
	public Select getDropDownmonth() {
		return new Select(dueMonthDropdown);
	}
	
}
