Feature: registro Usuario y compra de un producto

  @registroUsuario
  Scenario: Registro Usuario Exitoso
    Given que estoy en el home de advantage shopping
    When realizo el registro de un nuevo usuario
    Then Valido que usuario se creo y cierro la pagina

  @compraExitosa
  Scenario: Compra exitosa de una laptop
    Given que estoy en el home de advantage shopping
    When Realizo inicio de sesion y valido que el inicio de sesion fue exitoso
    And Selecciono una laptop y valido el nombre
    And Agrego el carrito al carro y navego al pago
    Then Valido que el nombre de la laptop sea la misma a la escogida y cierro la pagina
