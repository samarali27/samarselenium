package testNG;

import org.testng.annotations.Test;

import Amazon_Pages.Home;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Books {
	WebDriver driver;
	
  @Test
  public void f() {
	  Home home = new Home(driver);
	  //Amazon_page.Books books = new Amazon_page.Books(driver);
	  Amazon_Pages.Books book=new Amazon_Pages.Books();
	  books.stopover();
	  StopOver stopover = new StopOver(driver);
	  stopover.ReadListenClick();
  }
  public void SearchFildeVerifvication();{
	  Home home = new Home(driver);
	  home.LogoToClick();
	  home.searchfieldKeys();
	  home.searchToClick();
	  
  }
  @BeforeClass
  public void beforeClass() throw Interrupted {
  
  }

  @AfterClass
  public void afterClass() {
  
  }

}
