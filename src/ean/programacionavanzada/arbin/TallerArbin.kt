/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Árboles Binarios
 * Fecha: 18 de abril de 2018
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.arbin

import ean.collections.IBinTree
import ean.collections.IList
import ean.collections.List
import java.lang.Math.max
import java.lang.Math.min

/**
 * Informar si un elemento se encuentra presente en un árbol binario
 */
fun <T> estaArbin(a: IBinTree<T>, elem: T): Boolean =
        if (a.isEmpty) {
            false
        }
        else if (a.root == elem) {
            true
        }
        else {
            estaArbin(a.left, elem) || estaArbin(a.right, elem)
        }

/**
 *   Calcular el peso de un árbol binario
 */
fun <T> peso(a: IBinTree<T>): Int {
    var peso = 0
    if(a.isEmpty) peso = 0
    else {
        peso += peso(a.left) +1
        peso += peso(a.right)
    }
    return peso

}

fun <T> esUnaHoja(a: IBinTree<T>): Boolean =
    TODO("Completar")

fun <T> contarHojas(a: IBinTree<T>): Int =
    TODO("Completar")

fun <T> altura(a: IBinTree<T>): Int =
    if (a.isEmpty){
        0
    }else{
        max(altura(a.left), altura(a.right))+1

    }

fun <T> preorden(a: IBinTree<T>): Unit {
    TODO("Completar")
}

fun <T> postorden(a: IBinTree<T>): Unit {
    TODO("Completar")
}

fun <T> inorden(a: IBinTree<T>) {
    if(!a.isEmpty){
        inorden(a.left)
        println(a.root)
        inorden(a.right)
    }
}

fun <T> nivelElementoArbol(a: IBinTree<T>, elem: T): Int =
    TODO("Completar")


/**
 *  Calcular cuantas veces aparece un elemento en un arbol
  */
fun <T> contarNumVecesApareceElemento(a: IBinTree<T>, e: T): Int =
    TODO()

/**
 * Calcula el menor entre 3 numeros
 */
fun menorEntreTres(a: Int, b: Int, c: Int) = min(a, min(b, c))

/**
 * Calcular el menor de un árbol binario
 */
fun menorArbol(arbol: IBinTree<Int>): Int =
    TODO("Completar")

/**
 * Retorna el elemento que es padre del elemento e. Retorna null si no existe tal padre
 */
fun <T> padre(a: IBinTree<T>, e: T): T? =
    TODO("Completar")

/**
 * Retorna el elemento que es hermano del elemento e. Retorna null si no tiene hermano
 */
fun <T> hermano(a: IBinTree<T>, e: T): T? =
    TODO("Completar")

/**
 * Clase de utilidad
 */
data class Materia(val codigo: Int, val notaFinal: Double)

/**
 * Operaciones interesantes
 */
fun materiasPerdidas(arbol: IBinTree<Materia>): IList<Materia> =
    if (arbol.isEmpty) {
        List<Materia>()
    }
    else {
        val perdidasIzq = materiasPerdidas(arbol.left)
        val perdidasDer = materiasPerdidas(arbol.right)
        val resultado = perdidasIzq + perdidasDer
        if (arbol.root.notaFinal < 60.0) {
            resultado.add(arbol.root)
        }
        resultado
    }

/**
 * Retorne null si el arbol es vacío
 */
fun materiaNotaMásAlta(arbol: IBinTree<Materia>): Materia? =
    TODO("Completar")

fun cuantasMateriasPorEncimaOchenta(arbol: IBinTree<Materia>): Int =
    TODO("Completar")

fun promedioNotasMateriasCódigoPar(arbol: IBinTree<Materia>): Double =
    TODO("Completar")
















