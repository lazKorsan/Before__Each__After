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

public class multifunctionalTest {
    public static WebDriver driver ;
    List<WebElement> electronicsProductsList ;
    List<WebElement> ProductsMenFashionList ;
    List<WebElement> womanFashionProductsList ;
    List<WebElement> shoesProductsList ;
    List<WebElement> groceryProductsList ;
    List<WebElement> furnitureProductsList ;
    List<WebElement> travelProductsListesi ;
    List<WebElement> kidsWearProductsList ;


    @BeforeEach
public void setUp(){  // part2
        driver = BeforeEach_AfterEach.createDriver();

        }
        @AfterEach
    public void tearDown(){
            ReusableMethods.bekle(3);
            driver.quit();
        }

        @Test
    public void test01(){ //part3
            driver.get("https://testotomasyonu.com/category/7/products");

          electronicsProductsList = driver
                  .findElements(By.xpath(" //a[@class='prod-title mb-3 ']")) ;

            System.out.println("Ürün sayısı: " + electronicsProductsList.size());
            System.out.println("Ürünler:");
            for (WebElement urun : electronicsProductsList) {
                System.out.println(urun.getText());
            }
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

        @Test

    public void test04(){
            driver.get("https://testotomasyonu.com/category/3/products");

    shoesProductsList = driver.findElements(By.xpath("//a[@class='prod-title mb-3 ']")) ;


            System.out.println("Ürün sayısı: " + shoesProductsList.size());
            System.out.println("Ürünler:");
            for (WebElement urun : shoesProductsList) {
                System.out.println(urun.getText());
            }
        }

        @Test

    public void test05()
        {
            driver.get("https://testotomasyonu.com/category/8/products");


            furnitureProductsList = driver.findElements(By.xpath("//div[@class='product-detail mb-3']"));
            System.out.println("Ürün sayısı: " + furnitureProductsList.size());
            System.out.println("Ürünler:");
            for (WebElement urun : furnitureProductsList) {
                System.out.println(urun.getText());
            }

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

        @Test

    public void test07(){
            driver.get("https://testotomasyonu.com/category/4/products");

          groceryProductsList = driver.findElements(By.xpath("//div[@class='product-detail mb-3']")) ;


            System.out.println("Ürün sayısı: " + groceryProductsList.size());
            System.out.println("Ürünler:");
            for (WebElement urun : groceryProductsList) {
                System.out.println(urun.getText());
            }

        }

        @Test
    public void test08(){
            driver.get("https://testotomasyonu.com/category/6/products");


    kidsWearProductsList = driver.findElements(By.xpath("//div[@class='product-detail mb-3']")) ;

            System.out.println("Ürün sayısı: " + kidsWearProductsList.size());
            System.out.println("Ürünler:");
            for (WebElement urun : kidsWearProductsList) {
                System.out.println(urun.getText());
            }

        }


}

