package househeaven;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BrainReausableMethods;
import utilities.BulXpath;
import utilities.ReusableMethods;

public class Househeaven {
    WebDriver driver ;
    @BeforeEach
    public void setUp(){
        driver = utilities.TestBase.createDriver();

    }
    @AfterEach
    public void tearDown(){
        driver.quit();
        ReusableMethods.bekle(3);
    }
    @Test
    public void test01(){
        driver.get("https://qa.hauseheaven.com/");
        Actions actions = new Actions(driver);
        driver.manage().deleteAllCookies();
        ReusableMethods.bekle(3);
        WebElement ilkSayfaSignButonu = driver.findElement(By.className("add-listing")) ;



        ReusableMethods.bekle(3);
        ilkSayfaSignButonu.click();
        ReusableMethods.bekle(3);

        WebElement emailBox = driver.findElement(By.xpath("(//input[@id='email'])[2]"));
        BulXpath.printXpathFormulas(emailBox);
        emailBox.sendKeys("cccc");
    }
    @Test
    public void mailYahooTesti() {

        driver.get("https://yahoo.com/");
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("ANa sayfa WindowHandle degeri" + driver.getWindowHandle());
        ReusableMethods.bekle(2);


        WebElement YahooSigninButonu = driver.findElement(By.xpath("//*[@id=\"login-container\"]"));
        ReusableMethods.bekle(2);
        BulXpath.printXpathFormulas(YahooSigninButonu);
        YahooSigninButonu.click();

        WebElement YahooUSerNameBox = driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
        System.out.println(YahooUSerNameBox.getTagName());
        YahooUSerNameBox.getCssValue("background-color");
        BulXpath.printXpathFormulas(YahooUSerNameBox);
        YahooUSerNameBox.sendKeys("mehmet");
        ReusableMethods.bekle(2);

        WebElement YahooNExtButonu = driver.findElement(By.xpath("//*[@id=\"login-signin\"]"));
        BulXpath.printXpathFormulas(YahooNExtButonu);
        YahooNExtButonu.click();

        ReusableMethods.bekle(3);

        WebElement YAhooSignUPButonu = driver.findElement(By.xpath("//*[@id=\"login-body\"]/div[2]/div[1]/div[2]/div/div[2]/a"));
        BulXpath.printXpathFormulas(YAhooSignUPButonu);
        YAhooSignUPButonu.getText();
        String expectedText = "Sign up";
        String actualText = YAhooSignUPButonu.getText();

        Assert.isTrue(actualText.equals(expectedText), "Sign up text does not match expected text");


    }
    }

