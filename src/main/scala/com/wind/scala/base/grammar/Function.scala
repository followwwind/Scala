package com.wind.scala.base.grammar

/**
 * 函数的定义
 */
object Function {
  
  /*def functionName ([参数列表]) : [return type] = {
   function body
   return [expr]
	}
	*/
  def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      //sum = a + b
      sum = a.+(b)
      //return sum
      sum
  }
  def addFloat(a:Float,b:Float) = a+b
  //Unit相当于void 没有返回值
  
  def multipleArg(xs:Int*) : Unit = {
    //println()
    for (x <- xs.iterator) {  
      print(x+"\t")
    }
    println()
  }
  def main(args: Array[String]): Unit = {
    //addInt(1, 2)
    println(addInt(1,2))
    //闭包
    val addDouble = (a:Double,b:Double)=>a+b
    println(addDouble(1.2,2.7))
    multipleArg(1,2,3)
  }
}