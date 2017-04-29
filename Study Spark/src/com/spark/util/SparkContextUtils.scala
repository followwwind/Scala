package com.spark.util

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SparkContextUtils {
  def main(args: Array[String]): Unit = {
    //var sc:SparkContext = new SparkContext4SUtils().getSc("My App")
    //println(sc)
    var str ="ss\"+adad"
    if(str.matches("[\\s]*([\"][+][\\s]*)")){
      println("111")
    }else{
      println("222")
    }
  }
}