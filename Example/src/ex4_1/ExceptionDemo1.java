package ex4_1;
/**
* 文件名：ExceptionDemo1.java
* Java中的异常
*/
public class ExceptionDemo1{
	public static void main(String[] args){
		int n1=10;
		int n2=0;
		try{
			int result=n1/n2;
		System.out.println("两数相除的结果是："+result);
		}catch(ArithmeticException ex){
			System.out.println("出现除数为零的异常");
		}
	}
}
