package officeHour.week7.cucumberReview.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utility.*;

public class SuccessPage {

    public SuccessPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@role='alert']/p")
    public WebElement message;
}
