package ProjectTask;

public class ProjectTask5 {

    }
interface WebDriver {
    void openBrowser();
    void closeBrowser();

}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close chrome browser");
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox browser");
    }

    static class SafariDriver implements WebDriver {

        @Override
        public void openBrowser() {
            System.out.println("Opening Safari browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close Safari browser");
        }
    }
    public static void main(String[] args) {

        WebDriver[]webDrivers = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver() };
        for (WebDriver w : webDrivers) {
            w.openBrowser();
            w.closeBrowser();
        }
    }
}