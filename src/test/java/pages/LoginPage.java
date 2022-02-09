package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase  {
	//locatorss
	@FindBy(name="email")
	WebElement inputEmail;

	@FindBy(name="password")
	WebElement inputpwd;

	@FindBy(xpath = "//div[@class=\"ui fluid large blue submit button\"]")
	WebElement loginBtn;
	@FindBy(linkText = "Forgot your password?")
	WebElement frgtpwdlink;
	//Actions
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions
	public void login(String email, String pwd)
	{
		inputEmail.sendKeys(email);
		inputpwd.sendKeys(pwd);
		loginBtn.click();
	}
}
