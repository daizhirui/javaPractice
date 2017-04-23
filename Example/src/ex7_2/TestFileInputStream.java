package ex7_2;
import java.io.*;
public class TestFileInputStream{
	public static void main(String[] args){
		byte[] b=new byte[31*1024];
		File inF=new File("1.png");
		File outF=new File("1_output.txt");
		try{
			if(!inF.exists()){
				inF.createNewFile();
				System.out.println("File doesn't exists, creating...");
			}
			if(outF.exists()){
				outF.delete();
				System.out.println("File already exists, deleting...");
			}
			FileInputStream fis=new FileInputStream(inF);
			//FileOutputStream fops=new FileOutputStream(outF);
			FileWriter fw=new FileWriter(outF);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			//fis.mark(b.length);
			int d=1;
			int i=1;
			/*while(d!=-1&&d>=0){
				d=fis.read();
				Integer e=Integer.valueOf(d);
				pw.write(e.toString()+"\t");
				System.out.print(d+"\t");
				i++;
				if(i%10==0) System.out.println();
			}*/
			fis.read(b);
			Integer[] e=new Integer[b.length];
			for(i=0;i<b.length;i++){
				e[i]=Integer.valueOf(b[i]);
				//System.out.println((int)b[i]);
				fw.write(String.valueOf(b[i])+"\t");
			}
			//fops.write(b);
			/*for(int i=0;i<b.length;i++){
				if(i!=0&&(i+1)%10==0)
					System.out.println();
				System.out.print(b[i]+"\t");
			}*/
			//System.out.println(fis.markSupported());
			//fis.reset();
			fis.close();
			//fis=new FileInputStream(inF);
			//fis.skip(17149);
			//int d=fis.read();
			//System.out.println(d);
			pw.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("FileNotFoundException fnfe");
			fnfe.printStackTrace();
		}catch(IOException ie){
			System.out.println("IOException ie");
			ie.printStackTrace();
		}
	}
}