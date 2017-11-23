package com.wind.scala.collection.tuple

/*与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素。
元组的值是通过将单个的值包含在圆括号中构成的*/
object TupleObj {
  def base(): Unit = {
    val t = (1, 3.14, "Fred")
    val t1 = new Tuple3(1, 3.14, "Fred")
    val t2 = new Tuple4(1, 3.14, "Fred", true)
    //迭代元组
    t2.productIterator.foreach { x => print(x + " ") 
    if (x == t2._4) println() }
    val t3 = new Tuple2("www.google.com", "www.runoob.com")
    println("交换后的元组: " + t3.swap)
  }
  def main(args: Array[String]): Unit = {
    base()
  }
}