/**
* 文件名：Circle.java
*/
package firstpackage;
//接口的实现
public class Circle implements Shape2D{
	double radius;
	String color;
	public Circle(double r)//构造方法
	{
		radius=r;
	}
	//实现子接口的方法
	public double area(){
		return (pi*radius*radius);
	}
	//实现父接口的方法
	public String setColor(String str){
		color=str;
		System.out.println();
		return str;
	}
}