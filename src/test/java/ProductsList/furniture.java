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

public class furniture {

    public static WebDriver driver ;
    List<WebElement> furnitureProductsList ;


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

    public void test05(){
    driver.get("https://testotomasyonu.com/category/8/products");
   furnitureProductsList = driver.findElements(By.xpath("//div[@class='product-detail mb-3']"));


    System.out.println("Ürün sayısı: " + furnitureProductsList.size());
    System.out.println("Ürünler:");
    for (WebElement urun : furnitureProductsList) {
        System.out.println(urun.getText());
    }



}






































}
