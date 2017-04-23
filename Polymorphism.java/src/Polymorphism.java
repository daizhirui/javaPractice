/**
* 文件名： Polumorphism.java
*  继承中的方法重定义示例1
*/
class Base{
	Base(){
		System.out.println("Base() before print()");
		print();
		System.out.println("Base() after print()");
	}
	public void print(){
		System.out.println("Base.print()");
	}
}
class Derived extends Base{
	int value;
	Derived(int val){
		value=val;
		System.out.println("Derived() with "+value);
	}
	public void print(){
		System.out.println("Derived.print() with "+value);
	}
}
public class Polymorphism{
	public static void main(String[] args){
		new Derived(123);
	}
}