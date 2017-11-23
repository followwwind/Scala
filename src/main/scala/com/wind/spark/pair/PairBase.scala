package com.wind.spark.pair

import com.wind.spark.util.SparkContext4SUtils
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object PairBase {
  val sc:SparkContext = new SparkContext4SUtils().getSc("My App")
  val rdd :RDD[(Int,Int)]= sc.parallelize(List((1,2),(3,4),(3,6)))
  def base():Unit = {
    //合并具有相同键的值 {(1,2),(3,10)}
    val result = rdd.reduceByKey((x,y)=>x+y)
    println(result.collect().mkString(","))
    //对具有相同键的值进行分组 {(1,2),(3,[4,6])}
    val group = rdd.groupByKey()
    
    //对pair RDD中的每个值应用进行+1
    val mapvalues = rdd.mapValues(x=>x+1)
    
  }
  def main(args: Array[String]): Unit = {
    base()
  }
}