/**
* 文件名：ClassTest.java
* 如何获取Class类对象
*/
class A{
	String name;
	public A(){
		name="me";
	}
	public String toString(){
		return this.getClass().getName();
	}
	public Object getClassTest(){
		return this.getClass();
	}
}
public class ClassTest{
	public static void main(String[] args)throws Exception{
		A a1=new A();
		System.out.println("a1="+a1);
		System.out.println(a1.getClassTest());
		A a2=a1.getClass().newInstance();
		System.out.println("a1.name="+a1.name);
		System.out.println("a2.name="+a2.name);
		a2.name="you";
		System.out.println("a1.name="+a1.name);
		System.out.println("a2.name="+a2.name);
		Class c1=Class.forName("A");
		System.out.println(c1.getName());
		System.out.println(c1.getSuperclass());
		System.out.println(c1.getSuperclass().getName());
		Integer i=new Integer(1024);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		Double d=Double.valueOf("10.0");
		System.out.println(d);
		Boolean b=new Boolean(true);
		boolean b1=b.booleanValue();
		Boolean b2=Boolean.valueOf(b1);
		System.out.println(b1);
		System.out.println(b2);
		Character c=new Character('B');
		char c2=c.charValue();
		Character c3=Character.valueOf(c2);
		System.out.println(c2);
		System.out.println(c3);
		double s,r=2.0;
		s=Math.PI*r*r;
		System.out.println("S="+s);
		System.out.println("I="+Math.sqrt(16));
	}
}