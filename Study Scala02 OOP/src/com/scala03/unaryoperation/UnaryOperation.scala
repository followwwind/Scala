package com.scala03.unaryoperation

/**
 * 一元操作符
 */
case class Complex(real:Double,imag:Double){
  def unary_- : Complex = Complex(-real,imag)
  def -(other:Complex) = Complex(real-other.real,imag-other.imag)
}
object UnaryOperation {
  def main(args: Array[String]): Unit = {
    val c1 = Complex(1.1,2.2)
    val c2 = c1-Complex(0.5,1.0)
    println(c2)
    val c3 = -c1
    println(c3)
    val c4 = c1.unary_-
    println(c4)
  }
}