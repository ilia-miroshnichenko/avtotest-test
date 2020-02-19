package ru.netprint;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prodvunyt_test {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/miroshnichenko/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
     public void testSer() throws Exception {

            driver.get("https://www.netprint.ru");
            driver.findElement(By.linkText("Войти")).click();
            driver.findElement(By.id("auth_login_field")).clear();
            driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("login_button")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::div[18]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[2]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке'])[1]/following::img[3]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 5 дней'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига ROYAL в тканевой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига ROYAL в тканевой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига ROYAL в тканевой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига ROYAL в тканевой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига ROYAL в тканевой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига ROYAL в тканевой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига ROYAL в тканевой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига ROYAL в тканевой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[3]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Вконтакте'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Вконтакте'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Вконтакте'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Вконтакте'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Вконтакте'])[2]/following::img[3]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[2]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[4]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Детские лабиринты с фото и наклейками ребенка'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Детские лабиринты с фото и наклейками ребенка'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Детские лабиринты с фото и наклейками ребенка'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Детские лабиринты с фото и наклейками ребенка'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Детские лабиринты с фото и наклейками ребенка'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Детские лабиринты с фото и наклейками ребенка'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Детские лабиринты с фото и наклейками ребенка'])[1]/following::div[16]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[6]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[18]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[18]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в мягкой обложке'])[1]/following::div[18]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[7]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[18]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[19]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[19]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в мягкой обложке'])[1]/following::div[18]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[8]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотоальбом на пружине'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотоальбом на пружине'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотоальбом на пружине'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотоальбом на пружине'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотоальбом на пружине'])[2]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотоальбом на пружине'])[2]/following::img[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотоальбом на пружине'])[2]/following::img[3]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[9]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Брошюры'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Брошюры'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Брошюры'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Брошюры'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Брошюры'])[1]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Брошюры'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Брошюры'])[1]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Брошюры'])[1]/following::div[17]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[10]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[18]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[19]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[20]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[19]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::div[18]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 3 дня'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[18]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[19]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[19]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты ROYAL'])[2]/following::div[18]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 3 дня'])[2]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[16]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[17]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[18]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[19]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[19]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Планшеты Премиум'])[2]/following::div[18]")).click();
            driver.findElement(By.linkText("Заказать")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='в подарок'])[1]/following::span[1]")).click();
            driver.findElement(By.id("login_name")).click();
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