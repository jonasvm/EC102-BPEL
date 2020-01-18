package br.curso.entity;

public class ContaCorrente {

	private int Numero;
	
	private double Saldo;

	public ContaCorrente() {
		
	}

	public ContaCorrente(int numero, double saldo) {
		super();
		Numero = numero;
		Saldo = saldo;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
}
