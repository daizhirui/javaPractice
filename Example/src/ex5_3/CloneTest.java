package ex5_3;
/**
* 文件名：CloneTest.java
* 重写equals、clone方法，并测试
*/
class Father{
	int i=9;
}
class Child extends Father implements Cloneable{
	int age;
	public Child(){
		age=12;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public boolean equals(Child o){
		return o.age==age;
	}
	public void setIOfFather(int i){
		super.i=i;
	}
	public int getIOfFather(){
		return super.i;
	}
}
public class CloneTest{
	public static void main(String[] args){
		Child c=new Child();
		try{
			Child copy=(Child)c.clone();
			System.out.println("c.equals(copy)="+c.equals(copy));
			copy.age=14;
			System.out.println("after modify copy.age...");
			System.out.println("c.age="+c.age);
			System.out.println("copy.age="+copy.age);
			System.out.println("c.super.i="+c.getIOfFather());
			System.out.println("copy.super.i="+copy.getIOfFather());
			copy.setIOfFather(10);
			System.out.println("after modify copy.super.age...");
			System.out.println("c.super.i="+c.getIOfFather());
			System.out.println("copy.super.i="+copy.getIOfFather());
		}catch(CloneNotSupportedException ex){
			System.out.println("clone failed");
		}
		
	}
}