package ex5_7;
/**
* 文件名：ArrayCopyTest.java
* System类arrayCopy方法演示
*/
public class ArrayCopyTest{
	static int[] a={10,15,20,25,30,35};
	static int[] b={0,0,0,0,0,0};
	public static void main(String[] args){
		System.out.println("before copy...");
		System.out.print("a:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.print("b:");
	}
}