package com.spark01.base

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import com.spark.util.SparkContext4SUtils
import org.apache.spark.rdd.RDD
/**
 * 对RDD进行基本的RDD转化操作
 */
object RDDBase{
  val sc:SparkContext = new SparkContext4SUtils().getSc("My App")
  def base() :Unit={
    //计算各值的平方
    val list = List(1,2,3,4,5)
    val input = sc.parallelize(list)
    val result = input.map(x => x*x)
    println(result.collect().mkString(","))
    //将行数据切分为单词
    val strs = List("hello world","hi")
    val lines = sc.parallelize(strs)
    val words = lines.flatMap(line =>line.split(" "))
    println(words.first())
  }
  /**
   * rdd方法map与flatmap的区别
   * map是对rdd中的每一个元素进行操作，flatmap是对rdd中每一个元素进行拆分操作
   * flatmap通常用来切分单词
   */
  def mapandflatmap() :Unit= {
    val list = List("coffee panda","happy panda","happiest panda party")
    println(list)
    val rdd = sc.parallelize(list)
    //val map = rdd.map(x =>x)
    val map2 = rdd.map(x => x.split(" "))
    val collects: Array[Array[String]] = map2.collect()
    
    //println(map.collect().mkString(","))
    //println(map2)
    map2.foreach { x => println(x.mkString(",")) }
    println(collects(0)(0));
    //println(rdd.first())
    //val flatmap = rdd.flatMap(x =>x)
    val flatmap2 = rdd.flatMap(x =>x.split(" "))
    //println(flatmap.collect().mkString(","))
    println(flatmap2.collect().mkString(","))
  }
  /**
   * rdd filter操作
   */
  def filter():Unit = {
    val rdd = sc.parallelize(List(1,2,3,4,5))
    val result = rdd.filter( x =>x!=2)
    val result2 = rdd.filter { x => x!=2&&x!=3}
    println(result.collect().mkString(","))
    println(result2.collect().mkString(","))
  }
  /**
   * rdd distinct 去重
   */
  def distinct() :Unit ={
    val rdd = sc.parallelize(List(1,2,3,4,5,3))
    val result = rdd.distinct()
    println(result.collect().mkString(","))
  }
  def main(args: Array[String]): Unit = {
    //base()
    mapandflatmap()
    //filter()
  }
}