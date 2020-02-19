package ru.netprint;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;


import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;





public class test_zamena_sleep {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private int waitTimeInSec;



    @Before
    public void setUp() throws Exception {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:/Users/miroshnichenko/chromedriver_win321/chromedriver.exe");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);


    }

     // 1 тест проверка (замена слипов на wait)

    @Test
    @SuppressWarnings("unchecked")
    public void testProverka_menu1() throws Exception {
        driver.get("https://www.netprint.ru/order/profile");
        driver.findElement(By.cssSelector("a.top_block_item.top_auth.hidden-xs.hover_effect.desktop__login")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("login_button")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("i.fa.fa.fa-upload.user-menu-item-icon")));
        driver.findElement(By.cssSelector("i.fa.fa.fa-upload.user-menu-item-icon")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i")).click();
        driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i")).click();
        driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li[2]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i")).click();
        driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li[3]/a")).click();
        driver.findElement(By.id("login_name")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Смена пароля и логина'])[1]/following::i[1]")).click();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testSer_menu2() throws Exception {
        driver.get("https://www.netprint.ru/moscow/photobooks");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("login_button")).click();
       // waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::i[1]")).click();

        driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[5]/a")).click();

        driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i")).click();
        driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i")).click();
        driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li[2]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i")).click();
        driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li[3]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i")).click();
        driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li[4]/a")).click();
        driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("login_name")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Смена пароля и логина'])[1]/following::i[1]")).click();
    }



    // Вторая проверка замена слипов, уже с полной проверкой функционала заказа
    @Test
    @SuppressWarnings("unchecked")
    public void testZakaz() throws Exception {
        driver.get("https://www.netprint.ru/moscow");
        driver.findElement(By.cssSelector("a.top_block_item.top_auth.hidden-xs.hover_effect.desktop__login")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("login_button")).click();
        driver.findElement(By.cssSelector("img.hidden-xs")).click();
        driver.get("https://www.netprint.ru/");
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("span.a__butt")));
        driver.findElement(By.cssSelector("span.a__butt")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("a.a__butt.a__submit.propsWidgetButton")));
        driver.findElement(By.cssSelector("a.a__butt.a__submit.propsWidgetButton")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Дети'])[1]/following::a[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Дети'])[1]/following::a[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("div.item_picture > img")));
        driver.findElement(By.cssSelector("div.item_picture > img")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("div.dialog-popup-body > #select_editor > #select_editor_content > #available_editors > #editor_express > div.edit__list-title > a.btn-create-express")));
        driver.findElement(By.cssSelector("div.dialog-popup-body > #select_editor > #select_editor_content > #available_editors > #editor_express > div.edit__list-title > a.btn-create-express")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("canvas")));
        driver.findElement(By.cssSelector("canvas")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка...'])[10]/following::img[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка...'])[10]/following::img[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка 25 февраля 2019'])[1]/following::div[7]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка 25 февраля 2019'])[1]/following::div[7]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заполнить пустые'])[11]/following::button[1]")));
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заполнить пустые'])[11]/following::button[1]")).click();
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
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Очистить корзину'])[1]/following::input[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Очистить корзину'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Очистить корзину'])[1]/following::input[1]")).sendKeys("BN22-2F84-92EE-78A8-0E0D");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Очистить корзину'])[1]/following::input[2]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::a[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::a[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить'])[72]/following::div[7]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить'])[72]/following::div[8]")).click();
        TimeUnit.SECONDS.sleep(3);
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("select2-select_city-container")));
        driver.findElement(By.id("select2-select_city-container")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("select2-select_city-container")));
        driver.findElement(By.id("select2-select_city-container")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("select2-select_city-container")));
        driver.findElement(By.id("select2-select_city-container")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Москва");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("select2-select_metro-container")));
        driver.findElement(By.id("select2-select_metro-container")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Авиамоторная");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("save_delivery")));
        driver.findElement(By.id("save_delivery")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 3000 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 3000 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("send-order")));
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

    @Test
    @SuppressWarnings("unchecked")
    public void test_proverka_SMS() throws Exception {
        driver.get("https://www.netprint.ru/moscow");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("login_button")).click();
        driver.get("https://www.netprint.ru/");
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("span.a__butt")));
        driver.findElement(By.cssSelector("span.a__butt")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("a.a__butt.a__submit.propsWidgetButton")));
        driver.findElement(By.cssSelector("a.a__butt.a__submit.propsWidgetButton")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Дети'])[1]/following::a[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Дети'])[1]/following::a[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("div.item_picture > img")));
        driver.findElement(By.cssSelector("div.item_picture > img")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("div.dialog-popup-body > #select_editor > #select_editor_content > #available_editors > #editor_express > div.edit__list-title > a.btn-create-express")));
        driver.findElement(By.cssSelector("div.dialog-popup-body > #select_editor > #select_editor_content > #available_editors > #editor_express > div.edit__list-title > a.btn-create-express")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.cssSelector("canvas")));
        driver.findElement(By.cssSelector("canvas")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка...'])[10]/following::img[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка...'])[10]/following::img[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка 25 февраля 2019'])[1]/following::div[7]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Загрузка 25 февраля 2019'])[1]/following::div[7]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заполнить пустые'])[11]/following::button[1]")));
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заполнить пустые'])[11]/following::button[1]")).click();
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
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::a[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::a[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вернуться в корзину'])[1]/preceding::div[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вернуться в корзину'])[1]/preceding::div[1]")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("select2-select_city-container")).click();
        TimeUnit.SECONDS.sleep(3);
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("select2-select_city-container")));
        driver.findElement(By.id("select2-select_city-container")).click();
        driver.findElement(By.id("select2-select_city-container")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Москва");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("select2-select_metro-container")));
        driver.findElement(By.id("select2-select_metro-container")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys("Авиамоторная");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")).sendKeys(Keys.ENTER);
       // waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Телефон'])[1]/following::label[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Телефон'])[1]/following::label[1]")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.id("save_delivery")));
        driver.findElement(By.id("save_delivery")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 3000 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")).click();
        driver.findElement(By.id("send-order")).click();
        //waitForPageLoad(10, ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отменить заказ'])[1]/following::a[1]")));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отменить заказ'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Получатель'])[1]/following::a[1]")).click();
        driver.findElement(By.id("order_history_phone")).click();
        driver.findElement(By.id("send_sms")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Телефон для отправки информации о заказе'])[1]/following::i[1]")).click();
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
