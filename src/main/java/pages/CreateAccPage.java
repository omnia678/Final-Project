package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccPage extends BasePage{
    public CreateAccPage(WebDriver driver){
        super(driver);
    }

    private By FirstName = By.id("AccountFrm_firstname");
    private By LastName	 = By.id("AccountFrm_lastname");
    private By Email = By.id("AccountFrm_email");
    private By Telephon = By.id("AccountFrm_telephone");
    private By Fax = By.id("AccountFrm_fax");
    private By Company  = By.id("AccountFrm_company");
    private By Address1 = By.id("AccountFrm_address_1");
    private By Address2 = By.id("AccountFrm_address_2");
    private By City = By.id("AccountFrm_city");
    private By Region	 = By.id("AccountFrm_zone_id");
    private By ZipCode	 = By.id("AccountFrm_postcode");
    private By Country	 = By.id("AccountFrm_country_id");
    private By LoginName = By.id("AccountFrm_loginname");
    private By Password	 = By.id("AccountFrm_password");
    private By PasswordConfirm = By.id("AccountFrm_confirm");
    private By SubscribeYes	 = By.id("AccountFrm_newsletter1");
    private By SubscribeNo	 = By.id("AccountFrm_newsletter0");
    private By  PrivacyPolicy	 = By.id("AccountFrm_agree");
    private By ContinueButton  = By.xpath("//button[@title=\"Continue\"]");









}
