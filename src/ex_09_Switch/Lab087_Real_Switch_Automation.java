package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        //String browser = args[0];
        //System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser: ");
        String browser = scanner.nextLine();

        switch(browser) {
            case "chrome":
                System.out.println("Starting the chrome browser");
                System.out.println("......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // further code to start the Firefox
                // Webdriver driver = new Firefox(); // Selenium code
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("No idea which browser this is.");
                break;
        }

        scanner.close();

    }
}
