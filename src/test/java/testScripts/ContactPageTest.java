package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.LoginPage;

public class ContactPageTest extends TestBase {
	LoginPage loginPage;
  @BeforeTest
  public void setup() {
	  initialize();
  }
  @Test
  public void validateUser()
  {
	  loginPage=new LoginPage();
	  loginPage.login("aavanthi2@gmail.com", "Aadvik@18");
  }
}
