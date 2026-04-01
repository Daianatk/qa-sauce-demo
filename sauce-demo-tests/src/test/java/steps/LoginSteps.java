package steps;

import com.microsoft.playwright.*;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;
    private static LoginPage loginPage;

    @Given("que estoy en la página de login")
    public void abrirLogin() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        loginPage = new LoginPage(page);
        loginPage.navigate();
    }

    @When("ingreso usuario {string} y contraseña {string}")
    public void ingresarCredenciales(String user, String pass) {
        loginPage.login(user, pass);
    }

    @Then("debería ver la página de productos")
    public void validarProductos() {
        page.waitForSelector(".inventory_list");
        browser.close();
        playwright.close();
    }

    @Then("debería ver un mensaje de error")
    public void validarError() {
        String error = loginPage.getErrorMessage();
        System.out.println("Mensaje de error: " + error);
        browser.close();
        playwright.close();
    }
}
