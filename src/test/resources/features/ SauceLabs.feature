@AllTest
Feature: SauceLabs

  @SauceLabs
  Scenario Outline: Ingreso a la aplicación
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galería
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente con "<PRODUCTO>"

    Examples:
      | PRODUCTO                | UNIDADES |
      | Sauce Labs Bolt T-Shirt | 1        |
      | Sauce Labs Backpack     | 1        |
     # | Sauce Labs Bike Light   | 2        |


  @TestLogin
  Scenario: Login Ok
    Given estoy en la aplicación de SauceLabs me voy al menu y me logeo
    And inicio sesión con mi usuario "bod@example.com" y clave "10203040"
    And hago clic en LOGIN
    Then valido el login OK


  @TestCatalogo
  Scenario: Ordenar Catalogo
    Given estoy en la aplicación de SauceLabs voy al menu de orden
    And ordeno de forma decendente
    Then valido que carguen correctamente la galeria
