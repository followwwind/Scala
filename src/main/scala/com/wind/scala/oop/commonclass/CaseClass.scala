package com.wind.scala.oop.commonclass

/**
 * 编译器会自动为case类的主构造器创建apply方法
 */
case class Emp(name:String,age:Int,gender:Option[Char])
object CaseClass {
  def main(args: Array[String]): Unit = {
    val emp = new Emp("follow",21,Some('m'))
    println(emp)
    println(emp.gender)
    
    val emp1 = Emp("follow",21,Some('m'))
    
    
  }
}