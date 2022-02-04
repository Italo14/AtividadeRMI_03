package Calculadora;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class CalculatorClient {

	public static void main(String[] args) throws RemoteException,
			NotBoundException, InterruptedException {

		//* obtain a reference to a bootstrap remote object registry */
		Registry registry = LocateRegistry.getRegistry(1312);

		ICalculator calculator = (ICalculator) registry.lookup("Calculator");
		
		   System.out.println(calculator.add(3, 3));
		   
		  ///////////////////////////////////////////////////////////////////
		   
		   System.out.println(calculator.questionario("1;4;VVVV"));
		   
	}

}