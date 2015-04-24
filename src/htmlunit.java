import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.List;

/**
 * Created by hendrik on 24.04.15.
 */
public class htmlunit {

    public static void main(String[] args) {


            WebClient webClient = new WebClient(BrowserVersion.FIREFOX_31);
            webClient.getOptions().setCssEnabled(true);
            webClient.getOptions().setJavaScriptEnabled(true);
            webClient.setAjaxController(new NicelyResynchronizingAjaxController());
            webClient.getCookieManager().setCookiesEnabled(true);
            webClient.getOptions().setThrowExceptionOnScriptError(true);
            webClient.getOptions().setActiveXNative(true);


        HtmlPage currentPage = null;
        try {
            currentPage = webClient.getPage("https://duckduckgo.com/html/?kah=dk-da&kl=de-de&kad=de_DE&kaj=m&k1=-1&q=ente");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(currentPage.getTitleText());
        //Using XPath to get the first result in Google query
        //HtmlElement element = (HtmlElement)currentPage.getByXPath("//h3").get(0);
        List<DomElement> elements = currentPage.getElementsByIdAndOrName("links_wrapper");
        DomNode result = elements.get(0).getChildNodes().get(0);
        System.out.println(result.asText());
       // System.out.println(result.getByXPath("<a href"));


    }
}
