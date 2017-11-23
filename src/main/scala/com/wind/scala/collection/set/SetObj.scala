package com.wind.scala.collection.set

import scala.collection.mutable.Set
/*Scala Set(集合)是没有重复的对象集合，所有的元素都是唯一的。
Scala 集合分为可变的和不可变的集合。
默认情况下，Scala 使用的是不可变集合，如果你想使用可变集合，
需要引用 scala.collection.mutable.Set 包。
默认引用 scala.collection.immutable.Set*/
object SetObj {
  //不可变集合
  def immutableSet(): Unit = {
    val set = Set(1, 2, 3)
    println(set.getClass.getName) // 
    println(set.exists(_ % 2 == 0)) //true
    println(set.drop(1)) //Set(2,3)
    println(set)
  }
  //可变集合
  /*注意： 虽然可变Set和不可变Set都有添加或删除元素的操作，
 		但是有一个非常大的差别。对不可变Set进行操作，会产生一个新的set，
  	原来的set并没有改变，这与List一样。 而对可变Set进行操作，
  	改变的是该Set本身，与ListBuffer类似。*/
  def mutableSet(): Unit = {
    import scala.collection.mutable.Set // 可以在任何地方引入 可变集合
    val mutableSet = Set(1, 2, 3)
    println(mutableSet.getClass.getName) // scala.collection.mutable.HashSet
    mutableSet.add(4)
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet -= 2
    println(mutableSet) // Set(5, 3, 4)
    val another = mutableSet.toSet  //设置为不可变
    println(another.getClass.getName) // scala.collection.immutable.Set
  }
  def main(args: Array[String]): Unit = {
    immutableSet()
    mutableSet()
  }
}