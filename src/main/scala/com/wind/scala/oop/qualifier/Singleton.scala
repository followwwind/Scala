package com.wind.scala.oop.qualifier

// 私有构造方法
class Marker private(val color:String) {  
  
  println("Creating " + this)  
    
  override def toString(): String = "marker color "+ color  
    
}  
  
// 伴生对象，与类共享名字，可以访问类的私有属性和方法  
object Marker{  
    
    private val markers: Map[String, Marker] = Map(  
      "red" -> new Marker("red"),  
      "blue" -> new Marker("blue"),  
      "green" -> new Marker("green")  
    )  
      
    def apply(color:String) = {  
      if(markers.contains(color)) markers(color) else null  
    }  
    
      
    def getMarker(color:String) = {   
      if(markers.contains(color)) markers(color) else null  
    }  
}  

object Singleton {
  def main(args: Array[String]): Unit = {
    val color:Marker =Marker.getMarker("white")
    println(color)
  }
}