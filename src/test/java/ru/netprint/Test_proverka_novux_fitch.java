package ru.netprint;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.junit.After;


public class Test_proverka_novux_fitch {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp() throws Exception {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:/Users/miroshnichenko/chromedriver_win321/chromedriver.exe");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test
    public void test_OTZUV() throws Exception {
        driver.get("https://www.netprint.ru/moscow");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("login_button")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Посмотреть отзывы'])[1]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Качество изделия'])[4]/following::label[2]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Качество печати'])[4]/following::label[2]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Доставка'])[6]/following::label[3]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[4]/following::textarea[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[4]/following::textarea[1]")).clear();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[4]/following::textarea[1]")).sendKeys("Test Test Test Test");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[4]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Начать чат с оператором'])[2]/following::i[1]")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[3]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[2]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Показать еще'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Качество изделия'])[14]/following::label[5]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Доставка'])[16]/following::label[5]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[14]/following::textarea[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[14]/following::textarea[1]")).clear();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[14]/following::textarea[1]")).sendKeys("Тест тест тест тест тест тест");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[14]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Начать чат с оператором'])[2]/following::i[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("login_name")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Партнёрская программа'])[1]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("login_name")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Смена пароля и логина'])[1]/following::i[1]")).click();
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

