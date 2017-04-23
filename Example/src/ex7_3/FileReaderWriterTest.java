package ex7_3;
import java.io.*;
public class FileReaderWriterTest{
	public static void main(String[] args){
		try{
			FileReader fileReader=new FileReader("1.txt");
			FileWriter fileWriter=new FileWriter("1_output.txt");
			int in=0;
			//char[] wlnChar={'\r','\n'};
			char[] wlnChar={'\r'};
			while((in=fileReader.read())!=-1){
				if(in=='\n'){
					fileWriter.write(wlnChar);
				}else
					fileWriter.write(in);
			}
			fileReader.close();
			fileWriter.close();
			System.out.println("copy文件完成");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("请指定文件");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}