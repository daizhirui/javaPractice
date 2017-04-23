package experiment3_1_1;
public class Animal{
	String name;
	double weight;
	public void run(){
		System.out.println("runing");
	}
	public void jump(){
		System.out.println("jumping");
	}
	public void walk(){
		System.out.println("walking");
	}
	public static void main(String[] args){
		Animal animal=new Animal();
		animal.name="Tiger";
		animal.weight=1.00;
		System.out.println(animal.name+" weights "+animal.weight+"ton");
		animal.run();
		animal.jump();
		animal.walk();
	}
}