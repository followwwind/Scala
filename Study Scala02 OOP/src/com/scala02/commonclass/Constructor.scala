package com.scala02.commonclass
/**
 * Scala将主构造器与零个或多个辅助构造器区分开
 */
class Address(street: String, city: String, state: String, zip: String) {
  def this(zip: String) =
    this("[unknown]", Address.zipToCity(zip), Address.zipToState(zip), zip)
  /**
   * 重写父类方法
   */
  override def toString = s"$zip-$state-$city-$street"
}

object Address {
  def zipToCity(zip: String) = "Anytown"
  def zipToState(zip: String) = "CA"
}

object Animals{
  def printString() = "welcome to zoom!!!"
}

class Person(name: String,age: Option[Int], address: Option[Address]) {
  def this(name:String) = this(name,None,None)
  def this(name:String,age:Int) = this(name,Some(age),None)
  def this(name:String,age:Int,address:Address) =  
    this(name,Some(age),Some(address))
  def this(name:String,address:Address) = this(name,None,Some(address))
  override def toString = s"Person($address,$age,$name)"
}
object Constructor {
  def person = {
    val a1 = new Address("scala","shanghai","1","123")
    println(a1)
    val a2 = new Address("111")
    println(a2)
    val p1 = new Person("Black")
    println(p1)
    val p2 = new Person("White",a1)
    println(p2)
  }
  def main(args: Array[String]): Unit = {
    println(Animals.printString())  
    person
    
  }
}