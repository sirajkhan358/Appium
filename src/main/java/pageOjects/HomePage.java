package pageOjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	public HomePage(AndroidDriver<AndroidElement> driver)

	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	
	
	@AndroidFindBy(xpath="//*[@text='Female']")
	public WebElement femaleOption;
	
	
	public WebElement getNameField()
	{
		System.out.println("trying to find the Name field");
		return nameField;
	}
	public WebElement getFemale()
	{
		System.out.println("Selecting the option from dropdown");
		return femaleOption;
	}
	
	
	
}
