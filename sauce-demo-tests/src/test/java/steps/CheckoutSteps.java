package steps;

import com.microsoft.playwright.*;
import io.cucumber.java.en.*;
import pages.*;

public class CheckoutSteps {
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;
    private static LoginPage loginPage;
    private static ProductsPage productsPage;
    private static CartPage cartPage;
    private static CheckoutPage checkoutPage;

    @Given("que inicio sesión con usuario {string} y contraseña {string}")
    public void login(String user, String pass) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        loginPage = new LoginPage(page);
        loginPage.navigate();
        loginPage.login(user, pass);
        productsPage = new ProductsPage(page);
        cartPage = new CartPage(page);
        checkoutPage = new CheckoutPage(page);
    }

    @When("agrego el producto {string} al carrito")
    public void agregarProducto(String producto) {
        productsPage.addProductToCart(producto);
        productsPage.goToCart();
    }

    @When("procedo al checkout con nombre {string}, apellido {string}, código postal {string}")
    public void checkout(String nombre, String apellido, String postal) {
        cartPage.checkout();
        checkoutPage.fillInformation(nombre, apellido, postal);
        checkoutPage.finishCheckout();
    }

    @Then("debería ver el mensaje {string}")
    public void validarMensaje(String mensaje) {
        String confirmacion = checkoutPage.getConfirmationMessage();
        System.out.println("Confirmación: " + confirmacion);
        browser.close();
        playwright.close();
    }
}
