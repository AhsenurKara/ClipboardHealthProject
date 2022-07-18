package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class AmazonPage {
    WebDriver driver;


    public AmazonPage(WebDriver driver) {
        this.driver = Driver.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    public WebElement hamburgerMenuButton;

    @FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
    public WebElement tvApplianceElectronicsButton;

    @FindBy(xpath = "//a[@href='/gp/browse.html?node=1389396031&ref_=nav_em_sbc_tvelec_television_0_2_9_2']")
    public WebElement televisionButton;

    @FindBy(xpath = "//li[@class='a-spacing-micro']//span[text()='Samsung']")
    public WebElement samsungBrandsButton;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement featureButton;

    @FindBy(xpath = "//a[@id='s-result-sort-select_2']")
    public WebElement priceHighToLowButton;

    @FindBy(xpath = "//div[@class='s-product-image-container aok-relative s-image-overlay-grey s-text-center s-padding-left-small s-padding-right-small s-spacing-small s-height-equalized']")
    public List<WebElement> secondHighestPriceItem;

    @FindBy(xpath = "//*[contains(text(), 'About this item')]/following-sibling::ul")
    public WebElement aboutThisItem;




}
