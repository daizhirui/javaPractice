package ex7_1;
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class FileMethodsTest{
	public static void main(String[] args) throws IOException{
		//String path="test.txt";
		String path="/Users/daizhirui/Desktop/1";
		File filePath=new File(path);
		filePath.mkdir();
		//if(!filePath.createNewFile())	System.exit(0);
		System.out.println("上级路径："+filePath.getParent());
		System.out.println("文件："+filePath.getName());
		System.out.println("绝对路径："+filePath.getAbsolutePath());
		System.out.println("文件大小："+filePath.length());
		System.out.println("是否为文件："+filePath.isFile());
		System.out.println("是否为目录："+filePath.isDirectory());
		System.out.println("是否为隐藏："+filePath.isHidden());
		System.out.println("是否为可读："+filePath.canRead());
		System.out.println("是否为可写入："+filePath.canWrite());
		System.out.println("最后修改时间："+new Date(filePath.lastModified()));
	}
}