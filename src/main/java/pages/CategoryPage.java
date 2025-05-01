package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage{
    public CategoryPage(WebDriver driver){
        super(driver);
    }
    //Apparel & accessories
    private By WedgeHeel = By.xpath("//i[@class=\"fa fa-cart-plus fa-fw\"]");
}
