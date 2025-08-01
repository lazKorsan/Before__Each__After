package Before_Each_After_Farkliliklari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utilities.ReusableMethods;

public class testotomasyonu {
    public static WebDriver driver;
    @BeforeEach
    public void setDriver(){
        driver = utilities.TestBase.createDriver();

    }
    @AfterEach
    public void tearDown(){

        driver.quit();
    }
    @Test
    public void test01(){
        driver.get("https://testotomasyonu.com/");
        ReusableMethods.bekle(3);
    }

}
