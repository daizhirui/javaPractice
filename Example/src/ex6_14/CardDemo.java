package ex6_14;
import java.util.*;
public class CardDemo{
	public static void main(String[] args){
		int i,j;
		String[] colors={"黑桃","红桃","梅花","方块"};
		String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		ArrayList<String> cards=new ArrayList<String>();
		for(i=0;i<4;i++){
			for(j=0;j<13;j++){
				cards.add(colors[i]+num[j]);
				System.out.print(cards.get(i*13+j)+",");
			}
			System.out.println();
		}
		System.out.println("洗牌之后");
		Collections.shuffle(cards);
		for(i=0;i<4;i++){
			for(j=0;j<13;j++)
				System.out.print(cards.get(i*13+j)+",");
			System.out.println();
		}
		List<String> ls=new ArrayList<String>();
		ls.add("A");
		ArrayList<String> cardtest=new ArrayList<String>();
		System.out.println(cardtest.getClass().getName());
		System.out.println(cardtest.getClass().getSuperclass().getName());
		System.out.println(cardtest.getClass().getSuperclass().getSuperclass().getName());
		System.out.println(cardtest.getClass().getSuperclass().getSuperclass().getSuperclass().getName());
		System.out.println(cardtest.getClass().getSuperclass().getSuperclass().getSuperclass().getSuperclass().getName());
	}
}