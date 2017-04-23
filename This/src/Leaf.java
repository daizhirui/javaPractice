/**
* 文件名：Leaf.java
* 类名做返回值，this关键字的用法
*/
public class Leaf{
	private int i=0;
	Leaf increment(){
		i++;
		System.out.println(this);
		return this;
	}
	void print(){
		System.out.println("i="+i);
	}
	public static void main(String[] args){
		Leaf x=new Leaf();
		x.increment().increment().increment().print();
		System.out.println(x.increment());
	}
}