package com.wind.scala.base.loop

import java.io.File

object IfLoop {
  def base() : Unit = {
    if(2+2==5){
      println("2+2==5")
    }else if(2+2==3){
      println("2+2==3")
    }else{
      println("2+2==4")
    }
  }
  //if循环结构可以有返回值
  def advance() : Unit = {
    val file:File = new File("src/com/scala02/loopstructure/note.txt")
    val path = if(file.exists()){
      file.getAbsolutePath()
    }else{
      file.createNewFile()
      file.getAbsoluteFile()
    }
    println(path)
  }
  def main(args: Array[String]): Unit = {
    base()
    advance()
  }
}