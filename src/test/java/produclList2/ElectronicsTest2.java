// ElectronicsTest.java
package produclList2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utilities.BeforeEach_AfterEach;
import utilities.ReusableMethods;
import utilities.TestUtils;

public class ElectronicsTest2 {

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
    public void testElectronicsProducts() {
        TestUtils.printProductsInCategory(driver,
                "https://testotomasyonu.com/category/7/products",
                "//a[@class='prod-title mb-3 ']");
    }
}