import com.gabrielmendonca.Conta;
import com.gabrielmendonca.Pessoa;
import com.gabrielmendonca.SaldoInsuficienteException;

import java.io.PrintStream;

public class Main {

	public static void main (String args[]) {

		PrintStream saida = System.out;
		
		Conta c1 = new Conta("6128", "311591", new Pessoa("Gabriel", "147982127724"));
		c1.depositar(200);

		Conta c2 = new Conta("6118", "311112", new Pessoa("Rayanne", "19288394823"));
		c2.depositar(240);


		saida.println(c1);
		saida.println(c2);


		if (c1.equals(c2)) {
			saida.println("Contas são iguais");
		} else {
			saida.println("Contas são diferentes");
		}

		try {
			c1.sacar(200);
			c2.sacar(241);
		} catch (SaldoInsuficienteException e) {
			saida.println(e.getMessage());
		}

	}

}