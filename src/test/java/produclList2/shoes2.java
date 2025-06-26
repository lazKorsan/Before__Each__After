package ProductsList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BeforeEach_AfterEach;
import utilities.ReusableMethods;
import utilities.TestUtils;

import java.util.List;

public class shoes2 {

    public static WebDriver driver ;
    List<WebElement> shoesProductsList ;

    @BeforeEach

    public void setUp(){
        driver = BeforeEach_AfterEach.createDriver() ;

    }

    @AfterEach

    public void tearDown(){
        ReusableMethods.bekle(3);
        driver.quit();
    }

    @Test

    public void test04(){

        TestUtils.printProductsInCategory(driver,"https://testotomasyonu.com/category/3/products","//a[@class='prod-title mb-3 ']");



    }

















}








