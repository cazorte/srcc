package day38_MethodOverriding.browserTask;

public class FireFoxBrowser extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("opening FireFox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing FireFox browser");
    }
}
