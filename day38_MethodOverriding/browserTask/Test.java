package day38_MethodOverriding.browserTask;

public class Test {

    public static void main(String[] args) {

        ChromeBrowser cb1= new ChromeBrowser();
        cb1.openBrowser();
        cb1.closeBrowser();

        FireFoxBrowser ffb1 = new FireFoxBrowser();
        ffb1.openBrowser();
        ffb1.closeBrowser();

        Opera ob1 = new Opera();
        ob1.openBrowser();
        ob1.closeBrowser();



    }
}
