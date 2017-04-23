package ex7_4;
import java.io.*;
public class StreamReaderWriterTest{
	public static void main(String[] args){
		try{
			String fileName="fileTest.png";
			FileInputStream fis=new FileInputStream(fileName);
			InputStreamReader isr=new InputStreamReader(fis);
			FileOutputStream fos=new FileOutputStream("backup_"+fileName);
			OutputStreamWriter osw=new OutputStreamWriter(fos);
			int ch=0;
			while((ch=isr.read())!=-1){
				System.out.print((char)ch);
				osw.write(ch);
			}
			/*while((ch=fis.read())!=-1){
				fos.write(ch);
			}*/
			/*byte[] b=new byte[31*1024];
			fis.read(b);
			fos.write(b);*/
			System.out.println("文件复制完毕");
			isr.close(); osw.close();
			//fis.close(); fos.close();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("没有指定文件");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}