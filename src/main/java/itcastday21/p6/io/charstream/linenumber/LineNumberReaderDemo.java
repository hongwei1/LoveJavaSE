package itcastday21.p6.io.charstream.linenumber;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/IOÁ÷_2.txt";
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(PATH);
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		lnr.setLineNumber(11);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		
		lnr.close();
	}
}
