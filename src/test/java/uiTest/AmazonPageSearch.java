package uiTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import page.AmazonPage;
import utils.ConfigurationReader;
import utils.Driver;

import java.util.Iterator;
import java.util.Set;

import static uiTest.WebBase.*;

public class AmazonPageSearch {

    @Test
    public void amazonSearch() {
        AmazonPage amazonPage = new AmazonPage(Driver.getDriver());

        navigateToURL(ConfigurationReader.getProperty("amazonURL"));

        waitElementToVisibleAndClick(amazonPage.hamburgerMenuButton);
        waitElementToVisibleAndClick(amazonPage.tvApplianceElectronicsButton);
        waitElementToVisibleAndClick(amazonPage.televisionButton);
        waitElementToVisibleAndClick(amazonPage.samsungBrandsButton);
        waitElementToVisibleAndClick(amazonPage.featureButton);
        waitElementToVisibleAndClick(amazonPage.priceHighToLowButton);
/*
        waitElementToBeClickableAndClick(amazonPage.hamburgerMenuButton);
        waitElementToBeClickableAndClick(amazonPage.tvApplianceElectronicsButton);
        waitElementToBeClickableAndClick(amazonPage.televisionButton);
        waitElementToBeClickableAndClick(amazonPage.samsungBrandsButton);
        waitElementToBeClickableAndClick(amazonPage.featureButton);
        waitElementToBeClickableAndClick(amazonPage.priceHighToLowButton);

 */

        search(3);

        GetWindowHandles();
        verifyTextIsPresent("About this item");
    }




    @After
    public  void closeWebDriver() {
        Driver.closeDriver();
    }
}