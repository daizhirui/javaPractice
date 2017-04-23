package ex6_4;
import java.util.Random;
public class RandomTest{
	public static void main(String[] args){
		Random ran1=new Random();
		System.out.println(ran1.nextInt());
		ran1=new Random(1000);
		System.out.println(ran1.nextInt());
		ran1.setSeed(1000);
		System.out.println(ran1.nextInt());
		int i;
		for(i=0;i<10;i++)
			System.out.println(ran1.nextGaussian());
	}
}