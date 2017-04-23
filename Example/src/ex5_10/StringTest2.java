package ex5_10;
/**
* 文件名：StringTest2.java
* 在字符串中查找
*/
public class StringTest2{
	public static void main(String[] args){
		String s="I love you,China!";
		int i=s.indexOf('o');
		if(i==-1)
			System.out.println(s+"不包含字符o");
		else
			System.out.println("o第一次出现在"+s+"中的索引为："+i);
		i=s.lastIndexOf('o');
		if(i==-1)
			System.out.println(s+"不包含字符o");
		else
			System.out.println("o最后一次出现在"+s+"中的索引为："+i);
		i=s.indexOf("you");
		if(i!=-1)
			System.out.println(s+"中包含you");
		else
			System.out.println(s+"中不包含you");
	}
}