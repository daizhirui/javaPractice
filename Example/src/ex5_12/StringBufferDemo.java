package ex5_12;
public class StringBufferDemo{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		sb.insert(3, "aaa");
		System.out.println(sb);
		System.out.println("长度为："+sb.length());
		sb.setCharAt(2, 'A');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(3, 6);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.replace(0, 2, "AA");
		System.out.println(sb);
		String s="Hello";
		s.concat("World");
		System.out.println(s);
	}
}