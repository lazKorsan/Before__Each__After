package productsWritingList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.ReusableMethods;

import java.util.List;

public class electronics {
    public static WebDriver driver ;
    List<WebElement> products ;


@BeforeEach
public void setup(){
    driver = TestBase.createDriver() ;
}

@AfterEach
    public void tearDown(){
    ReusableMethods.bekle(3);
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
            // satır 42
        }

        // Ürünleri tek satırda, virgülle ayırarak yan yana yazdırmak için:
        // package adı = utulities   class adı : productsWritingList
        StringBuilder yanYanaListe = new StringBuilder();   //satır44
        for (WebElement urun : products) {
            yanYanaListe.append(urun.getText()).append(", ");
        }
        // Sondaki virgülü silmek için:
        if (!products.isEmpty()) {
            yanYanaListe.setLength(yanYanaListe.length() - 2); // Son iki karakteri (", ") sil
        }
        System.out.println("Yan yana ürünler: " + yanYanaListe);
    }                                                        // satır53




}


