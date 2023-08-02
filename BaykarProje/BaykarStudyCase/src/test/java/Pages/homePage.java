package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends page{


    public homePage(WebDriver driver) {
        super(driver);
    }


    // ******************** ISTATISTICS ********************
    public final String careerButton = "//a[.='CAREER']";
    public final String istatisticsButton = "//a[.='Statistics']";
    public final String stats = "//h2[.='STATS']";
    public final By statsBy = By.xpath("//h2[.='STATS']");
    public final String statsString = "STATS";

    // ******************** OUR CAMPUSES ********************
    public final String campusesButton = "//a[.='Our campuses']";
    public final String ourCampuses = "//h2[.='Our Campuses']";
    public final By ourCampusesBy = By.xpath("//h2[.='Our Campuses']");
    public final String ourCompusesString = "OUR CAMPUSES";

    // ******************** BENEFITS WE OFFER ********************
    public final String benefitsButton = "//a[.='The Benefits We Offer']";
    public final String benefitsOffer = "//h2[.='BENEFITS WE OFFER']";
    public final By benefitsBy = By.xpath("//h2[.='BENEFITS WE OFFER']");
    public final String benefitsString = "BENEFITS WE OFFER";

    // ******************** SOCİAL AREA ********************
    public final String socialButton = "//a[.='Social Areas']";
    public final String socialArea = "//h2[.='SOCIAL AREAS']";
    public final By socialBy = By.xpath("//h2[.='SOCIAL AREAS']");
    public final String socialString = "SOCIAL AREAS";

    // ******************** OPEN POSITIONS ********************
    public final String openPositionsButton = "//a[.='OPEN POSITIONS']";
    public final String openPositions = "//strong[.='Open positions']";
    public final By openBy = By.xpath("//strong[.='Open positions']");
    public final String openString = "OPEN POSITIONS";

    // ******************** FAQ ********************
    public final String faqButton = "//a[.='FAQ']";
    public final String faq = "//h2[.='Frequently Asked Questions']";
    public final By faqBy = By.xpath("//h2[.='Frequently Asked Questions']");
    public final String faqString = "Frequently Asked Questions";

    // ******************** BAYKAR ********************
    public final String baykarButton = "//a[.='BAYKAR']";
    public final String baykarLogo = "//img[@alt='https://cdn.baykartech.com/media/images/contents/Baykar-Logo.svg']";





}
