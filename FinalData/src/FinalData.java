/**
* 文件名：FinalData.java
* final数据成员的用法
*/
class Value{
	int i=1;
}
public class FinalData{
	//这是编译期常量
	final int i1=9;
	static final int I2=99;
	//典型的公有常量
	public static final int I3=39;
	//以下不是编译时常量
	final int i4=(int)(Math.random()*20);
	final static int i5=(int)(Math.random()*20);
	Value v1=new Value();
	final Value v2=new Value();
	static final Value v3=new Value();	//final和static没有先后顺序的限制
	//!final Value v4;		//错误，未对v4进行初始化
	//常数组
	final int[] a={1,2,3,4,5};
	public void print(String id){
		System.out.println(id+":i4="+i4+",i5="+i5);
	}
	public static void main(String[] args){
		FinalData fd1=new FinalData();
		//!fd1.i1++;		//这是一个错误，不能对常量进行加1改变
		fd1.v2.i++;			//此处是正确的，尽管v2是常量，但是v2中的i不是常量，可以进行改变
		fd1.v1=new Value();	//此处是正确的，v1并未声明为final，可以改变
		for(int i=0;i<fd1.a.length;i++)
			fd1.a[i]++;			//正确，对象不是常量
		//!fd1.v2=new Value();	//错误，v2是常量，不能改变
		//!fd1.v3=new Value();	//错误，v3是常量，不能改变该句柄
		//!fd1.a=new int[3];	//错误，a是常量数组，内容不可变
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2=new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
	}
}