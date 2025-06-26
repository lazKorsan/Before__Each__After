package ProductsList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BeforeEach_AfterEach;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class donguselProductsList {

    public static WebDriver driver ;
    List<WebElement> kategoriler ;
    List<WebElement> urunler ;


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

    public void anaTestKolu() {
        driver.get("https://testotomasyonu.com/");
        List<WebElement> kategoriler = driver.findElements(By.cssSelector("ul.flex > li.has-sub > a"));

        for (int i = 0; i < kategoriler.size(); i++) {
            // Her tıklamadan önce tekrar kategori listesini bul
            kategoriler = driver.findElements(By.cssSelector("ul.flex > li.has-sub > a"));
            WebElement kategori = kategoriler.get(i);
            String kategoriAdi = kategori.getText();
            kategori.click();

            // Sayfa yüklenmesini bekle (örneğin ürün kutusu çıkana kadar)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-box")));

            // Ürünleri bul
            List<WebElement> urunler = driver.findElements(By.cssSelector(".product-box"));
            System.out.println(kategoriAdi + " kategorisinde " + urunler.size() + " ürün var.");

            // Ana sayfaya geri dön
            driver.navigate().back();
            // Menü tekrar yüklensin diye bekle
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.flex > li.has-sub > a")));
        }
    }
    }






