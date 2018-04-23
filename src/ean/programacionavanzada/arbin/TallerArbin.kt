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
        } else if (a.root == elem) {
            true
        } else {
            estaArbin(a.left, elem) || estaArbin(a.right, elem)
        }

/**
 *   Calcular el peso de un árbol binario
 */
fun <T> peso(a: IBinTree<T>): Int {
    var peso = 0
    if (a.isEmpty) peso = 0
    else {
        peso += peso(a.left) + 1
        peso += peso(a.right)
    }
    return peso

}

fun <T> esUnaHoja(a: IBinTree<T>): Boolean =
        !a.isEmpty && a.left.isEmpty && a.right.isEmpty

fun <T> contarHojas(a: IBinTree<T>): Int {
    var bandera = 0
    if (a.isEmpty == true) {
        0
    } else if (esUnaHoja(a)) {
        bandera += 1
    } else {
        bandera += contarHojas(a.left)
        bandera += contarHojas(a.right)
    }
    return bandera
}

fun <T> altura(a: IBinTree<T>): Int =
        if (a.isEmpty) {
            0
        } else {
            max(altura(a.left), altura(a.right)) + 1

        }

fun <T> preorden(a: IBinTree<T>): Unit {
    if (!a.isEmpty) {
        println(a.root)
        preorden(a.left)
        preorden(a.right)
    }
}

fun <T> postorden(a: IBinTree<T>): Unit {
    if (!a.isEmpty) {
        postorden(a.left)
        postorden(a.right)
        println(a.root)
    }
}

fun <T> inorden(a: IBinTree<T>) {
    if (!a.isEmpty) {
        inorden(a.left)
        println(a.root)
        inorden(a.right)
    }
}

fun <T> nivelElementoArbol(a: IBinTree<T>, elem: T): Int {
    var bandera = 0
    if (a.root == elem) {
        0
    } else if (estaArbin(a.left, elem) == true) {
        bandera += nivelElementoArbol(a.left, elem) + 1

    } else if (estaArbin(a.right, elem) == true) {
        bandera += nivelElementoArbol(a.right, elem) + 1
    }
    return bandera
}


/**
 *  Calcular cuantas veces aparece un elemento en un arbol
 */
fun <T> contarNumVecesApareceElemento(a: IBinTree<T>, e: T): Int{
    var bandera = 0
    if (a.isEmpty){
        0
    }else if (a.root == e) {
        bandera = 1
    }else{
        bandera += contarNumVecesApareceElemento(a.left,e)
        bandera += contarNumVecesApareceElemento(a.right,e)
    }
    return bandera
}

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
fun <T> padre(a: IBinTree<T>, e: T): T? {
    var bandera:T? = null
    if (a.isEmpty || a.root==e) {
        bandera = null
    }else if(a.left.isEmpty || a.left.root == e){
         bandera = a.root
    }else if (a.right.isEmpty || a.right.root == e){
         bandera = a.root
    }else{
        if (estaArbin(a.left,e)){
            bandera = padre(a.left,e)
        }else if (estaArbin(a.right,e)){
            bandera = padre(a.right,e)
        }
    }
    return bandera
}


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
        } else {
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
















