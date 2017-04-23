/**
* 文件名：ClassTest.java
* 如何获取Class类对象
*/
package ex5_4;
class A{
	String name;
	public A(){
		name="me";
	}
	public String toString(){
		return this.getClass().getName();
	}
}
public class ClassTest{
	public static void main(String[] args)throws Exception{
		A a1=new A();
		System.out.println("a1="+a1);
		A a2=a1.getClass().newInstance();
		a2.name="you";
		//Class<A> c1=Class.forName("A");
		//System.out.println(c1.getSuperclass());
		
	}
}