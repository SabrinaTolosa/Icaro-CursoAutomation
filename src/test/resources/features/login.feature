# language: es

Característica: Login

  @smoke @critical
  Escenario: Login exitoso
    # Dado que el usuario ingresa al login
    Dado que el usuario ingresa a la página de opencart
    Y el usuario ingresa al login
    Cuando el usuario ingresa credenciales validas
    Entonces se valida que el usuario se encuentra en su cuenta
