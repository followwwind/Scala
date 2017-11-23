package com.wind.scala.collection.map

/*Map(映射)是一种可迭代的键值对（key/value）结构。
所有的值都可以通过键来获取。
Map 中的键都是唯一的。
Map 也叫哈希表（Hash tables）。
Map 有两种类型，可变与不可变，区别在于可变对象可以修改它，而不可变对象不可以。
默认情况下 Scala 使用不可变 Map。如果你需要使用可变集合，
你需要显式的引入 import scala.collection.mutable.Map 类
在 Scala 中 你可以同时使用可变与不可变 Map，
不可变的直接使用 Map，可变的使用 mutable.Map。*/
object MapObj {
  //不可变哈希表
  def immutableMap(): Unit = {
    // 空哈希表，键为字符串，值为整型
    var nums: Map[Char, Int] = Map()
    nums += ('I' -> 1)
    nums += ('J' -> 5)
    nums += ('K' -> 10)
    nums += ('L' -> 100)
    // Map 键值对演示
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
    println("colors 中的键为 : " + colors.keys)
    println("colors 中的值为 : " + colors.values)
    println("检测 colors 是否为空 : " + colors.isEmpty)
    println("检测 nums 是否为空 : " + nums.isEmpty)
    var c: Char = ' '
    for (c <- nums.keySet) {
      println(c + "->" + nums.get(c))
    }
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    sites.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + sites(i))
    }
  }
  //可变哈希表
  def mutableMap(): Unit = {

  }
  def main(args: Array[String]): Unit = {
    immutableMap();
  }
}