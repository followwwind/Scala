package com.scala01.base

object DataType {
  def dateType() {
    var s = "string"
    println("String:" + s)
    var i = 1
    println("Int:" + i)
    var l = 123l
    println("Long:" + l)
    var f = 3.14f
    println("Float:" + f)
    var d = 3.14 //小数默认为double
    println("Double:" + d)
    var b = true
    println("Boolean:" + b)

    //多行字符字符串表示法
    var str = """Welcome
       to
       Scala
      """
    println("String:" + str)
  }
  /*
   * 在 Scala 中声明变量和常量不一定要指明数据类型，
   * 在没有指明数据类型的情况下，其数据类型是通过变量或常量的初始值推断出来的。
	 * 所以，如果在没有指明数据类型的情况下声明变量或常量必须要给出其初始值，
	 * 否则将会报错。
   */
  def variable() {
    var s:String=""
    //定义常量
    val c:Int=2
    //scala支持多变量赋值
    val xmax, ymax = 100  // xmax, ymax都声明为100
    
    //如果方法返回值是元组，我们可以使用 val 来声明一个元组：
    val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
    //也可以不指定数据类型：
    val (myVar3, myVar4) = Pair(40, "Foo")
    //变量声明不一定需要初始值，以下也是正确的：
    
  }
  def main(args: Array[String]): Unit = {
    dateType();
  }
}