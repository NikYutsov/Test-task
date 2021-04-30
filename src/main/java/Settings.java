import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settings {
    public WebDriver driver;



    @BeforeEach
    public void start() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver90.exe");
        driver = new ChromeDriver();

    }


    @AfterEach
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
