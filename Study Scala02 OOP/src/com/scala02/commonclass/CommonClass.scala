package com.scala02.commonclass

/**
 * 如果在主构函数参数的前面加上val或var关键字,该参数就成为
 * 实例的一个字段。对于case类，val是默认的
 */
class Name(var value:String)
class Age(value:Int)
object CommonClass {
  /**
   * 注意value_=这个方法名的一般规范
   * 编译器允许去掉_，转而使用中缀表达式
   */
  def name() : Unit= {
    val name = new Name("Buck")
    println(name)
    println(name.value)
    name.value_=("Bob")
    println(name.value)
    
    name.value="Hank"
    println(name.value)
  }
  def age () :Unit ={
    val age = new Age(18)
    println(age)
  }
  def main(args: Array[String]): Unit = {
    
  }
}