// MenFashionTest.java
package produclList2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utilities.BeforeEach_AfterEach;
import utilities.ReusableMethods;
import utilities.TestUtils;

public class MenFashionTest2 {

    public static WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = BeforeEach_AfterEach.createDriver();
    }

    @AfterEach
    public void tearDown() {
        ReusableMethods.bekle(2);
        driver.quit();
    }

    @Test
    public void testMenFashionProducts() {
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/1/products",
                "//div[@class='product-detail mb-3']");
    }
}