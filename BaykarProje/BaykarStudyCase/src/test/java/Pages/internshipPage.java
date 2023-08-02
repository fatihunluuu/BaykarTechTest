package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class internshipPage extends page{

    public internshipPage(WebDriver driver) {
        super(driver);
    }
    //***************** SEASONS *****************
    public final String internshipButton = "//a[.='INTERNSHIP']";
    public final String seasonsButton = "//a[.='İnternship Seasons']";
    public final String internshipSeasons = "//div[@id='seasons']//strong[.='INTERNSHIP']";
    public final By seasons = By.xpath("//div[@id='seasons']//strong[.='INTERNSHIP']");
    public final String seasonsString = "INTERNSHIP";

    //***************** INTERNSHIP CALENDAR *****************
    public final String calendarButton = "//a[.='İnternship Calendar']";
    public final String internshipCalendar = "//strong[.='2022 - 2023 SPRING TERM CALENDAR']";
    public final By calendar = By.xpath("//strong[.='2022 - 2023 SPRING TERM CALENDAR']");
    public final String calendarString = "2022 - 2023 SPRING TERM CALENDAR";

    //***************** INTERNSHIP FAQ *****************
    public final String IfaqButton = "//a[.='İnternship FAQs']";
    public final String internshipFaq = "//h2[.='Frequently Asked Questions']";
    public final By internFaq = By.xpath("//h2[.='Frequently Asked Questions']");
    public final String faqString = "Frequently Asked Questions";

}
