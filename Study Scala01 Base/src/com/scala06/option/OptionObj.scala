package com.scala06.option

object OptionObj {
  def main(args: Array[String]): Unit = {
    var arr:Array[Option[Int]] = Array(Some(21),None,Some(18))
    /*for(a <- arr){
      println(a)
    }*/
    arr.foreach(x=>println(x))
    println(arr(0).get)
    val some:Some[(Int,Int)] = Some(0,1)
    //some.foreach(x=>println(x))
    println(some.get._1)
  }
}