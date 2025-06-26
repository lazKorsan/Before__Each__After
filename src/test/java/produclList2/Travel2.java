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

public class Travel2 {
    public static WebDriver driver ;
    List<WebElement> travelProductsListesi ;

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

    public void test06(){

        TestUtils.printProductsInCategory(driver,"https://testotomasyonu.com/category/5/products","//div[@class='product-detail mb-3']");

    }
























}


