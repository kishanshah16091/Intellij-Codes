package Class23;

public class Browser {
    void openBrowser() {
        System.out.println("Opening the browser");
    }

    void loadPage(String URL) {
        System.out.println("loading the website" + URL);
    }

    void testThePage() {
        System.out.println("Test the page");
    }

    void closeBrowser() {
        System.out.println("Closing the browser");
    }
}

class GoogleChrome extends Browser {
    void openBrowser() {
        System.out.println("Opening the GoogleChrome browser");
    }

    void loadPage(String URL) {
        System.out.println("loading the website" + URL + " in GoogleChrome");
    }

    void testThePage() {
        System.out.println("Test the page in GoogleChrome");
    }

    void closeBrowser() {
        System.out.println("Closing the GoogleChrome browser");
    }
}
//Shortcut to find and replace is ctrl+r on Windows and cmd+r on Mac
class Safari extends Browser {
    void openBrowser() {
        System.out.println("Opening the Safari browser");
    }

    void loadPage(String URL) {
        System.out.println("loading the website" + URL + " in Safari");
    }

    void testThePage() {
        System.out.println("Test the page in Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the Safari browser");
    }
}
class FireFox extends Browser {
    void openBrowser() {
        System.out.println("Opening theFireFox browser");
    }

    void loadPage(String URL) {
        System.out.println("loading the website" + URL + " in FireFox");
    }

    void testThePage() {
        System.out.println("Test the page in Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the Safari browser");
    }
}
class IE extends Browser {
    void openBrowser() {
        System.out.println("Opening the IE browser");
    }

    void loadPage(String URL) {
        System.out.println("loading the website" + URL + " in IE");
    }

    void testThePage() {
        System.out.println("Test the page in IE");
    }

    void closeBrowser() {
        System.out.println("Closing the IE browser");
    }
}