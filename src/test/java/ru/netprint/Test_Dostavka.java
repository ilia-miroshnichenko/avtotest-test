package ru.netprint;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Test_Dostavka {
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
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



    @Test
    public void testRaznue_dostavki() throws Exception {
        driver.get("https://www.netprint.ru/moscow");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("login_button")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]")).click();
        driver.get("https://www.netprint.ru/");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Создать дизайн с netPrint.ru'])[2]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Дети'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выпускной'])[3]/following::div[5]")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='СОЗДАТЬ'])[3]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка...'])[10]/following::img[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка 14 декабря 2018'])[1]/following::div[7]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заполнить пустые'])[11]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить'])[48]/following::button[3]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("select2-select_city-container")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
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
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]")).click();
        driver.findElement(By.id("select2-select_city-container")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("select2-select_city-container")).click();
        driver.findElement(By.id("select2-select_city-container")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Ангарск");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='В постаматы PickPoint'])[1]/following::label[1]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")).click();
        driver.findElement(By.id("save_delivery")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]")).click();
        driver.findElement(By.id("select2-select_city-container")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("select2-select_city-container")).click();
        driver.findElement(By.id("select2-select_city-container")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Почтой в любой город");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("3150371287b4423c8c03fd7dd3e4186d")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("save_delivery")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]")).click();
        driver.findElement(By.id("select2-select_delivery_types_group-container")).click();
        driver.findElement(By.id("select2-select_city-container")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("select2-select_city-container")).click();
        driver.findElement(By.id("select2-select_city-container")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
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
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 3000 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("send-order")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отменить заказ'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::button[1]")).click();
        driver.findElement(By.id("login_name")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сохраненные макеты'])[1]/following::i[1]")).click();
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
