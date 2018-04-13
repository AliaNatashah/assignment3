import java.io.*;
import java.net.*;

class DateClient
{
	public static void main(String args[]) throws Exception
	{
	  Socket soc=new Socket("192.168.1.28",7778);
	  BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream() ));
	  System.out.println(in.readLine());
	}
}
