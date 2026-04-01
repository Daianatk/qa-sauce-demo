package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigate() {
        page.navigate("https://www.saucedemo.com/");
    }

    public void login(String username, String password) {
        page.fill("#user-name", username);
        page.fill("#password", password);
        page.click("#login-button");
    }

    public String getErrorMessage() {
        return page.textContent("[data-test='error']");
    }
}