package ProductsList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BeforeEach_AfterEach;
import utilities.ReusableMethods;

import java.util.List;

public class menFashion {

    public static WebDriver driver ;
    List<WebElement> ProductsMenFashionList ;

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

    public void test02(){
        driver.get("https://testotomasyonu.com/category/1/products");

       ProductsMenFashionList = driver.findElements(By.xpath("//div[@class='product-detail mb-3']")) ;

        System.out.println("Ürün sayısı: " + ProductsMenFashionList.size());
        System.out.println("Ürünler:");
        for (WebElement urun : ProductsMenFashionList) {
            System.out.println(urun.getText());
        }
    }
}
