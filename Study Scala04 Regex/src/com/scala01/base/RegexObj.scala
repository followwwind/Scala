package com.scala01.base

import scala.util.matching.Regex

/*Scala 通过 scala.util.matching 包种的 Regex 类来支持正则表达式。 */
object RegexObj {
  def findFirstIn(): Unit = {
    val pattern = "Scala".r
    val str = "Scala is Scalable and cool"
    println(pattern findFirstIn str)//Some(Scala)
  }
  def mkString(): Unit = {
    val pattern = new Regex("(S|s)cala") // 首字母可以是大写 S 或小写 s
    val str = "Scala is scalable and cool"
    println((pattern findAllIn str).mkString(","))//Scala,scala
    // 使用逗号 , 连接返回结果
  }
  def replaceFirstIn(): Unit = {
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"
    //Java is scalable and cool
    println(pattern replaceFirstIn (str, "Java"))
  }
  def main(args: Array[String]): Unit = {
    findFirstIn()
    mkString()
    replaceFirstIn()
  }
}