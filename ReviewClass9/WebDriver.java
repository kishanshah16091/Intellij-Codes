package ReviewClass9;


public interface WebDriver {
    void open();
    void close();
    void getTitle();
    void getScreenshot();
    void navigate();
}

interface TakesScreenshot{
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver , TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }

    @Override
    public void getTitle() {
        System.out.println("get Chrome tittle");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome is getting screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome browser ");
    }
}

class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening FireFox browser");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox browser");
    }

    @Override
    public void getTitle() {
        System.out.println("get FireFox tittle");
    }

    @Override
    public void getScreenshot() {
        System.out.println("FireFox is getting screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to FireFox browser");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari browser");
    }

    @Override
    public void getTitle() {
        System.out.println("get Safari tittle");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari is getting screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to Safari browser");
    }
}




