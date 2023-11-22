# language: es

Característica: Crear cuenta
  @critical
  Escenario: Crear cuenta
    Dado que el usuario ingresa a la página de opencart
    Y el usuario ingresa a crear cuenta
    Cuando el usuario se registra con datos validos
    Entonces se verifica que la cuenta se creo correctamente

#  Esquema del escenario: Crear cuenta parametrizado
#    Dado que el usuario ingresa a la página de opencart
#    Y el usuario ingresa a crear cuenta
#    Cuando el usuario se registra con nombre "<nombre>", apellido "<apellido>", email "<email>", telefono "<telefono>" y pass "<password>"
#    Entonces se verifica que la cuenta se creo correctamente

#    Ejemplos:
#      | nombre | apellido | email | telefono | password |
#      | pepo | pepito | pepo@pepo.com | 111111 | 123456 |
#      | ale | jandro | aj@aj.com | 111111 | 123456 |
#
#
#  Escenario: Crear cuenta parametrizado
#    Dado que el usuario ingresa a la página de opencart
#    Y el usuario ingresa a crear cuenta
#    Cuando el usuario se registra con los siguientes datos
#      | nombre | apellido | email | telefono | password |
#      | pepo | pepito | pepo@pepo.com | 111111 | 123456 |
#      | ale | jandro | aj@aj.com | 111111 | 123456 |
#    Entonces se verifica que la cuenta se creo correctamente
#


#  Esquema del escenario: : Crear cuenta fallidos
#    Dado que el usuario ingresa a la página de opencart
#    Y el usuario ingresa a crear cuenta
#    Cuando el usuario se registra con nombre "<nombre>", apellido "<apellido>", email "<email>", telefono "<telefono>" y pass "<password>"
#    Entonces se verifica el mensaje de error "<mensaje>"
#
#    Ejemplos:
#      | nombre | apellido | email | telefono | password | mensaje |
#      | ale | jandro | | 111111 | 123456 | fallo por email |
#      | | jandro |pepo@pepo.com | 111111 | 123456 | fallo por nombre |
#      |ale | jandro |pepo@pepo.com | | 123456 | fallo por telefono |