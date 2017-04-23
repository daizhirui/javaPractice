package experiment3_1_2;
public class Square{
	private double length;
	private double width;
	//Construction Methods
	public Square(double length,double width){
		this.length=length;
		this.width=width;
	}
	public Square(double length){
		this.length=this.width=length;
	}
	//set Methods
	public void setlength(double length){
		this.length=length;
	}
	public void setwidth(double width){
		this.width=width;
	}
	//get Methods
	public double getlength(){
		return length;
	}
	public double getwidth(){
		return width;
	}
	public double getCircle(){
		return (length+width)*2;
	}
	public double getArea(){
		return length*width;
	}
	public static void main(String[] args){
		double Length,Width;
		Length=2.00;
		Width=1.00;
		Square Square=new Square(Length,Width);
		System.out.println("The length of the Square is "+Square.getlength());
		System.out.println("The width of the Square is "+Square.getwidth());
		System.out.println("The Circle of the Square is "+Square.getCircle());
		System.out.println("The Area of the Square is "+Square.getArea());
	}
}