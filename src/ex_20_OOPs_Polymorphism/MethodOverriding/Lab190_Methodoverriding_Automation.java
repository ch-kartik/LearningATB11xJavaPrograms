package ex_20_OOPs_Polymorphism.MethodOverriding;

public class Lab190_Methodoverriding_Automation {
    public static void main(String[] args){
    ChromeTC c1 = new ChromeTC();
    c1.openBrowser();

    FireFox f1 = new FireFox();
    f1.openBrowser();

    CommonToAll commonToAll = new CommonToAll();
    commonToAll.openBrowser();

    // Dynamic Dispatch
    CommonToAll c2 = new ChromeTC();
    c2.openBrowser();

    CommonToAll c3 = new FireFox();
    c3.openBrowser();
}
}
class CommonToAll{

    void openBrowser(){
        System.out.println("Open the IE Browser");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Chrome will open now");
    }

    int openBrowser(int a){
        return 10;
    }
}

class FireFox extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start.");
    }
}
