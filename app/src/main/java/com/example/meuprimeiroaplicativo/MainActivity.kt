package com.example.meuprimeiroaplicativo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private operator fun Int.compareTo(pair: Pair<Int, Int>): Unit = Unit

class MainActivity : AppCompatActivity() {
    fun isFibonacci(n: Int): Boolean {
        var a = 0
        var b = 1
        while (a < n) {
            val temp = a
            a = b
            b = temp + b
        }
        return a == n
    }

    fun printFibonacciMessage(n: Int) {
        val message = if (isFibonacci(n)) "$n pertence à sequência de Fibonacci." else "$n não pertence à sequência de Fibonacci."
        println(message)
    }

    fun main() {
        val number = 21 // substitua pelo número que deseja verificar
        printFibonacciMessage(number)
    }

    fun countLetterA(input: String): Pair<Boolean, Int> {
        val count = input.count { it.equals('a', ignoreCase = true) }
        return count > 0 to count
    }

    fun printResult(exists: Boolean, count: Int) {
        if (exists) {
            println("A letra 'a' aparece $count vez(es) na string.")
        } else {
            println("A letra 'a' não aparece na string.")
        }
    }


}

