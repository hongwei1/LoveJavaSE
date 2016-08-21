 package itcastday29.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RegServer {

	public static void main(String[] args) throws IOException {
		while(true){
			ServerSocket ss = new ServerSocket(9090);
			Socket s= ss.accept();
			System.out.print(s.getInetAddress().getHostAddress());
			
			InputStream in = s.getInputStream();
			
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			
			System.out.println(new String(buf,0,len));
			
			PrintWriter out = new PrintWriter(s.getOutputStream(),true);
			out.println("<font color = 'red' size ='7'> regeration succussfully</front>");
			
			s.close();
			ss.close();
		}

	}

}
















