
package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class HomePageElements {

    public HomePageElements()

    {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[contains(text(),'Eğitmenler')]")
    public WebElement instructorsButton;

    @FindBy(css = ".instructors > div")
    public List<WebElement> instructorDivs2;





}
