package Calculadora;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {

	protected CalculatorServer() throws RemoteException {
		super();
	}

	public static void main(String args[]) throws RemoteException,
			AlreadyBoundException {

		// create an instance of Calculator
	    CalculatorImpl calculator = new CalculatorImpl();
	    //ICalculator calculatorI = (ICalculator) UnicastRemoteObject.exportObject(calculator, 0);

		// create  a Registry instance on the local host
		Registry registry = LocateRegistry.createRegistry(1312);

		// register the instance of Calculator in the Naming Service
		registry.bind("Calculator", calculator);
		
		System.out.println("Servidor em espera............");
	}
}