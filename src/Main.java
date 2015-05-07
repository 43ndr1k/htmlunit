import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface,



        // Declaring and initialising the HtmlUnitWebDriver
        HtmlUnitDriver unitDriver = new HtmlUnitDriver();

        unitDriver.setJavascriptEnabled(true);

        //?kah=dk-da&kl=de-de&kad=de_DE&kaj=m&k1=-1&q=Harry%20Potter


        unitDriver.get("https://duckduckgo.com/html/?kah=dk-da&kl=de-de&kad=de_DE&kaj=m&k1=-1&q=ente");
       // unitDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //unitDriver.get("https://duckduckgo.com/?kah=dk-da&kl=de-de&kad=de_DE&kaj=m&k1=-1&q=ente");
/*
        Sendet die Suchanfrage und klickt auf den Suchbutton
        WebElement query = unitDriver.findElement(By.name("q"));
        query.sendKeys("ente");
        query.submit();*/


        String domainName = unitDriver.getTitle();
        System.out.println("Domain name is " + domainName);

        int z=0;
        String zeile = "n";
       do {

           if (zeile.equals("j")) {

               for (int a =0; a < z;a++) {
                   WebElement next = unitDriver.findElement(By.className("navbutton"));
                   next.click();
               }


           }
            List<WebElement> test2 = unitDriver.findElements(By.className("large"));
            List<WebElement> test3 = unitDriver.findElements(By.className("url"));
            List<WebElement> test4 = unitDriver.findElements(By.className("snippet"));

            for (int i = 0; i < test2.size(); i++) {
                System.out.println(test2.get(i).getText().toString());
                System.out.println(test3.get(i).getText().toString());
                System.out.println(test4.get(i).getText().toString());
                System.out.println("_________________________________");


            }
           System.out.println("########################################################################################");

           BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
           System.out.print("Geben Sie etwas ein: ");

           try {
               zeile = console.readLine();
               z++;
           } catch (IOException e) {
               // Sollte eigentlich nie passieren
               e.printStackTrace();
           }


        } while (zeile.equals( "j"));



  /*      WebElement next = unitDriver.findElement(By.className("navbutton"));
        next.click();
        //Thread.sleep(5000);


*/
    }



}




//-------------

//____________







      /*



        WebClient webClient = new WebClient();
        //driver.setJavascriptEnabled(true);



        //System.out.println(driver.isJavascriptEnabled());

        //driver.setJavascriptEnabled(true);
        // And now use this to visit Google
        //driver.get("http://blog.fastreboot.de");

        try {
            HtmlPage page = webClient.getPage("http://blog.fastreboot.de");
            page.getTitleText();
            page.getElementsByName("entry-content");
        } catch (IOException e) {
            e.printStackTrace();
        }


*/

//driver.get("https://duckduckgo.com/?q=test&ia=about");
// Enter the query string "Cheese"
//WebElement query = driver.findElement(By.name("q"));
//query.sendKeys("ente");

//System.out.println(driver.g.getTitle().toString());



// Sleep until the div we want is visible or 5 seconds is over
/*            long end = System.currentTimeMillis() + 5000;
            List<WebElement> resultsDiv;
            while (System.currentTimeMillis() < end) {
                resultsDiv = driver.findElements(By.id("results"));

            }
            List<WebElement> test = driver.findElements(By.className("results"));
            for (WebElement suggestion : test) {
                System.out.println(suggestion.getText());
            }*/

// And now list the suggestions
/*
        //List<WebElement> test = driver.findElements(By.className("entry-content"));
        List<WebElement> test = driver.findElements(By.className("c-info__body"));
        System.out.println(test);

        List<WebElement> allSuggestions = driver.findElements(By.xpath("//*[@class='entry-content']"));
            System.out.println(allSuggestions);

        for (WebElement suggestion : allSuggestions) {
            System.out.println(suggestion.getText());
        }

        driver.quit();

        */

//    }
