import java.rmi.*;
import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class FactClient
{
	 public static void main(String args[]) throws IOException,RemoteException
	 {
		 int x;
		 BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 x=Integer.parseInt(num.readLine());
		 try
		 {
			 FactInterface factserverintf=(FactInterface)Naming.lookup("//localhost/Fact_Server");
			 double f=factserverintf.Fact(x);
			 System.out.println("The Factorial of "+x+" is: "+f);
		 }
		 catch (Exception e)
		 	 {
		 		 System.out.println(e);
	 		}
		System.exit(0);
 	}
}