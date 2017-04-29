package com.scala05.string

object String {
  
  /*在 Scala 中，字符串的类型实际上是 Java String，它本身没有 String 类。
	在 Scala 中，String 是一个不可变的对象，所以该对象不可被修改。
	这就意味着你如果修改字符串就会产生一个新的字符串对象。
	但其他对象，如数组就是可变的对象*/
   
  def base() :Unit={
    var greeting="hello world"
    var str:String="hello java";
    var s=new String("hello scala");
    println(greeting);
    println(str);
    println(s); 
  }
  //StringBuilder
  def stringBuilder():Unit={
    val buf = new StringBuilder;
    buf += 'a'
    buf ++= "bcdef"
    buf.append("g")
    //调用方法 可以去掉方法连接符以及括号
    buf append 'g'
    println( "buf is : " + buf.toString );
  }
  def stringMethod():Unit={
    var str="welcome to "
    var s=str.concat("scala")
    println(str+"java")
    println(s)
    println(s.length())
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "菜鸟教程!"
    var fs = printf("浮点型变量为 " +
                   "%f, 整型变量为 %d, 字符串为 " +
                   " %s", floatVar, intVar, stringVar)
    println(fs)
  }
  def main(args: Array[String]): Unit = {
    //base()
    stringMethod()
  }
}