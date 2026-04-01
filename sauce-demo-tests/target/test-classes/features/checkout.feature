Feature: Flujo de compra en Sauce Demo

  Scenario: Comprar un producto exitosamente
    Given que inicio sesión con usuario "standard_user" y contraseña "secret_sauce"
    When agrego el producto "Sauce Labs Backpack" al carrito
    And procedo al checkout con nombre "Dayhanna", apellido "Campos", código postal "15001"
    Then debería ver el mensaje "Thank you for your order!"