package org.example

import scala.annotation.tailrec
import scala.io.StdIn
import scala.io.StdIn.readLine

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computing factorial of " + n)

      result
    }
  }

  //println(factorial(50000))

  def anotherFactorial(n: BigInt): BigInt = {
    @tailrec
    def factHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }

  println(anotherFactorial(5))
}
