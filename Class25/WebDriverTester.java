package Class25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webservers = new ChromeDriver();
        webservers.openBrowser();
        webservers.closeBrowser();
        webservers.maximizeWindow();
        webservers.findElement();

        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver w : webDrivers) {
            w.openBrowser();
            w.findElement();
            w.maximizeWindow();
            w.closeBrowser();
        }
    }
}
