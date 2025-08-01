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

public class kidsWear {

    public static WebDriver driver ;
    List<WebElement> kidsWearProductsList ;

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

    public void test07(){
        driver.get("https://testotomasyonu.com/category/6/products");


        kidsWearProductsList = driver.findElements(By.xpath("//div[@class='product-detail mb-3']")) ;

        System.out.println("Ürün sayısı: " + kidsWearProductsList.size());
        System.out.println("Ürünler:");
        for (WebElement urun : kidsWearProductsList) {
            System.out.println(urun.getText());
        }

    }






















}
