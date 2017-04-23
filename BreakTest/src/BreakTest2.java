/**
* 文件名: BreakTest2.java
* 带标号的break语句的使用案例
*/
public class BreakTest2{
	public static void main(String args[]){
		int j,k;
		Rep:
			for(j=8;j>1;j--){
				for(k=1;k<=9;k++){
					if(k==5)
						break;
					if(j==6)
						break Rep;
					System.out.print(j*k+" ");
				}
				System.out.println("<>");
			}
		System.out.println("<>");
	}
}