package itcastday20.p2.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {

		FileWriter fw = null;
		try {

			fw = new FileWriter("/bdemo.txt");

			fw.write("abcde" + LINE_SEPARATOR + "hahaha");

		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// code....
					throw new RuntimeException("πÿ±’ ß∞‹");
				}
		}

		// my heaven
//		 myHeaven();
	}

	private static void myHeaven() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/demo.txt");
			fw.write("abcde" + LINE_SEPARATOR + "hahaha");
			
		} catch (Exception e) {

		}finally {
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
