package ru.netprint;


import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class test_mou_albom {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();



    @Before
    public void setUp() throws Exception {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:/Users/miroshnichenko/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        baseUrl = "https://www.netprint.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    public void test_ekspres_redacktor() throws Exception {
            driver.get("https://www.netprint.ru/moscow");
            driver.findElement(By.cssSelector("span.text.is_non_auth.hidden-sm")).click();
            driver.findElement(By.id("auth_login_field")).clear();
            driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("login_button")).click();
            driver.findElement(By.cssSelector("i.far.fa-images.user-menu-item-icon")).click();
            driver.findElement(By.cssSelector("button.btn.btn-default.btn-block")).click();
            driver.findElement(By.id("album_name")).click();
            driver.findElement(By.id("album_name")).clear();
            driver.findElement(By.id("album_name")).sendKeys("ттеесстт");
            driver.findElement(By.cssSelector("button.btn.btn-default.btn-block.actionOK")).click();
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/5-1.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/1300373376_378f498f90.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/1354447917-0264735-www.nevsepic.com.ua.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/1477469507_autumn-panorama.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/1521652446116526386.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/Anil_Akkus_5.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/CIMG3557-2a-tiltshift__880.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/krasivye_photo_prirody_01.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/pejzazhy_prirody_27.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/thumb-8ipwnn.jpg");
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/miroshnichenko/photo/мои альбомы/Фото-природы_1.jpg");
                   TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.cssSelector("button.btn.btn-default.btn-block")).click();
            driver.findElement(By.cssSelector("#dropdownMenu2 > i.material-icons")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Удалить альбом'])[1]/following::a[1]")).click();
            driver.findElement(By.id("album_name")).click();
            driver.findElement(By.id("album_name")).clear();
            driver.findElement(By.id("album_name")).sendKeys("ттеессттm");
                   TimeUnit.SECONDS.sleep(5);
            driver.findElement(By.id("sorting_type")).click();
                   TimeUnit.SECONDS.sleep(3);
            new Select(driver.findElement(By.cssSelector("#sorting_type"))).selectByVisibleText("По дате загрузки");
                   TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.id("sorting_type")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::label[1]")).click();
            driver.findElement(By.cssSelector("button.btn.btn-default.btn-block.actionOK")).click();
                   TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.cssSelector("#dropdownMenu2 > i.material-icons")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сообщить о проблеме'])[1]/following::a[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[1]/following::button[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Удалить альбом'])[1]/preceding::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='edit'])[1]/following::a[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[1]/following::button[1]")).click();
        }




    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
