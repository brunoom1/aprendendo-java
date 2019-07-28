package com.gabrielmendonca;

public class Conta {
	float saldo = 0;
	String numero;
	String agencia;

	Pessoa titular;

	public Conta (String agencia, String numeroConta) {
		this.agencia = agencia;
		this.numero = numeroConta;
		this.titular = null;
	}

	public Conta (String agencia, String numeroConta, Pessoa titular) {
		this.numero = numeroConta;
		this.agencia = agencia;
		this.titular = titular;
	}

	public boolean depositar (float valor) {
		if (valor > 0) {
			this.saldo = valor;
			return true;
		}

		return false;
	}

 	public boolean sacar (float valor) throws SaldoInsuficienteException {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} 
		
		throw new SaldoInsuficienteException("Saldo insuficiente na conta " + this.numero);
	}

	public float saldo () {
		return this.saldo;
	}

	public boolean equals (Object object) {
		if (object == null) {
			return false;
		}

		if (!(object instanceof Conta)) {
			return false;
		}

		Conta conta = (Conta) object;

		if (conta.numero == this.numero && conta.agencia == this.agencia) {
			return true;
		} else {
			return false;
		}
	}

	public String toString () {

		if (this.titular == null){
			return "[ag: " + this.agencia + ", conta: " + this.numero + "," + "Saldo: " + this.saldo + "]";
		}

		return "[ag: " + this.agencia + ", conta: " + this.numero + ", titular: " + this.titular + "]";
	}
}