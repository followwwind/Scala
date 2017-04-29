package com.scala01.list

import scala.collection.mutable.ListBuffer
object ListBufferObj {
  def base():Unit={
    var list:ListBuffer[String] =new ListBuffer()
    println(list)
    list +=("hello")
    list +=("scala")
    list +=("welcome")
    list +=("to")
    list +=("scala")
    list +=("!")
    println(list)
    var size=list.size
    list remove( size-1)
    //list -=("!")
    list foreach { x => print(x+" ")}
    println()
    for(a <- 0 until list.size){
      print(list(a)+" ")
    }
    println()
    for(ele<-list){
      print(ele+" ")
    }
    
  }
  def main(args: Array[String]): Unit = {
    base()
  }
}