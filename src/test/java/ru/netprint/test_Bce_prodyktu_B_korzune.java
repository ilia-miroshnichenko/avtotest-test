package ru.netprint;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class test_Bce_prodyktu_B_korzune {
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
    public void testProverka_menu() throws Exception {
        driver.get("https://www.netprint.ru/order/profile");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("login_button")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.get("https://www.netprint.ru/order/profile");
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Пенокартон");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пенокартон 30х30'])[1]/following::a[1]")).click();
               TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
               TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
               TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("login_name")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Календари настольные");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Календарь планинг 30х20'])[1]/following::a[1]")).click();
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
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("login_name")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Фотокнига в твердой обложке");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
               TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига в твердой обложке 30х30'])[1]/following::a[1]")).click();
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
        driver.findElement(By.id("login_name")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Фотопазлы");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пазл 20х10 (50 элементов)'])[1]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("login_name")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои макеты'])[4]/following::span[4]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Фотокнига Премиум в твердой обложке");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='онлайн-редактор'])[11]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Переименовать'])[11]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='онлайн-редактор'])[1]/following::i[1]")).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Поделиться'])[1]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Во что будем конвертировать? (Исходный макет будет сохранен)'])[1]/following::span[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Закрыть'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Закрыть'])[2]/following::input[1]")).sendKeys("фотокнига Премиум в твердой обложке 20х20");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Закрыть'])[2]/following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("save_changes")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Открыть макет'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='онлайн-редактор'])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("user_layout_name")).clear();
        driver.findElement(By.id("user_layout_name")).sendKeys("АВТОТЕСТ");
        driver.findElement(By.id("save_changes")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='онлайн-редактор'])[1]/following::i[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Конвертировать'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы действительно хотите удалить макет?'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Бонусы'])[1]/following::span[7]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить'])[48]/following::button[3]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("useLastDelivery")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("save_delivery")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 3000 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("send-order")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отменить заказ'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(2);
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
