package introduccion

import javax.naming.OperationNotSupportedException

class EjercicioListas {
  /*
  * Punto 2 repetir lista
  * @param lista Lista a repetir
  * @param n Número de veces a repetir la lista
  * @return Lista repetida n veces
  * @example repetirLista(List(1, 2, 3), 2) = List(List(1,1),List(2,2),List(3,3))
  * @throws IllegalArgumentException si n es negativo
  */
  def repetirListas(lista: List[Int], n: Int): List[List[Int]] = {
    if (n < 0) {
      throw new IllegalArgumentException("n no puede ser menor que 0")
    }

    lista.map(item => List.fill(n)(item))
  }
  /*
  * Punto 3: Filtrar listas
  * @param criterioIn Criterio de filtrado que puede ser "mayor", "menor", "mayoroigual", "igual", "diferente" o "menoroigual"
  * @param n Número a comparar
  * @param lista Lista a filtrar
  * @return Lista filtrada de acuerdo al criterio y n
  * @throws IllegalArgumentException si el criterio no es uno de los valores válidos
  */

  def filtrarListas(criterioIn: String, n: Int, lista: List[Int]): List[Int] = {
    var criterio: String = criterioIn.toLowerCase()
    var listaFiltrada: List[Int] = List()
    //Complete el código

    criterio match {
      case "igual" => listaFiltrada = lista.filter(elem => elem == n)
      case "menor" => listaFiltrada = lista.filter(elem => elem < n)
      case "mayor" => listaFiltrada = lista.filter(elem => elem > n)
      case "menoroigual" => listaFiltrada = lista.filter(elem => elem <= n)
      case "diferente" => listaFiltrada = lista.filter(elem => elem != n)
      case "mayoroigual" => listaFiltrada = lista.filter(elem => elem >= n)

      case _ =>
        throw new IllegalArgumentException("Criterio no válido")
    }
    listaFiltrada
  }
}
