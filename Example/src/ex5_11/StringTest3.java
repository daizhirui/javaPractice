package ex5_11;
/**
* 文件名：StringTest3.java
* 将英语的肯定句变成疑问句、把橘子分解为单词
*/
public class StringTest3{
	public static void main(String[] args){
		String s="I love China!";
		String s2=new String(),s1;
		int i=s.indexOf("China");
		if(i!=-1){
			if(s.startsWith("I")==true){
				s1=s.replaceAll("I", "Do you");
				if(s1.endsWith("!")==true)
					s2=s1.replace('!', '?');
			}
			System.out.println(s2+"是由下列单词组成的");
			int j=0;
			while((i=s2.indexOf(' '))!=-1){
				System.out.print(s2.substring(0, i)+",");
				s2=s2.trim().substring(i+1);
				++j;
			}
			j++;
			System.out.println(s2.substring(0,s2.length()-1));
			System.out.println("共有"+j+"个单词！");
		}
	}
}