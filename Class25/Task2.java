package Class25;

public class Task2 {
}

interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize chrome window ");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements on Chrome browser");
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Firefox window ");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements on Firefox browser");
    }
}