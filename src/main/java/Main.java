import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class Main extends Settings {


    @Test
    public void test1() {
        Ways ways = PageFactory.initElements(driver, Ways.class);

        ways.open("https://qarecruitment.egnyte.com/fl/hwGyswM41m", "DKMtKwze");
        ways.wayToFolder("DataFolder1");
        ways.wayToFolder("numbers");
        ways.page4();
        ways.waitElements("161.txt");
        ways.chooseAll();
        ways.downloadButton();
        ways.mainPage();


    }

    @Test
    public void test2() {
        Ways ways = PageFactory.initElements(driver, Ways.class);

        ways.open("https://qarecruitment.egnyte.com/fl/hwGyswM41m", "DKMtKwze");
        ways.wayToFolder("DataFolder1");
        ways.wayToFolder("testData");
        ways.waitElements("xml.xml");
        ways.photoMode();
        ways.moveToPhotoNumber(2);
        ways.downloadPhotoNumber(2);
        ways.tableMode();
        ways.mainPage();

    }

    @Test
    public void test3() {
        Ways ways = PageFactory.initElements(driver, Ways.class);

        ways.open("https://qarecruitment.egnyte.com/fl/hwGyswM41m", "DKMtKwze");
        ways.logInButton();
        ways.logInUser("qwe");
        ways.loginAlert("No account found");
        driver.navigate().back();
        driver.navigate().back();
    }

    @Test
    public void test4() {
        Ways ways = PageFactory.initElements(driver, Ways.class);

        ways.open("https://qarecruitment.egnyte.com/fl/hwGyswM41m", "DKMtKwze");
        ways.wayToFolder("folder1");
        ways.wayToFolder("folder2");
        ways.wayToFolder("folder3");
        ways.wayToFolder("folder4");
        ways.wayToFolder("folder5");

        ways.prevPage3();
        ways.prevPage1();
        ways.mainPage();

    }

    @Test
    public void test5() {
        Ways ways = PageFactory.initElements(driver, Ways.class);

        ways.open("https://qarecruitment.egnyte.com/fl/hwGyswM41m", "DKMtKwze");
        ways.wayToFolder("DataFolder1");
        ways.wayToFolder("testData");
        ways.chooseFileByNumber(1);

        ArrayList<String> files = new ArrayList<String>();
        files.add("black-red.png");
        files.add("docx.docx");
        files.add("empty.xxx");
        files.add("Hello.png");
        files.add("sea.bmp");
        files.add("xml.xml");
        files.add("ĄŚŻŹĆŁÓŃĘ.txt");
        files.add("❤ ☀ ☆ ☂ ☻ ♞ ☯ ☢ € →.txt");

        Iterator<String> iter = files.iterator();

        while (iter.hasNext()) {
            ways.nameEnabled(iter.next());
            ways.nextPic();
        }
        ways.backFromViewingFiles();
        ways.mainPage();

    }

}
