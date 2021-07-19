package pages;

public class GooglePage extends BasePage{
    
    public GooglePage() {
        super(driver);
    }

    public void navigateToGogle() {
        navigateTo("https://www.google.com");
    }
}
