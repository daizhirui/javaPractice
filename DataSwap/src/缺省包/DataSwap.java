package 缺省包;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 文件名：DataSwap.java
 * @author DaiZhiRui
 */
public class DataSwap {
	//试图交换x和y的值
	public static void swap(Integer x,Integer y){
		int temp=x;
		x=y;
		y=temp;
	}
	//主程序
	public static void main(String[] args) {
		//输入两个整数
		Integer i,j;
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			String inputLine1=in.readLine();
			i=Integer.parseInt(inputLine1);
			String inputLine2=in.readLine();
			j=Integer.parseInt(inputLine2);
		}catch(Exception exc){
			System.out.println("用户没有输入一个合法的数值");
			return;
		}
		//输出这两个数在交换之前与交换之后的值
		System.out.println("交换前：i="+i+",j="+j);
		swap(i,j);
		System.out.println("交换后：i="+i+",j="+j);
	}
}

