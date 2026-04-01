# 🚀 Automatización QA - Sauce Demo

Este proyecto contiene una suite de pruebas automatizadas para la aplicación web [Sauce Demo](https://www.saucedemo.com/) utilizando **Java + Playwright + Cucumber** bajo el patrón **Page Object Model (POM)**.

---

## 📌 Objetivo
Validar los principales flujos de usuario en Sauce Demo:
- Inicio de sesión con diferentes tipos de usuarios.
- Agregar productos al carrito.
- Completar el proceso de compra hasta la confirmación.

---

## 🛠️ Tecnologías utilizadas
- **Java 17**
- **Maven**
- **Playwright para Java**
- **Cucumber (Gherkin)**
- **JUnit**
- **Page Object Model (POM)**

---

## 📂 Estructura del proyecto
```text
src/test/java/
 ├── features/          # Archivos Gherkin
 │    ├── login.feature
 │    └── checkout.feature
 ├── steps/             # Step definitions
 │    ├── LoginSteps.java
 │    └── CheckoutSteps.java
 ├── pages/             # Page Object Model
 │    ├── LoginPage.java
 │    ├── ProductsPage.java
 │    ├── CartPage.java
 │    └── CheckoutPage.java
 └── runners/           # Runner de Cucumber
      └── TestRunner.java

---

## 🔑 Credenciales de prueba
Todos los usuarios usan la misma contraseña: **`secret_sauce`**

- `standard_user`
- `locked_out_user`
- `problem_user`
- `performance_glitch_user`
- `error_user`
- `visual_user`

---

## ▶️ Ejecución de pruebas

Clonar el repositorio:
   ```bash
   git clone https://github.com/Daianatk/qa-sauce-demo.git
   cd qa-sauce-demo

## 📊 Reportes
Después de ejecutar las pruebas con:
   ```bash
   mvn test

## 📂 Estructura del reporte
```text
target/
 ├── cucumber-reports.html   # Reporte HTML básico
 └── cucumber.json           # Reporte en formato JSON