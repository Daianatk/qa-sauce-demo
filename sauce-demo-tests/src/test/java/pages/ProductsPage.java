package pages;

import com.microsoft.playwright.Page;

public class ProductsPage {
    private Page page;

    public ProductsPage(Page page) {
        this.page = page;
    }

    public void addProductToCart(String productName) {
        page.click("text=" + productName);
        page.click("button[id*='add-to-cart']");
    }

    public void goToCart() {
        page.click(".shopping_cart_link");
    }
}