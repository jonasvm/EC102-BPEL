package br.curso.service;

import java.util.Arrays;
import java.util.List;

import br.curso.entity.ContaCorrente;
import br.curso.exception.NumeroContaCorrenteInvalido;

public class ContaCorrenteService {
	
	  private final static List<ContaCorrente> contasCorrentes = Arrays.asList(
		        new ContaCorrente(1, 100.00),
		        new ContaCorrente(2, 200.00),
		        new ContaCorrente(3, 350.00),
		        new ContaCorrente(4, 789.12),
		        new ContaCorrente(5, 10.89),
		        new ContaCorrente(6, 8200.00),
		        new ContaCorrente(7, 1560.40),
		        new ContaCorrente(8, 2043.05),
		        new ContaCorrente(9, 5000.00),
		        new ContaCorrente(10, 9350.87));
	
	  
	/**
	 * Retorna o saldo da conta corrente.
	 * 
	 * @param numeroConta
	 * @return
	 * @throws NumeroContaCorrenteInvalido
	 */
	public double verificarSaldo(int numeroConta) throws NumeroContaCorrenteInvalido {
		if(numeroConta > 0 && numeroConta <= 10) {
			return contasCorrentes.get(numeroConta-1).getSaldo();
		} else {
			throw new NumeroContaCorrenteInvalido("O numero da conta corrente é invalido!", new NumeroContaCorrenteInvalido());
		}
	}

	/**
	 * Debita um valor do saldo atual da conta corrente.
	 * 
	 * @param numeroConta
	 * @param valor
	 * @return
	 * @throws NumeroContaCorrenteInvalido
	 */
	public double debitar(int numeroConta, double valor)throws NumeroContaCorrenteInvalido {
		if(numeroConta > 0 && numeroConta <= 10) {
			return contasCorrentes.get(numeroConta-1).getSaldo() - valor;
		} else {
			throw new NumeroContaCorrenteInvalido("O numero da conta corrente é invalido!", new NumeroContaCorrenteInvalido());
		}
	}

}
