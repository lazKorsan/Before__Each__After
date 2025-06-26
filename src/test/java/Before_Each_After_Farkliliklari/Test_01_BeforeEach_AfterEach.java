package Before_Each_After_Farkliliklari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BeforeEach_AfterEach;
import utilities.ReusableMethods;

import java.util.List;

public class Test_01_BeforeEach_AfterEach {
    public static WebDriver driver;
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

    public void test01(){
      driver.get("https://www.selenium.dev/");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getWindowHandle());

}

  @Test

    public void test02(){
      driver.get("https://www.youtube.com");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getWindowHandle());

  }

  @Test

    public void test03(){

      driver.get("https://automationpractice.com/");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getWindowHandle());

  }

  @Test

    public void test04(){
      driver.get("https://www.saucedemo.com/");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getWindowHandle());

      WebElement userNameBox = driver.findElement(By.xpath("//input[@data-test='username']"));
    userNameBox.sendKeys("standard_user");

    WebElement passwordBox = driver.findElement(By.xpath("//input[@data-test='password']"));
    passwordBox.sendKeys("secret_sauce");

    WebElement loginBox = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
    loginBox.click();

    ReusableMethods.bekle(3);

    // ürünleri temsil eden locator'ı bul (örnek: class adı "product-item")
      urunler = driver.findElements(By.xpath("//div[@data-test='inventory-item-name']")) ;
    System.out.println("Ürün sayısı: " + urunler.size());
    System.out.println("Ürünler:");
    for (WebElement urun : urunler) {       // satır83
      System.out.println(urun.getText());   // satır 84
    }                                       // satır 85

    WebElement addToCartButton  = driver.findElement(By.id("add-to-cart-sauce-labs-backpack")) ;
    addToCartButton .click();

    WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
    if(removeButton.isDisplayed()){
      System.out.println("Sepete ekleme başarılı, buton 'REMOVE' oldu.");
    } else {
      System.out.println("Sepete eklenmedi veya buton değişmedi.");
    }






  }




















}
