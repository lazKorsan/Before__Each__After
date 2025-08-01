package withai;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ReusableMethods;


import java.time.Duration;

public class withaiDonguselLoop {
    // Bu driver, @BeforeClass'da oluşturulur ve diğer testler tarafından ortak kullanılır.
    public WebDriver driver;

   @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

   @AfterEach
    public void teardown() {
        // Sadece @BeforeClass'da açılan ana tarayıcıyı kapatır.
        driver.quit();
    }





    @Test
    public void test04_AyniTarayicidaTekrarla() {
        // Bu test, @BeforeClass'da açılan ortak tarayıcıyı kullanarak
        // aynı sekmede sayfayı 20 kez yeniden yükler.
        System.out.println("Aynı tarayıcıda sayfayı yeniden yükleme testi başladı.");
        for (int i = 1; i <= 20; i++) {
            driver.get("https://www.testotomasyonu.com");
            System.out.println(i + ". kez AYNI tarayıcıda testotomasyonu.com açıldı.");
        }
        System.out.println("Aynı tarayıcıda sayfayı yeniden yükleme testi bitti.");
    }


    /**
     * YENİ EKLENEN TEST: Her defasında tarayıcıyı açıp kapatır.
     * Bu test, diğerlerinden tamamen bağımsız çalışır.
     *
     * @BeforeClass'da oluşturulan 'driver' nesnesini KULLANMAZ.
     * Döngünün her adımında kendi WebDriver nesnesini oluşturur ve döngü sonunda kapatır.
     */
    @Test
    public void test05_HerDefasindaAcKapat() {
        System.out.println("Her defasında tarayıcı aç-kapat testi başladı.");

        for (int i = 1; i <= 5; i++) {
            // 1. Adım: Her döngüde YENİ bir WebDriver nesnesi oluştur.
            WebDriver loopDriver = new ChromeDriver();
            loopDriver.manage().window().maximize();
            loopDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // 2. Adım: İstenen sayfaya git.
            loopDriver.get("https://www.testotomasyonu.com");
            System.out.println(i + ". kez YENİ tarayıcı açıldı ve siteye gidildi.");

            // 3. Adım: O döngüde açılan tarayıcıyı kapat.
            loopDriver.quit();
            System.out.println("   " + i + ". tarayıcı kapatıldı.");
        }

        System.out.println("Her defasında tarayıcı aç-kapat testi bitti.");
    }

    @Test
    public void testGithubCoPilot() {

        // kullanıcı test otomasyon sayfasına gider.
        // arama kutusunu locate eder. // arama kutusu için By.id("global-search")
        //WebElement aramaKutusu = driver.findElement(By.id("global-search"))
        // arama kutusuna "phone" yazar.
        //arama urun sonuc yazısını locate eder. // urun sonuc yazısı için By.className("product-count-text")
        // urun sonuc yazısının "0 Products Found" olmadığını test eder.
        // Assert.assertNotEquals(actualSonucYazisi,unExpectedSonucYazisi);
        driver.get("https://www.testotomasyonu.com/");
        // arama kutusuna baby yazar
        // arama sonuc urun yazısından sonucu alır. " 4 Products Found"
        // arama sonuc yazsından "4" sayısını alır ve 4'ün 0'dan büyük olduğunu test eder.
        driver.get("https://www.testotomasyonu.com/");
        // Arama kutusunu bul ve "phone" yaz
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // Sonuç yazısını bul
        WebElement sonucYazisi = driver.findElement(By.className("product-count-text"));
        String actualSonucYazisi = sonucYazisi.getText();
        String unExpectedSonucYazisi = "0 Products Found";

        // "0 Products Found" olmadığını test et



    }
}