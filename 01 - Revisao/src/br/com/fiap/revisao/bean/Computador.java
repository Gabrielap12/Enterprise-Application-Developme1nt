package br.com.fiap.revisao.bean;

public class Computador extends Produto{

	private final double TAXA = 0.05;
	
	public Computador(String Nome, double Preco) {
		super(Nome, Preco);
	}
	
	public double descontar(double desconto) {
		return super.preco*(1+TAXA) - desconto;
	}

	public double getTAXA() {
		return TAXA;
	}
	@Override
	public void aumentar(double valor) {
		this.preco += valor;		
	}
	
}
