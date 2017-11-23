package com.wind.scala.collection.list

/**
 * Scala 列表类似于数组，它们所有元素的类型都相同，但是它们也有所不同：
		列表是不可变的，值一旦被定义了就不能改变，
		其次列表 具有递归的结构（也就是链接表结构）
		而数组不是。。列表的元素类型 T 可以写成 List[T]。
	*/
object ListObj {
  //定义列表
  def base(): Unit = {
    // 字符串列表
    val site: List[String] = List("Runoob", "Google", "Baidu")
    println(site)
    // 整型列表
    val nums: List[Int] = List(1, 2, 3, 4)
    // 空列表
    val empty: List[Nothing] = List()
    // 二维列表
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1))
  }
  //构造列表的两个基本单位是 Nil 和 ::  Nil 也可以表示为一个空列表。
  def base2(): Unit = {
    // 字符串列表
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    // 整型列表
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    // 空列表
    val empty = Nil
    // 二维列表
    val dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
  }
  def method(): Unit = {
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val nums = Nil
    println("网站是 : " + site)
    println("第一网站是 : " + site.head)
    println("最后一个网站是 : " + site.tail)
    println("查看列表 site 是否为空 : " + site.isEmpty)
    println("查看 nums 是否为空 : " + nums.isEmpty)
  }
  def method2(): Unit = {
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site2 = "Facebook" :: ("Taobao" :: Nil)
    // 使用 ::: 运算符
    var fruit = site1 ::: site2
    println("site1 ::: site2 : " + fruit)
    // 使用 Set.:::() 方法
    fruit = site1.:::(site2)
    println("site1.:::(site2) : " + fruit)
    // 使用 concat 方法
    fruit = List.concat(site1, site2)
    println("List.concat(site1, site2) : " + fruit)
  }
  def method3(): Unit = {
    // List.fill() 方法来创建一个指定重复数量的元素列表：
    val site = List.fill(3)("Runoob") // 重复 Runoob 3次
    println("site : " + site)
    val num = List.fill(10)(2) // 重复元素 2, 10 次
    println("num : " + num)
    /*List.tabulate() 方法是通过给定的函数来创建列表。
          方法的第一个参数为元素的数量，可以是二维的，第二个参数为指定的函数，
          我们通过指定的函数计算结果并返回值插入到列表中，起始值为 0*/
    // 通过给定的函数创建 5 个元素
    val squares = List.tabulate(6)(n => n * n)
    println("一维 : " + squares)

    // 创建二维列表
    val mul = List.tabulate(4, 5)(_ * _)
    println("多维 : " + mul)
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    println("site 反转前 : " + site1)
    println("site 反转前 : " + site1.reverse)
  }
  //对集合的常用操作
  def method4(): Unit = {
    val left = List(1, 2, 3)
    val right = List(4, 5, 6)
    //以下操作等价
    left ++ right // List(1,2,3,4,5,6)
    left ++: right // List(1,2,3,4,5,6)
    right.++:(left) // List(1,2,3,4,5,6)
    right.:::(left) // List(1,2,3,4,5,6)
    //以下操作等价
    0 +: left //List(0,1,2,3)
    var add=left.+:(0) //List(0,1,2,3)
    println(add)
    //以下操作等价
    left :+ 4 //List(1,2,3,4)
    var add2=left.:+(4) //List(1,2,3,4)
    println(add2)
    //以下操作等价
    5 :: left //List(5,1,2,3)
    println((5 :: left).sorted)
    println((5 :: left).sorted)
    left.::(0) //List(0,1,2,3)
    println(left)  
    right.foreach { i => print(i+" ") }
  }
  def main(args: Array[String]): Unit = {
    //base()
    //method()
    //method2()
    //method3()
    method4()
  }
}