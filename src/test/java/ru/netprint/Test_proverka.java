
package ru.netprint;

import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_proverka {
    private static WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/miroshnichenko/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

     }

    @Test
    public void test_prodykt1() throws Exception {
        driver.get("https://www.netprint.ru/moscow/souvenirs");
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("ico-login")).click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оформить заказ'])[1]/following::img[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[2]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 5 дней'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[3]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[4]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[5]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[6]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[7]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[8]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[9]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[10]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 3 дня'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 3 дня'])[2]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Темы'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
     }
    @Test
    public void test_prodykt2() throws Exception {
            driver.get("https://www.netprint.ru/order/profile");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
            driver.findElement(By.id("auth_login_field")).clear();
            driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("ico-login")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оформить заказ'])[1]/following::img[2]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 1 день'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 1 день'])[2]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 1 день'])[3]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 1 день'])[4]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 1 день'])[6]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 1 день'])[7]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оформить заказ'])[1]/following::img[2]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 1 день'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[2]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[2]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[3]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[4]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[5]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[6]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[4]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[5]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[6]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[7]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 7 дней'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 3 дня'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[8]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[9]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 3 дня'])[2]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 4 дня'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::span[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оформить заказ'])[1]/following::img[2]")).click();
    }
    @Test
    public void proverka_foto() throws Exception {
            driver.get("https://www.netprint.ru/moscow/souvenirs");
            TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
            driver.findElement(By.id("auth_login_field")).clear();
            driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("ico-login")).click();
            TimeUnit.SECONDS.sleep(5);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказать со скидкой 25%'])[1]/following::a[1]")).click();
            TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ошибка'])[1]/following::canvas[1]")).click();
            TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
            TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка...'])[11]/following::img[1]")).click();
            TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка 16 января 2019'])[1]/following::div[7]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='В альбоме нет фотографий'])[1]/following::img[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
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
