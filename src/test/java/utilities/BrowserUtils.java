package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {
    //switch new window by exact title
    public static void switchToWindow(String targetTitle){
        String origin = Driver.getDriver().getWindowHandle();
        for( String handle: Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(handle);
            if(Driver.getDriver().getTitle().equals(targetTitle)){
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void hover(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static void doubleClick(WebElement clickbtn){
        Actions action  = new Actions(Driver.getDriver());
        action.doubleClick(clickbtn).perform();
    }


}
