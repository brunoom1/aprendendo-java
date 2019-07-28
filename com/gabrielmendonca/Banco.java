package com.gabrielmendonca;

public class Banco {

	String nome;
	String codigo;
	Conta[] contas;

	public Banco (String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}


	public String toString() {
		return "[" + this.nome + ", " + this.codigo + ",Saldo Médio: " + this.saldoMedioContas() + "]";
	}

	public Banco setContas(Conta contas[]) {
		this.contas = contas;
		return this;
	}

	public float saldoMedioContas () {
		int total = this.contas.length;
		float soma = 0;

		for (Conta conta:this.contas) {
			soma += conta.saldo();
		}

		return soma / total;
	}

}