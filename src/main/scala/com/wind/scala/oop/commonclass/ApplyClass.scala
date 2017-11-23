package com.wind.scala.oop.commonclass

/**
 * 对于case类,主构造器的参数默认为val类型
 */
case class Apply(
    name:String,
    age:Option[Int]
){
  def this(name:String) = this(name,None)
}
object Apply{
  def apply(name:String) : Apply = new Apply(name,None)
}
object ApplyClass {
  def main(args: Array[String]): Unit = {
    val apply = new Apply("follow",Some(18))
    val apply1 = Apply("followwwind")
    println(apply)
    println(apply1.name)
    
  }
}