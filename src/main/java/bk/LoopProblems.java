package bk;



import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LoopProblems {
	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/bk/demo.txt";

	public static void main(String[] args) {

		whileProblem1();
		if (true)
		{}else{
			
		}

		whileProblem2();
	}

	
	/**
	 * 
	 */
	private static void whileProblem2() {
		// 2 totally wrong
		// 我就想控制输出的格式，用len来判断长度，结果出现逻辑错误
		try {
			Reader reader = new FileReader(PATH);
			char[] cbuf = new char[3];
			int len = reader.read(cbuf, 0, reader.read(cbuf));
			while (len != -1) {
				System.out.println(cbuf);
				len = reader.read(cbuf);
			}
			reader.close();
		} catch (Exception e) {
		}

		// solutions:
		try {
			Reader reader = new FileReader(PATH);
			char[] cbuf = new char[3];
			int len = reader.read(cbuf);
			while (len != -1) {
				System.out.println(new String(cbuf, 0, len));
				// System.out.println(new String(cbuf));
				len = reader.read(cbuf);
			}
			reader.close();
		} catch (Exception e) {
		}
	}

	/**
	 * 
	 */
	private static void whileProblem1() {
		// 1 totally wrong loop !!! take care of the loop conditions and loop
		// body.
		// fReader.read() 你用一次就会先后移动依次。一次循环只能用一次。
		FileReader fReader = null;
		try {
			fReader = new FileReader(PATH);
			int read = fReader.read();

			while (fReader.read() != -1) {
				System.out.println(fReader.read());
			}
			// solutions:
			// while loop. 3 conditions :
			// 1 loop condition
			// 2 end condition
			// 3 loop body
			// while(read!=-1){
			// System.out.println((char)read);
			// read = fReader.read();
			// }

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fReader != null) {
				try {
					fReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
