package ru.netprint;

import org.openqa.selenium.By;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_prodykt {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/miroshnichenko/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testProdykt2() throws Exception {
        driver.get("https://www.netprint.ru/");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
        driver.findElement(By.id("auth_login_field")).clear();
        driver.findElement(By.id("auth_login_field")).sendKeys("mir.il2012@mail.ru");
        driver.findElement(By.id("pass_field")).clear();
        driver.findElement(By.id("pass_field")).sendKeys("DaKycc76");
        driver.findElement(By.id("auth_login_field")).click();
        driver.findElement(By.id("ico-login")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[1]/following::a[1]")).click();

        driver.findElement(By.xpath("//a[contains(@href, 'https://www.netprint.ru/moscow/photobooks/photobook-premium-soft-cover')]")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'https://www.netprint.ru/moscow/photobooks/photopad-premium')]")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'https://www.netprint.ru/moscow/photobooks/labyrinth')]")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'https://www.netprint.ru/moscow/wedding-photobook')]")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'https://www.netprint.ru/moscow/babybook')]")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'https://www.netprint.ru/moscow/travelbook')]")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'https://www.netprint.ru/moscow/graduationbook')]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги полиграфические'])[1]/following::a[1]")).click();
        driver.findElement(By.linkText("Мягкая обложка")).click();
        driver.findElement(By.linkText("Фотоброшюры")).click();
        driver.findElement(By.linkText("Фотоброшюры")).click();
        driver.findElement(By.linkText("Фотоальбом на пружине")).click();
        driver.findElement(By.linkText("Подарочный сертификат")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Royal на фотобумаге с плотными страницами'])[1]/following::a[1]")).click();
        driver.findElement(By.linkText("Тканевая обложка")).click();
        driver.findElement(By.linkText("Планшеты ROYAL")).click();
        driver.findElement(By.linkText("Фотокнига Вконтакте")).click();
        driver.findElement(By.linkText("Фотокнига Instagram")).click();
        driver.findElement(By.linkText("Виды фотокниг")).click();
        driver.findElement(By.linkText("Глянцевые фотокниги")).click();
        driver.findElement(By.linkText("10х15; 10х13.5")).click();
        driver.findElement(By.linkText("10х10; 15х15")).click();
        driver.findElement(By.linkText("13x18; 15х21")).click();
        driver.findElement(By.linkText("20х30; 30х45")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ШЕЛК'])[1]/following::a[1]")).click();
        driver.findElement(By.linkText("15х21")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ШЕЛК'])[1]/following::a[3]")).click();
        driver.findElement(By.linkText("10х15")).click();
        driver.findElement(By.linkText("15x21")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ПРЕМИУМ'])[1]/following::a[3]")).click();
        driver.findElement(By.linkText("Фотографии большого формата")).click();
        driver.findElement(By.linkText("Постеры")).click();
        driver.findElement(By.linkText("10x15")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='МЕТАЛЛИК'])[1]/following::a[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='МЕТАЛЛИК'])[1]/following::a[3]")).click();
        driver.findElement(By.linkText("Фотографии с подписью")).click();
        driver.findElement(By.linkText("Фотографии Polaroid")).click();
        driver.findElement(By.linkText("Фотографии Instagram")).click();
        driver.findElement(By.linkText("Панорамные фотографии")).click();
        driver.findElement(By.linkText("Холсты")).click();
        driver.findElement(By.linkText("Холсты Премиум")).click();
        driver.findElement(By.linkText("Фотобокс")).click();
        driver.findElement(By.linkText("Пенокартон")).click();
        driver.findElement(By.linkText("Накатка на пенокартон")).click();
        driver.findElement(By.linkText("Картина с паспарту")).click();
        driver.findElement(By.linkText("Модульные картины")).click();
        driver.findElement(By.linkText("Печать по дереву")).click();
        driver.findElement(By.linkText("Акрил")).click();
        driver.findElement(By.linkText("Пластификация")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ДОПОЛНИТЕЛЬНО'])[2]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Постеры'])[2]/following::a[1]")).click();
        driver.findElement(By.linkText("Кружки")).click();
        driver.findElement(By.linkText("Магниты")).click();
        driver.findElement(By.linkText("Открытки")).click();
        driver.findElement(By.linkText("Визитки")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Визитки'])[1]/following::a[1]")).click();
        driver.findElement(By.linkText("Настольный акрил")).click();
        driver.findElement(By.linkText("Тетради и блокноты")).click();
        driver.findElement(By.linkText("Наклейки")).click();
        driver.findElement(By.linkText("Дипломы")).click();
        driver.findElement(By.linkText("Фотошоколад")).click();
        driver.findElement(By.linkText("iPhone 5")).click();
        driver.findElement(By.linkText("iPhone 6")).click();
        driver.findElement(By.linkText("iPhone 7")).click();
        driver.findElement(By.linkText("Пазлы")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пазлы'])[1]/following::a[1]")).click();
        driver.findElement(By.linkText("Наклейки на тетради")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Наклейки на тетради'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Дипломы'])[2]/following::a[1]")).click();
        driver.findElement(By.linkText("iPhone 8")).click();
        driver.findElement(By.linkText("iPhone X")).click();
        driver.findElement(By.linkText("Чехлы для iPhone с готовым дизайном")).click();
        driver.findElement(By.linkText("Футболки женские")).click();
        driver.findElement(By.linkText("Футболки мужские")).click();
        driver.findElement(By.linkText("Футболки детские")).click();
        driver.findElement(By.linkText("Сумки из хлопка")).click();
        driver.findElement(By.linkText("Instagram постер (плакат)")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Instagram постер (плакат)'])[1]/following::a[1]")).click();
        driver.findElement(By.linkText("Отправить открытку с сайта")).click();
        driver.findElement(By.linkText("Стандарт")).click();
        driver.findElement(By.linkText("Премиум")).click();
        driver.findElement(By.linkText("Royal")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='КАЛЕНДАРЬ ПЛАКАТ'])[1]/following::a[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Стандарт'])[2]/following::a[1]")).click();
        driver.findElement(By.linkText("Instagram календарь")).click();
        driver.findElement(By.linkText("Календарь настольный")).click();
        driver.findElement(By.linkText("Карманный календарик")).click();
        driver.findElement(By.linkText("Подарочный сертификат на календари")).click();
        driver.findElement(By.linkText("Ваш уникальный календарь")).click();
        driver.findElement(By.linkText("Фото Премиум по 5.5 руб.")).click();
        driver.findElement(By.linkText("Скидка 25% на фотокниги")).click();
        driver.findElement(By.linkText("Фотопазл в подарок")).click();
        driver.findElement(By.linkText("Каждый третий сувенир в подарок")).click();
        driver.findElement(By.linkText("Скидка 30% на новый багет")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='БОНУСНАЯ ПРОГРАММА'])[1]/following::a[1]")).click();
        driver.findElement(By.linkText("Все о бонусной программе")).click();
        driver.findElement(By.linkText("Бонусные сертификаты")).click();
        driver.findElement(By.linkText("Все акции")).click();
        driver.findElement(By.linkText("Услуги и сервисы")).click();
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
