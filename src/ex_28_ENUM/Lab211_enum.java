package ex_28_ENUM;

public class Lab211_enum {
    public static void main(String[] args){
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("----");
        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());

        System.out.println("----");
        System.out.println(APIUrls.google.getUrl());
        System.out.println(APIUrls.vwo.getUrl());
        System.out.println(APIUrls.katalon.getUrl());
    }
}


