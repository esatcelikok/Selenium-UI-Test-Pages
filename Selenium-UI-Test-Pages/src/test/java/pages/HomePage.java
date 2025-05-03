

package pages;


import org.testng.Assert;
import utility.Driver;

public class HomePage extends PageBase {

    public void clickinstructorsButton (){

        clickElementWithWait(getElementLibrary().getHomepageElements().instructorsButton);

        Assert.assertTrue(isPageLoaded(95),
                "İnstructorsPage sucsess loding");

   }


}
