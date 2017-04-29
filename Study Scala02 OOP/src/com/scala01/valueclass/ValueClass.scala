package com.scala01.valueclass


class Person(val value:Float)extends AnyVal{
  override def toString = "$%.2f".format(value)
}
class USPhoneNumber(val s:String) extends AnyVal{
  private def digits(str:String):String = str.replaceAll("""\D""","")
  override def toString = {
    val digs = digits(s)
    val areaCode = digs.substring(0, 3)
    val exchange = digs.substring(3, 7)
    val subnumber = digs.substring(7, 11)
    s"($areaCode) $exchange-$subnumber"
  }
}
object ValueClass {
  /**
   * 格式控制输出
   */
   def control(str:String,obj:Any) : Unit = {
     var s:String = str.format(obj)
     println(s)
   }
   
   def main(args: Array[String]): Unit = {
     control("$%c",97)
     val person = new Person(100)
     println(person)
     val usphone = new USPhoneNumber("187-7193-3975")
     println(usphone)
   }
}