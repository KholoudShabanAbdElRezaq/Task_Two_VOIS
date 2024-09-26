package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
//
public class SelectSeat {
    private WebDriver webDriver;
    private By selectseatitem = By.xpath("//input[@id='SrvcSelectBtnForward0']");
    private By selectboarding  = By.xpath("//input[@id='Forwardboarding-tab']");
    private By selectdropping  = By.xpath("//input[@id='Forwarddroping-tab']");
    private By selectcustomerdetails  = By.xpath("//input[@id='Forwardprofile-tab']");
    private By mobileNo  = By.xpath("//input[@id='mobileNo']");
    private By email  = By.xpath("//input[@id='email']");
    private By seatNumber  = By.xpath("span[text()='34']");

    private By Pass= By.xpath("//*[@id=\"passenger-details\"]/div/p/a");
    private By passengerNameForward0  = By.xpath("//input[@id='passengerNameForward0']");
    private By genderCodeIdForward0  = By.xpath("//select[@id='genderCodeIdForward0']");
    private By passengerAgeForward0  = By.xpath("//input[@id='passengerAgeForward0']");
    private By concessionIdsForward0  = By.xpath("//select[@id='concessionIdsForward0']");
    private By nationalityForward0  = By.xpath("//select[@id='nationalityForward0']");

    private By passportNoForward0  = By.xpath("//input[@id='passportNoForward0']");

    private By foreignerAddressForward0  = By.xpath("//input[@id='foreignerAddressForward0']");

    private By dobForward0  = By.xpath("//input[@id='dobForward0']");

    private By PgBtn  = By.xpath("//input[@id='PgBtn']");


    public SelectSeat(WebDriver webDriver)
    {
        this.webDriver=webDriver;

    }

     public SelectSeat fill_data()
     {
         webDriver.findElement(selectseatitem).click();
         webDriver.findElement(selectboarding).click();
         webDriver.findElement(selectdropping).click();
         webDriver.findElement(selectcustomerdetails).click();
         webDriver.findElement(mobileNo).sendKeys("6789125987");
         webDriver.findElement(email).sendKeys("Test@gmail.com");
         webDriver.findElement(seatNumber).click();
         webDriver.findElement(Pass).click();
         webDriver.findElement(passengerNameForward0).sendKeys("test");
         Select drp = new Select(webDriver.findElement(genderCodeIdForward0));
         drp.selectByVisibleText("FEMALE");
         webDriver.findElement(passengerAgeForward0).sendKeys("23");
         Select drpw = new Select(webDriver.findElement(concessionIdsForward0));
         drp.selectByVisibleText("Select Concession");
         Select drpwu = new Select(webDriver.findElement(nationalityForward0));
         drpwu.selectByVisibleText("Egypt");
         webDriver.findElement(passportNoForward0).sendKeys("test");
         webDriver.findElement(foreignerAddressForward0).sendKeys("test");
         webDriver.findElement(dobForward0).sendKeys("18/4/2000");
         webDriver.findElement(PgBtn).click();
         return new SelectSeat(webDriver);

     }




}
