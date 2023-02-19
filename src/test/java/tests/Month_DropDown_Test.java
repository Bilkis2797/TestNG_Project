package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Month_DropDown;
import util.BrowserFactory;

public class Month_DropDown_Test {
	WebDriver driver;

	@Test
	public void TestMonthDropDown() {

		driver = BrowserFactory.init();

		Month_DropDown monthDropDown = PageFactory.initElements(driver, Month_DropDown.class);

		Select dueMonthDropdown = monthDropDown.getDropDownmonth();
		 

	        List<String> expectedMonths = Arrays.asList("None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
	        List<String> actualMonths = new ArrayList<String>();
	        for (WebElement month : dueMonthDropdown.getOptions()) {
	            actualMonths.add(month.getText());
	        }

	        Assert.assertEquals(actualMonths, expectedMonths);

	        BrowserFactory.tearDown();
	}
}
