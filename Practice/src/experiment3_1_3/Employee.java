package experiment3_1_3;
public class Employee{
	String name;
	double salary;
	MyDate mydate=new MyDate();
	Employee(String name,double salary,int year,int month,int day){
		this.name=name;
		this.salary=salary;
		this.mydate=new MyDate(year,month,day);
	}
	public static void main(String[] args){
		Employee employee=new Employee("Jack Ma",10000.00,2016,1,1);
		System.out.println("雇佣时间为："+employee.mydate.getTimeOfDay()+"天");
	}
}
class MyDate{
	private int year;
	private int month;
	private int day;
	//Construction
	MyDate(){
		
	}
	MyDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	//get Methods
	public int getTimeOfYear(){
		return 2017-year;
	}
	public int getTimeOfMonth(){
		return (2017-year)*12+month;
	}
	public int getTimeOfDay(){
		return (2017-year)*365+month*30+day;
	}
	//set Methods
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day){
		this.day=day;
	}
}