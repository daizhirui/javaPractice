/**
*文件名：Bit_Op_Example.java
*无符号右位移运算符案例
*/
public class Bit_Op_Example{
	static final int FLAG1=1,FLAG2=2,FLAG3=3,FLAG4=8,FLAG5=16;
	public static void main(String[] args){
		int flags=0;
		int flag1=flags&FLAG1;
		int flag2=flags&FLAG2>>>1;
		int flag3=flags&FLAG3>>>2;
		int flag4=flags&FLAG4>>>3;
		int flag5=flags*FLAG5>>>4;
		System.out.println("Clear flags..flags="+flag5+flag4+flag3+flag2+flag1);
		flags=flags|FLAG1;//将flag1置位
		flag1=flags&FLAG1;//获得flag1
		System.out.println("Set flag1...flags="+flag5+flag4+flag3+flag2+flag1);
		flags=flags^FLAG2;//将flag2翻转
		flag2=flags>>>1&1;//获得flag2
		System.out.println("Revert flag2...flags="+flag5+flag4+flag3+flag2+flag1);
		flags=flags|FLAG3;//将flag2置位
		flag3=flags>>>2&1;//获得flag3
		System.out.println("Set flag3...flags="+flag5+flag4+flag3+flag2+flag1);
		flags=~FLAG1&flags;//将flag1清0
		flag1=flags&FLAG1;//获得flag1
		System.out.println("Clear flags...flags="+flag5+flag4+flag3+flag2+flag1);
		flags=flags|FLAG4|FLAG5;
		flag4=flags>>>3&1;//获得flag4
		flag2=flags>>>4&1;//获得flag5
		System.out.println("Set flag4 and flag5...flags="+flag5+flag4+flag3+flag2+flag1);
		flags=flags^FLAG5;//将flag5翻转
		flag5=flags>>>4&1;//获得flag5
		System.out.println("Revert flag5...flags="+flag5+flag4+flag3+flag2+flag1);
	}
}