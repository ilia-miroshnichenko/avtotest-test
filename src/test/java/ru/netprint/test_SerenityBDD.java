package ru.netprint;


import com.sun.jna.platform.win32.Netapi32Util;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.apache.commons.io.FileUtils;
import org.junit.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.rules.TestWatchman;
import org.junit.runner.RunWith;
import static java.lang.Thread.sleep;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.*;

import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.seleniumhq.jetty7.server.Authentication;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)

public class test_SerenityBDD {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private Netapi32Util.User user = new Netapi32Util.User();
    private String errorMessage;

   @Step ("dsddsds4444")
    @Before
    public void setUp1() throws Exception {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:/Users/miroshnichenko/chromedriver_win321/chromedriver.exe");
        driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(45, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, SECONDS);
        driver.manage().timeouts().setScriptTimeout(45, SECONDS);
        driver.manage().window().maximize();
        baseUrl = "https://moscow.netprint.ru/";

    }


    @Step ("dsddsdsfdfd3")

    @Test
    @Title("Members earn Gold status after 5000 points (50000 km)")
    public void testProverka_menu1() throws Exception {

        driver.get("https://www.netprint.ru/order/profile");
    }
    @Step ("dsddsdsfdfd1")
    @Test
    public void testProverka_menu2() throws Exception {
        driver.get("https://www.netprint.ru/order/profile");
    }
    @Step ("dsddsdsfdfd2")
    @Test
    public void testProverka_menu3() throws Exception {
        driver.get("https://www.netprint.ru/order/profile");
    }

    @Test
    public void testProverka_menu4() throws Exception {
        driver.get("https://www.netprint.ru/order/profile");
    }

    @Test
    public void testProverka_menu5() throws Exception {
        driver.get("https://www.netprint.ru/order/profile");
    }

    @Test
    public void testProverka_menu6() throws Exception {
        driver.get("https://www.netprint.ru/order/profile");

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