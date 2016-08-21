package itcastday21.p3.io.charstream.buffer.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import itcastday21.p2.io.charstream.buffer.BufferedWriterDemo;

public class CopyTextByBufTest {
	private static final String PATHREAD = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/buf.txt";
	private static final String PATHWRITE = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/buf_copy.txt";

	public static void main(String[] args) throws IOException {

		// FileReader fr = new FileReader(PATHREAD);
		// BufferedReader bufr = new BufferedReader(fr);
		//
		// FileWriter fw = new FileWriter(PATHWRITE);
		// BufferedWriter bufw = new BufferedWriter(fw);
		//
		// String line = null;
		// while ((line = bufr.readLine()) != null) {
		// bufw.write(line);
		// bufw.newLine();
		// bufw.flush();
		// }
		// /*
		// * int ch = 0;
		// *
		// * while((ch=bufr.read())!=-1){
		// *
		// * bufw.write(ch); }
		// */
		// bufw.close();
		// bufr.close();

		// my heaven
		myHeaven();
	}

	/**
	 * read data from PATHREAD to PATHWRITE use the buffer function
	 * 
	 * @throws IOException
	 * 
	 */
	private static void myHeaven() throws IOException {
		System.out.println("---myPlace---");
		// read buffer
		FileReader fileReader = new FileReader(PATHREAD);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		// write buffer
		FileWriter fileWriter = new FileWriter(PATHWRITE);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		// read a and write a
//		int read = 0;
//		while ((read = bufferedReader.read()) != -1) {
//			bufferedWriter.write(read);
//		}
		String rLine=null;
		while ((rLine=bufferedReader.readLine())!=null) {
			bufferedWriter.write(rLine);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}	

		// close
		bufferedReader.close();
		bufferedWriter.close();

	}

}
