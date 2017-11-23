
package com.wind.scala.base.matchs

/*Scala 提供了强大的模式匹配机制，应用也非常广泛。
一个模式匹配包含了一系列备选项，每个都开始于关键字 case。
每个备选项都包含了一个模式及一到多个表达式。
箭头符号 =>隔开了模式和表达式。
match对应Java里的 switch,但是写在选择器表达式之后。即 选择器 match {备选项}。
match 表达式通过以代码编写的先后次序尝试每个模式来完成计算，
只要发现有一个匹配的case，剩下的case不会继续匹配。*/

// 样例类
/*在声明样例类时，下面的过程自动发生了：
构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做；
在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
提供unapply方法使模式匹配可以工作；
生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义。*/
case class Person(name: String, age: Int)
object MatchObj {
  def base(): Unit = {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32)   => {println("Hi Bob!")}
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name)
      }
    }
  }
  //_占位符 表示unexpected 若没有满足的，则是unexpected
  def matchMethod(x: Any): Any = x match {
    case 1      => "one"
    case "two"  => 2
    case y: Int => "scala.Int"
    //case _      => "many"
    case unexpected => "unexpected"
      
  }
  //占位符_
  def matchvariable():Unit = {
    for{
      x<-Seq(1,2,3,3.6,"one","two","three")
    }{
      val str = x match {
        case 1 | 3     
        
        =>"int 1"
        case _:Int     =>"other int:"+x
        case _:Double  =>"a double:"+x
        case "one"     =>"string one"
        case _:String  =>"other string:"+x
        case _         =>"unexpected value:"+x
      }
      print(str+"\t")
    }
    println()
  }
  def main(args: Array[String]): Unit = {
    //base()
    //println(matchMethod("two"))
    //println(matchMethod("test"))
    //println(matchMethod(1))
    //println(matchMethod(6))
    matchvariable()
  }
}