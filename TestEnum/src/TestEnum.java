/**
* 文件名：TestEnum.java
* Java中的枚举的应用
*/
public class TestEnum{
	/*最普通的枚举*/
	public enum ColorSelect{
		red,green,yellow,blue;
	}
	public enum Season{
		winter,spring,summer,fall;
		private final static String location="Phoenix";
		public static Season getBest(){
			if(location.equals("Phoenix"))
				return winter;
			else
				return summer;
		}
	}
	public enum Temp{
		absoluteZero(-459),freezing(32),boling(212),paperBurns(451);
		private final int value;
		public int getValue(){
			return value;
		}
		Temp(int value){
			this.value=value;
		}
	}
	public static void main(String[] args){
		ColorSelect m=ColorSelect.blue;
		switch(m){
		case red:
			System.out.println("color is red");
			break;
		case green:
			System.out.println("color is green");
			break;
		case yellow:
			System.out.println("color is yellow");
			break;
		case blue:
			System.out.println("color is blue");
			break;
		}
		System.out.println("遍历ColorSelect中的值");
		for(ColorSelect c:ColorSelect.values()){
			System.out.println(c.toString());
		}
		System.out.println("枚举ColorSelect中的值有："+ColorSelect.values().length+"个");
		System.out.println(ColorSelect.red.ordinal());
		System.out.println(ColorSelect.green.ordinal());
		System.out.println(ColorSelect.yellow.ordinal());
		System.out.println(ColorSelect.blue.ordinal());
		System.out.println(ColorSelect.red.compareTo(ColorSelect.green));
		System.out.println(Season.getBest());
		for(Temp t:Temp.values()){
			System.out.println(t+"的值是"+t.getValue());
		}
	}
}