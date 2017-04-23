/**
* 文件名：InterfaceTester.java
*/
package firstpackage;
public class InterfaceTester{
	public static void main(String[] args){
		Shape2D cir2;
		cir2=new Circle(20);
		cir2.setColor("red");
		System.out.println("圆20的面积为："+cir2.area());
		System.out.println("圆的颜色为："+cir2.setColor("red"));
	}
}