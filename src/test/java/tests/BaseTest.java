package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
 @BeforeClass
    public void TestSetUp (){
     driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://automationteststore.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 }
 @AfterClass
 public void TestTearDown (){
     driver.quit();
 }

}
