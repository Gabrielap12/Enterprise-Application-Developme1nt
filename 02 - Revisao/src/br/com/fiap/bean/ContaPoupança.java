package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupan�a extends Conta{
	
	private float taxa;
	private final static float rendimento = 0.14f;
		
	public ContaPoupan�a() {
		super();
	}

	@Override 
	public double depositar(double valor) {
		return saldo += valor;
	}   
	
	@Override
	public double sacar(double valor) {
		return saldo -= valor;
	}
	
	@Override
	public float calcularRetornoInvestimento() {
		return (float) (saldo * rendimento);
	}
	public float getTaxa() {
		return taxa;
	}


	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
}
