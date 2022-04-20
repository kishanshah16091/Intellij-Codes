package ReviewClass9;

public class WebDriverTester {
    public static void main(String[] args) {

        ReviewClass9.WebDriver[]webDrivers = { new ReviewClass9.ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
        for (ReviewClass9.WebDriver w : webDrivers) {
            w.open();
            w.close();
            w.getTitle();
            w.getScreenshot();
            w.navigate();
        }
    }
}

