/**
* 文件名： Polumorphism2.java
*  继承中的方法重定义示例2
*/
class Father{
	public void func1(){
		System.out.println("Father's func1");
		func2();
	}
	public void func2(){
		System.out.println("Father's func2");
	}
}
class Child extends Father{
	public void func1(int i){
		System.out.println("Child's func1");
	}
	public void func2(){
		System.out.println("Child's func2");
	}
}
public class Polymorphism2{
	public static void main(String[] args){
		Father father=new Father();
		father.func1();
		father.func2();
		Father child=new Child();
		child.func1();
		child.func2();
	}
}