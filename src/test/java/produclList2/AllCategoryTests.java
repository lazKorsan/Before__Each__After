// AllCategoryTests.java
package ProductsList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utilities.BeforeEach_AfterEach;
import utilities.ReusableMethods;
import utilities.TestUtils;

public class AllCategoryTests {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = BeforeEach_AfterEach.createDriver();
    }

    @AfterAll
    public static void tearDown() {
        ReusableMethods.bekle(3);
        driver.quit();
    }

    @Test
    public void testAllCategories() {



        // Elektronik  test01
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/7/products",
                "//a[@class='prod-title mb-3 ']");

        // Erkek Moda  test02
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/1/products",
                "//div[@class='product-detail mb-3']");

        //womanFashion test03
        TestUtils.printProductsInCategory(driver,"https://testotomasyonu.com/category/2/products","//a[@class='prod-title mb-3 ']");

        // shoes test04
        TestUtils.printProductsInCategory(driver,"https://testotomasyonu.com/category/3/products","//a[@class='prod-title mb-3 ']");

        //furnituretest05
        TestUtils.printProductsInCategory(driver,"https://testotomasyonu.com/category/8/products","//a[@class='prod-title mb-3 ']");

        // traveltest06
        TestUtils.printProductsInCategory(driver,"https://testotomasyonu.com/category/5/products","//div[@class='product-detail mb-3']");

        //kidsWeartest07
        TestUtils.printProductsInCategory(driver,"https://testotomasyonu.com/category/6/products","//div[@class='product-detail mb-3']");

        //grocerytest08
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/8/products","//a[@class='prod-title mb-3 ']");
        // Diğer kategoriler...

    }
}