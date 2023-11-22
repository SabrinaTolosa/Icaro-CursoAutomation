# language: es

Característica: Carrito

  @critical
  Escenario: Agregar a carrito

    Dado que el usuario ingresa a la página de opencart
    Y el usuario busca un producto
    Y la pagina muestra los productos encontrados
    Cuando el usuario agrega un producto al carrito
    Entonces se valida que se agrego al carrito
