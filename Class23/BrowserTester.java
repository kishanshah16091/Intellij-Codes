package Class23;

// this code is part of 24 class
public class BrowserTester {
    public static void main(String[] args) {

        Browser[] browsers={new GoogleChrome(),new FireFox(),new Safari(),new IE()};

        for (Browser b : browsers) {
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }
    }
}
// /* GoogleChrome chrome=new GoogleChrome();
//        chrome.openBrowser();
//        chrome.loadPage("www.google.com");
//        chrome.testThePage();
//        chrome.closeBrowser();
//
//        FireFox fireFox=new FireFox();
//        fireFox.openBrowser();
//        fireFox.loadPage("www.google.com");
//        fireFox.testThePage();
//        fireFox.closeBrowser();
//
//        Safari safari=new Safari();
//        safari.openBrowser();
//        safari.loadPage("www.google.com");
//        safari.testThePage();
//        safari.closeBrowser();
//
//        IE ie=new IE();
//        ie.openBrowser();
//        ie.loadPage("www.google.com");
//        ie.testThePage();
//        ie.closeBrowser();
//    }
//}*/