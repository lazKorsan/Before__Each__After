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

public class womanfashion {

    public static WebDriver driver ;
    List<WebElement> womanFashionProductsList ;


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

    public void test03(){
        driver.get("https://testotomasyonu.com/category/2/products");
             womanFashionProductsList = driver.findElements(By.xpath("//a[@class='prod-title mb-3 ']")) ;


            System.out.println("Ürün sayısı: " + womanFashionProductsList.size());
            System.out.println("Ürünler:");
            for (WebElement urun : womanFashionProductsList) {
                System.out.println(urun.getText());
            }


        }

}





















