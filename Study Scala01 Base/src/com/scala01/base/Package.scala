package com.scala01.base
/*
 *Scala 定义包
	Scala 使用 package 关键字定义包，在Scala将代码定义到某个包中有两种方式：
	第一种方法和 Java 一样，在文件的头定义包名，这种方法就后续所有代码都放在该报中。比如：
	package com.runoob
	class HelloWorld
	第二种方法有些类似 C#，如：
	package com.runoob {
  	class HelloWorld 
	}
 */
/*
 * import 引用 Scala 使用 import 关键字引用包。
 * import语句可以出现在任何地方，而不是只能在文件顶部。
 * import的效果从开始延伸到语句块的结束。这可以大幅减少名称冲突的可能性。
 * 如果想要引入包中的几个成员，可以使用selector（选取器）：
 */
import java.awt.Color  // 引入Color
//import java.awt._  // 引入包内所有成员
import java.awt.event.ActionEvent
import java.awt.{Color, Font}
// 重命名成员
import java.util.{HashMap => JavaHashMap}
// 隐藏成员
import java.util.{HashMap =>_,_} // 引入了util包的所有成员，但是HashMap被隐藏了
import javax.swing._

object Package {
  def handler(evt:ActionEvent) { // java.awt.event.ActionEvent
    //...  // 因为引入了java.awt，所以可以省去前面的部分
  }
  def main(args: Array[String]): Unit = {
    //println()
    var frame:JFrame = new JFrame("window scala")
    frame.setVisible(true)
    frame.setBounds(300, 200, 300, 300)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  }
}




