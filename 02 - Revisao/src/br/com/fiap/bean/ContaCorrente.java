package br.com.fiap.bean;

public class ContaCorrente extends Conta{

	private TipoConta TipoConta;
	
	public double depositar(double valor){
		return saldo + valor;
	}
	public double retirar(double valor){
		return saldo - valor;

		
	}

}
