package ru.netprint;

import org.openqa.selenium.WebDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_dopolnenue {
    private static WebDriver driver;
    private static String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();



    @BeforeClass
    public static void  setup() throws Exception {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:/Users/miroshnichenko/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    @Test
    public void test_Prosmotr_prodykcuu_B_korzune_Fotoknura_u_foto() throws Exception {
        driver.get("https://www.netprint.ru/moscow");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("login_button")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[2]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("login_name")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Добавить и напечатать'])[1]/following::i[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("//img[@title='Загрузка 13 декабря 2018']")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сообщить о проблеме'])[1]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сообщить о проблеме'])[2]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сообщить о проблеме'])[3]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сообщить о проблеме'])[4]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сообщить о проблеме'])[5]/following::label[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Скрыть пропорции'])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[2]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='По формату'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Совет: Доставка почти в 2 раза дешевле, если вы купите на сумму больше 300 руб.'])[1]/following::canvas[3]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Матовая'])[1]/following::label[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотография кадрирована автоматически. Рекомендуем проверить фотографию.'])[4]/following::i[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Удалить фото текущего формата 10х15 Стандарт'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Формат фотографий успешно изменен на 10x10 Стандарт'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Бонусы'])[1]/following::span[7]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[4]/following::img[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='close'])[6]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Просмотр макета'])[1]/following::i[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить'])[54]/following::div[7]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("select2-select_city-container")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("select2-select_city-container")).click();
        driver.findElement(By.id("select2-select_city-container")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Москва");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("select2-select_metro-container")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Авиамоторная");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("save_delivery")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 3000 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("send-order")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отменить заказ'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::button[1]")).click();
        driver.findElement(By.id("login_name")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сохраненные макеты'])[1]/following::i[1]")).click();
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
