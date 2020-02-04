package br.com.fiap.bean;

import java.util.Calendar;

public class Conta {
	
	private int agencia;
	private int numero;
	private Calendar dataAbertura;
	protected double saldo;
	
	public double depositar(double valor) {
		return valor;
	}
	public double retirar(double valor) {
		return valor;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double sacar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}
	public float calcularRetornoInvestimento() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}
