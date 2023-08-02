package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends page{

    public loginPage(WebDriver driver) {
        super(driver);
    }
    public final String loginButton = "//a[contains(.,'LOGIN')]";
    public final String isLoginPage = "//h1[@class='text-dark mb-3']";
    public final By email = By.xpath("//input[@name='login']");
    public final By password = By.xpath("//input[@id='id_password']");
    public final String submitButton = "//button[@id='kt_sign_in_submit']";
    public final String data = "fatihunluu37@hotmail.com";
    public final String data2 = "123456";
    }
