package goodtests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/**
 * 作业：将c盘的一个文本文件复制到d盘。
 * 
 */
public class T09CopyFiletoAnotherFile {

	private static final String WRITEFILE = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/goodtests/demoNew.txt";
	private static final String READFILE  = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/goodtests/demo.txt";

	public static void main(String[] args) {
		Reader reader = null;
		Writer writer= null;
		try {
			reader=new FileReader(READFILE);
			writer=new FileWriter(WRITEFILE);
			
			char[] cbuf = new char [1024];
			int len = reader.read(cbuf);
			while(len!=-1){
				writer.write(cbuf,0,len);
				len = reader.read(cbuf);
			}
			
			//simple one:
			//3,频繁的读写操作。
//			int ch = 0;
//			while((ch=fr.read())!=-1){
//				fw.write(ch);
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (reader!=null&&writer!=null) {
				try {
//					reader.close();
//					writer.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		}
		
		
		
	}

}