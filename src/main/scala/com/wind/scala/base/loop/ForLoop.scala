package com.wind.scala.base.loop

/**
 * 循环结构
 */
object ForLoop {
  def useBase(): Unit = {
    //to循环
    //
    //var a = 0
    println("******to循环******")
    for (a <- 0 to 10) {
      println("Value of a: " + a)
    }

    //until循环
    //a = 0
    // for 循环
    println("******until循环******")
    for (a <- 1 until 10) {
      println("Value of a: " + a)
    }

    //循环集合
    //a = 0
    val num = List(1, 2, 3, 4, 5, 6)
    println("******循环集合******")
    for (a <- num) {
      println("Value of a: " + a)
    }
    //在 for 循环 中你可以使用分号 (;) 来设置多个区间，它将迭代给定区间所有的可能值
    //a = 0
    //var b = 0
    println("******多区间循环******")
    for (a <- 1 to 3; b <- 1 to 3) {
      println("Value of a: " + a);
      println("Value of b: " + b);
    }

    //for循环过滤
    //a = 0
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("******循环过滤******")
    for (a <- numList if a != 3 if a < 8) {
      println("Value of a: " + a)
    }
  }
  def useYield() {
    //var a = 0
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // for 循环
    var retVal = for {
      a <- numList
      if a != 3
      if a < 8
    } yield a
    // 输出返回值
    for (a <- retVal) {
      println("Value of a: " + a)
    }
  }
  /**
   * 扩展作用域与值定义
   */
  def useAdvance() : Unit = {
    val dogBreeds = List("Doberman","Yorkshire Terrier",
        "Dachshund","Scottish Terrier","Great Dane")
    for{
      breed <- dogBreeds
      upcaseBreed = breed.toUpperCase()
    }println(breed+","+upcaseBreed)
    
    val animals = List(Some("dog"),None,Some("cat"),
        Some("monkey"),None,Some("fox"))
    println("first pass:")
    for{
      animal <-animals
      tmp <- animal
      upcaseTmp = tmp.toUpperCase()
    }println(animal)
    
    println("second pass:")
    for{
      Some(animal) <-animals
      upcase = animal.toUpperCase()
    }{
      print(animal)
      println(","+upcase)
    }
  }
  def main(args: Array[String]): Unit = {
    //useYield()
    useBase()
    //useAdvance()
  }
}