package com.wind.scala.base.grammar

object Operation {
  /*算数运算*/
  def arithmetic() {
    var a = 10
    var b = 20
    var c = 25
    var d = 25
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))
  }
  /*关系运算*/
  def relation() {
    var a = 10
    var b = 20
    println("a == b = " + (a == b))
    println("a != b = " + (a != b))
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("b >= a = " + (b >= a))
    println("b <= a = " + (b <= a))
  }
  /*逻辑运算*/
  def logic() {
    var a = true
    var b = false

    println("a && b = " + (a && b))

    println("a || b = " + (a || b))

    println("!(a && b) = " + !(a && b))
  }
  /*位运算*/
  def place() {
    var a = 60 /* 60 = 0011 1100 */
    var b = 13 /* 13 = 0000 1101 */
    var c = 0
    c = a & b /* 12 = 0000 1100 */
    println("a & b = " + c)
    c = a | b /* 61 = 0011 1101 */
    println("a | b = " + c)
    c = a ^ b /* 49 = 0011 0001 */
    println("a ^ b = " + c)
    c = ~a /* -61 = 1100 0011 */
    println("~a = " + c)
    c = a << 2 /* 240 = 1111 0000 */
    println("a << 2 = " + c)
    c = a >> 2 /* 215 = 1111 */
    println("a >> 2  = " + c)
    c = a >>> 2 /* 215 = 0000 1111 */
    println("a >>> 2 = " + c)
  }
  /*赋值运算*/
  def assignment() {
    var a = 10
    var b = 20
    var c = 0
    c = a + b
    println("c = a + b  = " + c)
    c += a
    println("c += a  = " + c)
    c -= a
    println("c -= a = " + c)
    c *= a
    println("c *= a = " + c)
    a = 10
    c = 15
    c /= a
    println("c /= a  = " + c)
    a = 10
    c = 15
    c %= a
    println("c %= a  = " + c)
    c <<= 2 
    println("c <<= 2  = " + c)
    c >>= 2
    println("c >>= 2  = " + c)
    c >>= 2
    println("c >>= a  = " + c)
    c &= a
    println("c &= 2  = " + c)
    c ^= a
    println("c ^= a  = " + c)
    c |= a
    println("c |= a  = " + c)
  }
  def main(args: Array[String]){
     arithmetic()
  }
}