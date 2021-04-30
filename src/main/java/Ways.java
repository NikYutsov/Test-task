import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Ways {

    public WebDriver driver;
    public WebDriverWait wait;

    public Ways(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void open(String link, String pass) {
        driver.get(link);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
        driver.findElement(By.className("primaryBtn")).click();
    }

    public void wayToFolder(String folderName) {
        WebElement folderDis = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), '"+folderName+"')]")));
        folderDis.isDisplayed();
        WebElement folder =  (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), '"+folderName+"')]")));
        folder.click();
    }

    public void page4() {
        WebElement pageDis = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='pagination']/ul/li[5]/a")));
        pageDis.isDisplayed();
        WebElement page4 = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='pagination']/ul/li[5]/a")));
        page4.click();
    }
    public void waitElements(String elementName) {
        WebElement txt161 = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), '"+elementName+"')]")));
        txt161.isDisplayed();
    }

    public void chooseAll() {
        WebElement numbersAllCheckbox = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='folderLink-topbar-select']")));
        numbersAllCheckbox.click();
    }

    public void downloadButton() {
        WebElement DownloadFolder = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='folderLink-buttons']/button[3]")));
        DownloadFolder.click();
    }

    public void mainPage() {
        WebElement MainPage = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//nav[@class='folderLink-breadcrumbs breadcrumbs']/div/ul/li[3]/a")));
        MainPage.click();
    }

    public void photoMode() {
        WebElement PhotoMode = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='folderLink-topbar-actions']/li/button[2]/span")));
        PhotoMode.click();
    }

    public void moveToPhotoNumber(Integer photoNumber) {
        WebElement Pict2 = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='gallery-wrapper clearfix']/div["+photoNumber+"]/div/div[1]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(Pict2).build().perform();
    }

    public void downloadPhotoNumber(Integer downloadPhotoNumber) {
        WebElement DownLoad2Pic = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='gallery-wrapper clearfix']/div["+downloadPhotoNumber+"]/div/div[1]/ul/li/button/span")));
        DownLoad2Pic.click();
    }

    public void tableMode() {
        WebElement tableMode = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='folderLink-topbar-actions']/li/button[1]/span")));
        tableMode.click();
    }

    public void logInButton() {
        WebElement LogIn = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='folderLink-sidebar']/div/div/div[1]/button[2]")));
        LogIn.click();
    }

    public void logInUser(String login) {
        WebElement input = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='login-input']")));
        input.sendKeys(login);
        input.sendKeys(Keys.ENTER);
    }

    public void loginAlert(String alert) {
        WebElement showAlert = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), '"+alert+"')]")));
        showAlert.isEnabled();
    }

    public void nameEnabled(String fileNamePhotoMode) {
        WebElement emptyName = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='info']/div[contains(text(),'"+fileNamePhotoMode+"')]")));
        emptyName.isEnabled();
    }

    public void nextPic() {
        WebElement nextFile = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Next file')]")));
        nextFile.click();
    }

    public void chooseFileByNumber(Integer numberOfFile) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='folder-entries datagrid']/div/ul/li["+numberOfFile+"]/div/div/div[2]/div[2]")));
        WebElement blackRed = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='folder-entries datagrid']/div/ul/li["+numberOfFile+"]/div/div/div[2]/div[2]")));
        blackRed.click();
    }

    public void backFromViewingFiles() {
        WebElement blackRed = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='preview-wrapper']/div/div/div[1]/i")));
        blackRed.click();
    }

    public void prevPage3() {

        WebElement prevPage = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='folderLink-topbar-folder']/nav/div/ul/li[6]")));
        prevPage.click();
    }

    public void prevPage1() {

        WebElement prevPage = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='folderLink-topbar-folder']/nav/div/ul/li[4]")));
        prevPage.click();
    }

}
