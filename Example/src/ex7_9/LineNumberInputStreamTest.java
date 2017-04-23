/**
 * @filename:LineNumberInputStreamTest.java
 * @author:daizhirui
 * @date:2017年2月7日
 */
package ex7_9;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;

@SuppressWarnings("deprecation")
public class LineNumberInputStreamTest {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		try{
			String fileName="fileTest.txt";
			//LineNumberInputStream lins=new LineNumberInputStream(new FileInputStream(fileName));
			//DataInputStream s=new DataInputStream(lins);
			DataInputStream s=new DataInputStream(new FileInputStream(fileName));
			LineNumberInputStream lins=new LineNumberInputStream(s);
			String line;
			while((line=s.readLine())!=null){
				System.out.println("Did line number:"+lins.getLineNumber());
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
