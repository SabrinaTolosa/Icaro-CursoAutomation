# language: es

Característica: Favorito

  @critical
  Escenario: Agregar a favoritos

    Dado que el usuario ingresa a la página de opencart
    Y el usuario busca un producto
    Y la pagina muestra los productos encontrados
    Cuando el usuario agrega un producto a favoritos
    Entonces se valida que se agrego a la lista de favoritos

