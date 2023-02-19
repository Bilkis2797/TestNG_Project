package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Add_Category;
import util.BrowserFactory;

public class Add_Category_Test {


	WebDriver driver;
	
	@Test
	public void ValidateCategoryAdded() {
		
		driver = BrowserFactory.init();

		Add_Category addCategory= PageFactory.initElements(driver, Add_Category.class);
	
		addCategory.insertCategory();
		addCategory.clickOnAddCategoryButton();
		
		String AddedItem = addCategory.New_Category();

	    if(AddedItem !=null){
	    	System.out.println("Item added successfully");
	    }else{
	       System.out.println("unable to add the item");
	    }
	    BrowserFactory.tearDown();
	}
}
