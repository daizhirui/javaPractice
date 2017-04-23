/**
* 文件名：SimpleConstructor.java
* 普通构造方法
*/
class Rock{
	Rock(){//这就是构造方法
		System.out.println("CreatingRock");
	}
}
public class SimpleConstructor{
	public static void main(String[] args){
		for(int i=0;i<10;i++){//生成10个Rock对象
			new Rock();
		}
	}
}
