/**
* 文件名：Manager.java
* 继承中的方法重定义示例
*/
class Employee{
	String name="professor";
	int salary=10000;
	public String getDetails(){
		return "Name:"+name+"\nSalary:"+salary;
	}
}
public class Manager extends Employee{
	String department="Physics Department";
	public String getDetails(){
		return "Name:"+name+"\nHead of "+department;
	}
	public static void main(String[] args){
		Employee who1=new Manager();
		Employee who2=new Employee();
		System.out.println(who1.getDetails());
		System.out.println(who2.getDetails());
	}
}
