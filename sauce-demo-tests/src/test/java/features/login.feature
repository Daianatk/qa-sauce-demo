Feature: Login en Sauce Demo

  Scenario: Login exitoso con usuario estándar
    Given que estoy en la página de login
    When ingreso usuario "standard_user" y contraseña "secret_sauce"
    Then debería ver la página de productos

  Scenario: Login fallido con usuario bloqueado
    Given que estoy en la página de login
    When ingreso usuario "locked_out_user" y contraseña "secret_sauce"
    Then debería ver un mensaje de error