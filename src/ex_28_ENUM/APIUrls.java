package ex_28_ENUM;

public enum APIUrls {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIUrls(String url){
        this.url = url;
    }
    String getUrl(){
        return this.url;
    }
}
