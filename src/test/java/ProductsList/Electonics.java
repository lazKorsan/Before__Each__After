package ProductsList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.ReusableMethods;

import java.util.List;

public class Electonics {

   public static WebDriver driver ;
    List<WebElement> products ;


   @BeforeEach
    public void setUp(){
       driver = TestBase.createDriver() ;

    }
    @AfterEach
    public void tearDown(){
        ReusableMethods.bekle(2);
        driver.quit();
    }

    @Test

    public void test01(){
       driver.get("https://testotomasyonu.com/category/7/products");

        products = driver.findElements(By.xpath(" //a[@class='prod-title mb-3 ']")) ;

        System.out.println("Ürün sayısı: " + products.size());
        System.out.println("Ürünler:");
        for (WebElement urun : products) {
            System.out.println(urun.getText());


        }

    }
}
