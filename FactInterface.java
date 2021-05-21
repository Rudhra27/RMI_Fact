import java.rmi.*;

public interface FactInterface extends Remote
{
	double Fact(int x) throws RemoteException;
}