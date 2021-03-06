package org.selenide.yourbet.selenide_yourbet_tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.selenide.yourbet.selenide_page_object.ActionsWithElements;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

public class MainPageCheckRegistrationTest extends ActionsWithElements {
    @Before
    public void testSetUp() {

        //CHROME Browser
        browser = "chrome";
        // System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        //FIREFOX Browser

        //SAFARI Browser

        //IE Browser

        //EDGE Browser
    }
    @Test
    public void checkRegistrationTest() {
        ActionsWithElements openURL = open(getTestProperty("url"), ActionsWithElements.class);
        ActionsWithElements notePrivacyPolicy = openURL.noteOfChangePrivacyPolicy();
        notePrivacyPolicy.checkRegistrationMethod();
    }
    @After
    public void testShutDown() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }
}
