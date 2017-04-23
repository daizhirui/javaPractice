/**
* 文件名：FinalArguments.java
* final常量作为方法的参数
*/
class TestFinal{
	public void spin(){
		
	}
}
public class FinalArguments{
	void with(final TestFinal g){
		//!g=new TestFinal();
		g.spin();
	}
	void without(TestFinal g){
		g=new TestFinal();
		g.spin();
	}
//void f(final int i){i++};
int g(final int i){
	return i+1;
}
public static void main(String[] args){
	FinalArguments bf=new FinalArguments();
	bf.without(new TestFinal());
	bf.without(null);
	bf.with(new TestFinal());
	}
}