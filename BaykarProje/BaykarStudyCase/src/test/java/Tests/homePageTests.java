package Tests;

import Pages.homePage;
import Pages.internshipPage;
import Pages.loginPage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePageTests {

    private WebDriver driver;
    private homePage homePage;
    private internshipPage internshipPage;
    private loginPage loginPage;

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new homePage(driver);
        internshipPage = new internshipPage(driver);
        loginPage = new loginPage(driver);

        driver.get("https://kariyer.baykartech.com/en/");
    }

    @Test
    void statisticsTests() throws InterruptedException {
        homePage.waitUntil(homePage.careerButton);
        homePage.clickButton(homePage.careerButton);
        Thread.sleep(2000);
        homePage.waitUntil(homePage.istatisticsButton);
        homePage.clickButton(homePage.istatisticsButton);
        homePage.waitUntil(homePage.stats);
        homePage.isOnRight(homePage.statsBy, homePage.statsString);
    }

    @Test
    void ourCampusesTests() throws InterruptedException {
        homePage.waitUntil(homePage.careerButton);
        homePage.clickButton(homePage.careerButton);
        Thread.sleep(2000);
        homePage.waitUntil(homePage.campusesButton);
        homePage.clickButton(homePage.campusesButton);
        homePage.waitUntil(homePage.ourCampuses);
        homePage.isOnRight(homePage.ourCampusesBy, homePage.ourCompusesString);
    }

    @Test
    void benefitsOfferTests() throws InterruptedException {
        homePage.waitUntil(homePage.careerButton);
        homePage.clickButton(homePage.careerButton);
        Thread.sleep(2000);
        homePage.waitUntil(homePage.benefitsButton);
        homePage.clickButton(homePage.benefitsButton);
        homePage.waitUntil(homePage.benefitsOffer);
        homePage.isOnRight(homePage.benefitsBy, homePage.benefitsString);
    }

    @Test
    void socialAreasTests() throws InterruptedException {
        homePage.waitUntil(homePage.careerButton);
        homePage.clickButton(homePage.careerButton);
        Thread.sleep(2000);
        homePage.waitUntil(homePage.socialButton);
        homePage.clickButton(homePage.socialButton);
        homePage.waitUntil(homePage.socialArea);
        homePage.isOnRight(homePage.socialBy, homePage.socialString);
    }

    @Test
    void openPositionsTests() throws InterruptedException {
        homePage.waitUntil(homePage.openPositionsButton);
        homePage.clickButton(homePage.openPositionsButton);
        Thread.sleep(2000);
        homePage.waitUntil(homePage.openPositions);
        homePage.isOnRight(homePage.openBy, homePage.openString);
    }

    @Test
    void faqTests() throws InterruptedException {
        homePage.waitUntil(homePage.faqButton);
        homePage.clickButton(homePage.faqButton);
        Thread.sleep(2000);
        homePage.waitUntil(homePage.faq);
        homePage.isOnRight(homePage.faqBy, homePage.faqString);
    }

    @Test
    void internshipSeasonsTests() throws  InterruptedException {
        internshipPage.waitUntil(internshipPage.internshipButton);
        internshipPage.clickButton(internshipPage.internshipButton);
        Thread.sleep(2000);
        internshipPage.waitUntil(internshipPage.seasonsButton);
        internshipPage.clickButton(internshipPage.seasonsButton);
        internshipPage.waitUntil(internshipPage.internshipSeasons);
        internshipPage.isOnRight(internshipPage.seasons, internshipPage.seasonsString);
    }

    @Test
    void internshipCalendarTests() throws  InterruptedException {
        internshipPage.waitUntil(internshipPage.internshipButton);
        internshipPage.clickButton(internshipPage.internshipButton);
        Thread.sleep(2000);
        internshipPage.waitUntil(internshipPage.calendarButton);
        internshipPage.clickButton(internshipPage.calendarButton);
        internshipPage.waitUntil(internshipPage.internshipCalendar);
        internshipPage.isOnRight(internshipPage.calendar, internshipPage.calendarString);
    }

    @Test
    void internshipFaqTests() throws  InterruptedException {
        internshipPage.waitUntil(internshipPage.internshipButton);
        internshipPage.clickButton(internshipPage.internshipButton);
        Thread.sleep(2000);
        internshipPage.waitUntil(internshipPage.IfaqButton);
        internshipPage.clickButton(internshipPage.IfaqButton);
        internshipPage.waitUntil(internshipPage.internshipFaq);
        internshipPage.isOnRight(internshipPage.internFaq, internshipPage.faqString);
    }

    @Test
    void goToWebsiteBaykar() throws InterruptedException {
        homePage.waitUntil(homePage.baykarButton);
        homePage.clickButton(homePage.baykarButton);

        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        homePage.waitUntil(homePage.baykarLogo);
    }

    @Test
    void loginPage() throws InterruptedException {
        loginPage.clickButton(loginPage.loginButton);
        loginPage.waitUntil(loginPage.isLoginPage);
        loginPage.dataSendKeys(loginPage.email, loginPage.data);
        loginPage.dataSendKeys(loginPage.password, loginPage.data2);
        Thread.sleep(2000);
        loginPage.clickButton(loginPage.submitButton);
    }

    @AfterEach
    void tearDown () throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
