/**
* 文件名：Stastics.java
* 内部类的应用，做一个整体用于返回。可以一起返回多个数据
*/
public class Statistics{
	public static class Result{
		int count=0;
		int sum=0;
		double average=0;
	}
	public static Result scan(int data[]){
		Result r=new Result();
		for(int i=0;i<data.length;i++){
			r.count++;
			r.sum+=data[i];
		}
		if(r.count>0)
			r.average=(double)r.sum/r.count;
		return r;
	}
	public static void main(String[] args){
		int[] data={90,77,89,83,92};
		Statistics.Result r=scan(data);
		System.out.println("count="+r.count);
		System.out.println("sum="+r.sum);
		System.out.println("average="+r.average);
	}
}
