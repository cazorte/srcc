package day38_MethodOverriding.browserTask;

public class Opera extends Browser{
    @Override
    public void openBrowser() {
        System.out.println("opening Opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Opera browser");
    }



}
