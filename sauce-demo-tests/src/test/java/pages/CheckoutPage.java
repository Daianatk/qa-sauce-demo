package pages;

import com.microsoft.playwright.Page;

public class CheckoutPage {
    private Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    public void fillInformation(String firstName, String lastName, String postalCode) {
        page.fill("#first-name", firstName);
        page.fill("#last-name", lastName);
        page.fill("#postal-code", postalCode);
        page.click("#continue");
    }

    public void finishCheckout() {
        page.click("#finish");
    }

    public String getConfirmationMessage() {
        return page.textContent(".complete-header");
    }
}

