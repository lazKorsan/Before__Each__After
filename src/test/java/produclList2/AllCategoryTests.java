// AllCategoryTests.java
package produclList2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utilities.TestBase;
import utilities.ReusableMethods;
import utilities.TestUtils;

public class AllCategoryTests {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = TestBase.createDriver();
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
    }

    @Test
    public void test02() {

        // Erkek Moda  test02
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/1/products",
                "//div[@class='product-detail mb-3']");
    }

    @Test
    public void test03() {

        //womanFashion test03
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/2/products",
                "//a[@class='prod-title mb-3 ']");
    }

    @Test
    public void test04() {

        // shoes test04
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/3/products",
                "//a[@class='prod-title mb-3 ']");

    }

    @Test
    public void test05() {

        //furnituretest05
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/8/products",
                "//a[@class='prod-title mb-3 ']");
    }

    @Test
    public void test06() {

        // traveltest06
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/5/products",
                "//div[@class='product-detail mb-3']");
    }

    @Test
    public void test07() {

        //kidsWeartest07
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/6/products",
                "//div[@class='product-detail mb-3']");
    }

    @Test
    public void test08() {

        //grocerytest08
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/8/products",
                "//a[@class='prod-title mb-3 ']");
    }
}



