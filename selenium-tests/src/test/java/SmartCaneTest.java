import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartCaneTest {

    @Test
    public void openWebsite() {

        // Automatically downloads and sets up ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open your deployed website
        driver.get("https://ananya0303.github.io/smartcane-irrigation-advisory/");

        // Maximize browser
        driver.manage().window().maximize();

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}