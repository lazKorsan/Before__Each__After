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

public class Travel {
    public static WebDriver driver ;
    List<WebElement> travelProductsListesi ;

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

    public void test06(){
        driver.get("https://testotomasyonu.com/category/5/products");
        travelProductsListesi = driver.findElements(By.xpath("//div[@class='product-detail mb-3']")) ;

        System.out.println("Ürün sayısı: " + travelProductsListesi.size());
        System.out.println("Ürünler:");
        for (WebElement urun : travelProductsListesi) {
            System.out.println(urun.getText());
        }
    }
}



























