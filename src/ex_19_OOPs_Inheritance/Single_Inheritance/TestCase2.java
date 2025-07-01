package ex_19_OOPs_Inheritance.Single_Inheritance;

public class TestCase2 extends Common_To_All{

    void runningTestCase2(){
        startBrowser();
        System.out.println("Running Test Case 2");
        readExcelFile();
        readDatabaseFile();
        closeBrowser();
    }
}
