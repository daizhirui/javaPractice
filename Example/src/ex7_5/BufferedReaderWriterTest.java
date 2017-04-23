/**
 * @filename:BufferedReaderWriterTest.java
 * @author:daizhirui
 * @date:2017年2月7日
 */
package ex7_5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderWriterTest {
	public static void main(String[] args) {
		try{
			String str;
			String fileName="fileTest.txt";
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("backup_"+fileName);
			BufferedWriter bw=new BufferedWriter(fw);
			while((str=br.readLine())!=null){
				System.out.println(str);
				bw.write(str);
			}
			br.close();
			bw.close();
			System.out.println("文件复制完毕");
		}catch(IOException 	e){
			System.out.println(e);
		}

	}

}
