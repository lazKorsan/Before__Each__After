package produclList2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.ReusableMethods;
import utilities.TestUtils;

import java.util.List;

public class furniture2 {

    public static WebDriver driver ;
    List<WebElement> furnitureProductsList ;


    @BeforeEach

    public void setUp(){
        driver = TestBase.createDriver() ;
    }

    @AfterEach
    public void tearDown(){
        ReusableMethods.bekle(3);
        driver.quit();
    }

    @Test

    public void test05(){

        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/8/products",
                "//a[@class='prod-title mb-3 ']");




    }






































}
