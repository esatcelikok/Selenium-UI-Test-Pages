package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.library.FlowsLibrary;


public class HomePageTest extends TestBase {

    @Test()
public void verifyOpenHomePageTest () {

    String webSiteUrl = ConfigReader.getProperty("URL");
    getFlowsLibrary().navigateToUrl(webSiteUrl);
    Assert.assertTrue(isPageLoaded(85),
            "Career sayfası doğru şekilde yüklenmedi.");

        getPageLibrary().getHomePage().clickinstructorsButton();
        Assert.assertEquals(getElementLibrary().getInstructorsPageElements().
                instructortxt.getText(),"Eğitmenler");

}


}
