package Before_Each_After_Farkliliklari;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BeforeAll_AfterAll;
import utilities.BulXpath;
import utilities.ReusableMethods;

import java.util.List;





public class Test_02_BeforeEach_AfterEach {

    static WebDriver driver ;
    List<WebElement> products ;

    @BeforeAll
public static void setup(){
        driver = BeforeAll_AfterAll.createDriver() ;
    }
    @AfterAll
    public static void tearDown(){
        ReusableMethods.bekle(3);
        driver.quit();
    }

    @Test
    public void test01(){
        // 1- testotomasyonu anasayfaya gidin ve dogru sayfaya gittiginizi test edin


        driver.get("https://www.testotomasyonu.com");

        String expectedUrl = "https://www.testotomasyonu.com";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("url testi Passes");
        } else {
            System.out.println("url testi FAiled");
        }
    }

    @Test

    public void test02(){
        
        // 2- phone icin arama yapin ve arama sonucunda urun bulunabildigini test edin
        //WebElement searchBox = driver.findElement(By.xpath("//div[@class='product-detail mb-3']"));
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-search']"));
        searchBox.sendKeys("phone");
       searchBox.sendKeys(Keys.ENTER);

        WebElement firstProduct= driver.findElement(By.xpath("(//div[@class='product-detail mb-3'])[1]"));
        firstProduct.click();







    }

}
