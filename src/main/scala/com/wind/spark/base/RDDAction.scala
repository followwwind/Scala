package com.wind.spark.base

import com.wind.spark.util.SparkContext4SUtils
import org.apache.spark.SparkContext


/**
 * 对RDD进行基本的RDD行动操作
 */
object RDDAction {
  val sc:SparkContext = new SparkContext4SUtils().getSc("My App")
  val rdd = sc.parallelize(List(1,2,3,3))
  def base():Unit= {
    val collect:Array[Int] = rdd.collect()
    val count:Long = rdd.count()
    //各元素在RDD中出现的次数
    val value = rdd.countByValue() 
    val take:Array[Int] =rdd.take(2)
    val top:Array[Int] = rdd.top(2)
    val takeOrdered =rdd.takeOrdered(2)
    
    //并行整合rdd中所有的数据 例如求和
    val reduce:Long = rdd.reduce((x,y)=>x+y)
    val fold =rdd.fold(0)((x,y)=>x+y)
    
    println(value)
  }
  def main(args: Array[String]): Unit = {
    base()
  }
}