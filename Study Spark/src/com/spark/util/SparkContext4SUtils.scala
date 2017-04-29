package com.spark.util

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

class SparkContext4SUtils extends java.io.Serializable{
  
  def getSc(appName:String) : SparkContext = {
    var sc:SparkContext = null
    //sc单例模式(s)和多sc模式(m)
    var flag:String = "m"
    if(System.getProperty("os.name").toLowerCase().contains("window")){
      println("---local---")
      System.setProperty("hadoop.home.dir", "E:/Apache/Hadoop/hadoop-2.7.2")
      val sparkConf:SparkConf = new SparkConf()
      .setAppName(appName).setMaster("local")
      sc = new SparkContext(sparkConf)
      println("---get sc---")
      sc
    }else{
      //sc单例模式(s)和多sc模式(m)
      println("---master---")
      if(flag.equals("m")){
        
      }else{
        
      }
      println("---get sc---")
      sc
    }
  }
}