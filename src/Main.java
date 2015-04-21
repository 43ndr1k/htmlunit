import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Assert;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            homePage();
            //getElements();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void homePage() throws Exception {
        WebClient webClient = new WebClient();
        try {webClient = new WebClient();
            //final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");
            //final HtmlPage page = webClient.getPage("https://www.google.de/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=Ente&start=10");
            //final HtmlPage page = webClient.getPage("https://metager.de/klassik/meta/meta.ger1?start=1&k=yes&check_time=3&ui=de&langfilter=yes&eingabe=ente&mm=and&lang=all&maxtreffer=9999999&time=1&hitsPerServer=2&textmenge=1&wissRank=on&pdfboost=on&quicktips=beschleuniger&linkTest=no&sprueche=on&wikiboost=on&synonyme=on&dmoz=on&exalead=on&fastbot=on&wikipedia=on&yacy=on&witch=on&overture=on&nebel=on&metarss=on&beammachine=on&allesklar=on&suchticker=on&bing=on&onenewspage=on&onenewspagegermany=on&BASE=on&minism=on&fportal=on&clewwa=on&qsensei=on&harvest=on&pers=yes&onenewspagevideo=on&blogsearch=on&zeitde=on&tauchen=on&astronomie=on&regengergie=on&goyax=on&bildersuche=on&webpageanalyse=on&ebay=on&semapro=on&mg_produkt2=on&yandex=on&dmozint=on&usunis=on");
            //final HtmlPage page = webClient.getPage("https://www.bing.com/search?q=ente&first=11&FORM=PORE");
            final HtmlPage page = webClient.getPage("https://de.search.yahoo.com/search;_ylt=A9mSs2Z3GjZV_W8AzOEzCQx." +
                    ";_ylu=X3oDMTFjMjlnaDZpBGNvbG8DaXIyBHBvcwMxBHZ0aWQDU1dJREUwMV8xBHNlYwNwYWdpbmF0aW9u?p=ente&b=22&pz=10&pstart=4");
           //System.out.println(page.getTitleText());

            //final String pageAsXml = page.asXml();
            //System.out.println(pageAsXml.intern().toString());

            final String pageAsText = page.asText().toString();
            System.out.println(pageAsText);
            System.err.println("Ende__________________________________________________________");
        }catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void getElements() {
        try {
            WebClient webClient = new WebClient();
             webClient = new WebClient();
            final HtmlPage page = webClient.getPage("https://www.google.de/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=Ente&start=10");
            final HtmlDivision div = page.getHtmlElementById("rc");
            final HtmlAnchor anchor = page.getAnchorByName("rc");
            System.err.println(div);
            System.err.println(anchor);
        }catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}
