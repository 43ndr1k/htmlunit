import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.List;





    public class c  {
        public static void main(String[] args) {
            // Create a new instance of the html unit driver
            // Notice that the remainder of the code relies on the interface,
            // not the implementation.
            WebDriver driver = new HtmlUnitDriver();

            //driver.setJavascriptEnabled(true);
            // And now use this to visit Google
            driver.get("http://www.google.de");

            // Enter the query string "Cheese"
            WebElement query = driver.findElement(By.name("q"));
            query.sendKeys("ente");


            // Sleep until the div we want is visible or 5 seconds is over
            long end = System.currentTimeMillis() + 5000;
            while (System.currentTimeMillis() < end) {
                WebElement resultsDiv = driver.findElement(By.className("g"));

                // If results have been returned, the results are displayed in a drop down.
                if (resultsDiv.isDisplayed()) {
                    break;
                }
            }

            // And now list the suggestions
            List<WebElement> allSuggestions = driver.findElements(By.xpath("//td[@class='gssb_a gbqfsf']"));

            for (WebElement suggestion : allSuggestions) {
                System.out.println(suggestion.getText());
            }




            driver.quit();
        }
    }


