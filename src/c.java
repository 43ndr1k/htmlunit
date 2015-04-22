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
            driver.get("https://de.search.yahoo.com/");

            // Enter the query string "Cheese"
            WebElement query = driver.findElement(By.name("p"));
            query.sendKeys("ente");

            System.out.println(driver.getTitle().toString());
            // Sleep until the div we want is visible or 5 seconds is over
            long end = System.currentTimeMillis() + 5000;
            List<WebElement> resultsDiv;
            while (System.currentTimeMillis() < end) {
                resultsDiv = driver.findElements(By.id("results"));

            }
            List<WebElement> test = driver.findElements(By.id("results"));
            for (WebElement suggestion : test) {
                System.out.println(suggestion.getText());
            }

            // And now list the suggestions
            List<WebElement> allSuggestions = driver.findElements(By.xpath("//td[@class='gssb_a gbqfsf']"));

            for (WebElement suggestion : allSuggestions) {
                System.out.println(suggestion.getText());
            }




            driver.quit();
        }
    }


