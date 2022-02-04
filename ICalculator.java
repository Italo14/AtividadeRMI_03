package Calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote {
	//////////////////Adição de interfaces///////////////////////
	
	public String questionario(String a) throws RemoteException;
	
	float add(float x, float y) throws RemoteException;

	float sub(float x, float y) throws RemoteException;

	float mul(float x, float y) throws RemoteException;

	float div(float x, float y) throws RemoteException;
}