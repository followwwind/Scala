package com.spark01.base

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import com.spark.util.SparkContext4SUtils
import org.apache.spark.rdd.RDD
/**
 * 对两个RDD进行转化操作
 */
object RDDToRDD {
  val sc:SparkContext = new SparkContext4SUtils().getSc("My App")
  val rdd1 = sc.parallelize(List(1,2,3))
  val rdd2 = sc.parallelize(List(3,4,5))
  /**
   * 并集
   * 
   */
  def union():Unit = {
    val result = rdd1.union(rdd2)
    println(result.collect().mkString(","))
  }
  /**
   * 交集
   */
  def intersection():Unit = {
    val result = rdd1.intersection(rdd2)
    println(result.collect().mkString(","))
  }
  /**
   * 差
   */
  def subtract():Unit = {
    val result = rdd1.subtract(rdd2)
    println(result.collect().mkString(","))
    val result2 = rdd2.subtract(rdd1)
    println(result2.collect().mkString(","))
  }
  /**
   * 笛卡尔积
   */
  def cartesian():Unit = {
    val result = rdd1.cartesian(rdd2)
    println(result.collect().mkString(","))
  }
  def main(args: Array[String]): Unit = {
    subtract()
  }
}