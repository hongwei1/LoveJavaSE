package day21.p7.io.bytestream.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyMp3Test {
	private static final String READPATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife"
			+ "/LoveJavaSE/src/itcastday21/p7/io/bytestream/1.xls";
	private static final String COPE1 = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife"
			+ "/LoveJavaSE/src/itcastday21/p7/io/bytestream/c1.xls";
	private static final String COPE2 = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife"
			+ "/LoveJavaSE/src/itcastday21/p7/io/bytestream/c2.xls";
	private static final String COPE3 = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife"
			+ "/LoveJavaSE/src/itcastday21/p7/io/bytestream/c3.xls";
	private static final String COPE4 = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife"
			+ "/LoveJavaSE/src/itcastday21/p7/io/bytestream/c4.xls";
	private static final String COPEMY = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife"
			+ "/LoveJavaSE/src/itcastday21/p7/io/bytestream/cM1.xls";

	public static void main(String[] args) throws IOException {

		copyMy();
		copy_1();
//		copy_4();
	
	}
private static void copyMy() throws IOException {
	FileReader fileReader = new FileReader(READPATH);
	FileWriter fileWriter = new FileWriter(COPEMY);
	int read=0;
	while ((read=fileReader.read())!=-1) {
		fileWriter.write((char)read);
//		System.out.print((char)read);
	}
	
	fileReader.close();
	fileWriter.close();
	}
	//	千万不要用，效率没有！
	public static void copy_4() throws IOException {
		FileInputStream fis = new FileInputStream(READPATH);		
		FileOutputStream fos = new FileOutputStream(COPE4);
		
		
		int ch = 0;
		
		while((ch =fis.read())!=-1){
			fos.write(ch);
		}
		
		fos.close();
		fis.close();
	}

	//不建议。 
	public static void copy_3() throws IOException {
		FileInputStream fis = new FileInputStream(READPATH);		
		FileOutputStream fos = new FileOutputStream(COPE3);
		
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		fos.write(buf);
		fos.close();
		fis.close();
	}

	public static void copy_2() throws IOException {
		
		FileInputStream fis = new FileInputStream(READPATH);	
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(COPE2);
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
	
		
		int ch = 0;
		
		while((ch=bufis.read())!=-1){
			bufos.write(ch);
		}
		
		bufos.close();
		bufis.close();
	}

	public static void copy_1() throws IOException {
		
		FileInputStream fis = new FileInputStream(READPATH);		
		FileOutputStream fos = new FileOutputStream(COPE1);
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=fis.read(buf))!=-1){
			fos.write(buf,0,len);
			System.out.print((char)len);
		}
		
		fos.close();
		fis.close();
	}
	
	

}
