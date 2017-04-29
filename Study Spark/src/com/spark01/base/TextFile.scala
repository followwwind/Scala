package com.spark01.base

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import com.spark.util.SparkContext4SUtils
import org.apache.spark.rdd.RDD

object TextFile {
  var sc: SparkContext = new SparkContext4SUtils().getSc("My App")
  def text(): Unit = {
    val path: String = "E:/CodeWorkspace/ScalaWorkspace/Study Spark"+
      "/src/com/spark01/base/note.txt"
    val outputFile: String = "E:/CodeWorkspace/ScalaWorkspace/Study Spark"+
      "/src/com/spark01/base/out"
    val lines: RDD[String] = sc.textFile(path)
    println("读取文件:" + lines)
    println("总共行数:" + lines.count())
    println("第一行:" + lines.first())

    println("把它切成一个一个单词")
    val words = lines.flatMap(line => line.split(" "))
    words.foreach(x => println(x))
    println("转换成键值对并计数")
    val counts = words.map(word => (word, 1)).reduceByKey { case (x, y) => x + y }
    counts.foreach(x => println(x))
    //counts.repartition(1).saveAsTextFile(outputFile)
    //counts.foreach(x=>println(x))
  }
  def main(args: Array[String]): Unit = {
    text()
  }
}