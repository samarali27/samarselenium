package Amazon_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibrwoser {
	private static final String UserFiled = null;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\samal\\eclipse-workspace\\automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.feacbook.com");
        Thread.sleep(6000);
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(6000);
        driver.navigate().forward();
      String Windows = driver.getWindowHandle();
      System.out.println(Windows);
      String k1=driver.getCurrentUrl();
      System.out.println(k1);
      String titlesk=driver.getTitle();
      System.out.println(titlesk);
   
      WebElement UserField= driver.findElement(By.id("email"));
      UserField.sendKeys("peopletech");
      WebElement passwordField= driver.findElement(By.name("pass"));
      passwordField.sendKeys("it");
      Thread.sleep(6000);
      WebElement Logbuttom= driver.findElement(By.name("name"));
      Logbuttom.click();
      WebElement Forgotit= driver.findElement(By.linkText("forgot password?"));
      Forgotit.click();
      WebElement CreatAnAccount= driver.findElement(By.linkText("creat new account"));
      CreatAnAccount.click();
      Thread.sleep(6000);
      WebElement Month= driver.findElement(By.name("birthday_month"));
      Month.click();
      Select ob= new Select(Month);
      ob.selectByIndex(5);
      WebElement kj=driver.findElement(By.className("birthday_month"));
      Select bo=new Select(kj);
      ob.selectByValue("6");
      WebElement Toggles=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)/[3]"));
      Toggles.click();
      WebElement Signbt=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
      Signbt.click();
      
      
      driver.close();
      
      
      
   
      
       
	}
}
