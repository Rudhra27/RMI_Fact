import java.rmi.*;
import java.rmi.server.*;
public class FactServer extends UnicastRemoteObject implements FactInterface
{
	public FactServer() throws RemoteException
	    {
	        super();
			 
         }
     public double Fact(int x) throws RemoteException 
	 {
		 int fact=1;
		 for (int i=1; i<=x;i++)
			 fact=fact*i;
		 return (fact);
	 }

 public static void main (String args[])
 {
	 try
	 {
		 FactServer FcatImpl= new FactServer();
		 Naming.rebind("Fact_Server",FcatImpl);
		 System.out.println("System is Ready to find factorial!");
	 }
	 catch (Exception e)
	 {
		 System.out.println(e);
	 }
 }
}
