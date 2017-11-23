package com.wind.scala.base.array

import Array._
object ArrayObj {
  /*定义数组*/
  def base(): Unit = {
    var z: Array[String] = new Array[String](3)
    var arr = new Array[String](3)
    var myList = Array(1, 2, 3)
    
    //二维数组
    var myMatrix = ofDim[Int](3,3)
    //创建区间数组 最后参数为步进 默认为1
    var list = range(10, 20, 2) //10 12 14 16 18
  }
  /*for 循环处理数组   遍历数组*/
  def forArray(): Unit = {
    var myList = Array(1.9, 2.9, 3.4, 3.5)
    // 输出所有数组元素
    for (x <- myList) {
      println(x)
    }
    // 计算数组所有元素的总会
    var total = 0.0
    for (i <- myList.indices) {
      total += myList(i);
    }
    println("总和为 " + total);
    // 查找数组中的最大元素
    var max = myList(0);
    for (i <- 1 until  myList.length) {
      if (myList(i) > max) 
        max = myList(i)
    }
    println("最大值为 " + max);
  }
  /*数组处理方法*/
  def method():Unit={
    val arr:Array[Int] = Array(1,2,3,4)
    for{
      a <- arr 
      tmp = if(a<4)a
    }{
      print(tmp + "\t")
    }
    println()
    for(a <- arr if a != 3){
      print(a + "\t")
    }
  }
  def main(args: Array[String]): Unit = {
      forArray()
//      method()
  }
}