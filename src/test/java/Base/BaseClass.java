package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
//
public class BaseClass {
    private WebDriver webDriver;
    protected HomePage homePage;
    @BeforeClass
    public  void SetUp() throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        webDriver=new ChromeDriver(co);
       // Thread.sleep(6000);
        webDriver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        webDriver.manage().window().maximize();
        homePage=new HomePage(webDriver);
        homePage.Click_button_search_bus();

    }

   @AfterMethod
    public void  TearDown()
    {
        webDriver.quit();
    }


}
