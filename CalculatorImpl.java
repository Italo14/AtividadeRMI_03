package Calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements ICalculator {

	protected CalculatorImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public float add(float x, float y) {
		return x + y;
	}

	@Override
	public float sub(float x, float y) throws RemoteException {
		return x - y;
	}

	@Override
	public float mul(float x, float y) throws RemoteException {
		return x * y;
	}

	@Override
	public float div(float x, float y) throws RemoteException {
		return x / y;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override 
	public String questionario(String a) throws RemoteException {
        //////////////////////////Tratamento gabarito///////////////////////////////////////////////////////////
        
        String gabarito = "1;4;VVFF"; 
       
        //dividindo o numero de questoes,numero de alternativas e alternativas//
        
        String[] Gcortada = gabarito.split(";");
        
        //passando os dados dos vetores para as variaveis string //
        
        String G_numero_questoes = Gcortada[0];
        String G_numero_alternativas = Gcortada[1];
        String G_alternativas = Gcortada[2];
        
       /////////////////////////////Tratamento questionario////////////////////////////////////////////////////
        
       //// dados recebidos pelo cliente ////////
        
        
        
       //dividindo o numero de questoes,numero de alternativas e alternativas//
        
        String[] Qcortada = a.split(";");
        
        //passando os dados dos vetores para as variaveis string //
                       
        String numero_questoes = Qcortada[0];
        String numero_alternativas = Qcortada[1];
        String alternativas = Qcortada[2];
        
        // alimento o vetor char com as alternativas///
        
        char[] g = G_alternativas.toCharArray();
        char[] q = alternativas.toCharArray();
        
        int acertos = 0;
        int erros = 0;
        boolean referencia = false;
        
        ////Laço de comparação e contador de erros e acertos////
        
        if (numero_questoes.equals(G_numero_questoes))
        {
        	referencia = numero_alternativas.equals(G_numero_alternativas);
        	
        	if (referencia == true) {
            	
            	for (int j = 0; j<g.length; j++) {
            		if (q[j] == g[j]) {
            			acertos++;
            		}else 
   	            	 erros++;
              }
        }
        }
        
        /////////////////////////Imprimindo Resultados////////////////////////////////////
        
		return "Questões recebidas: " + a + "\n" + "Questão: " + numero_questoes 
				+ " Acertas: " + acertos + " Erros: " + erros;        
  
	}
}
