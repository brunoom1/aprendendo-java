import com.gabrielmendonca.Conta;

class TestaArray {

	private static String geraDados () {
		return Integer.valueOf((((int) Math.round(Math.random() * 3232 + 1000)))).toString();
	}

	public static void main (String args[]) {

		Conta[] contas = new Conta[10];

		for (int i = 0; i < contas.length; i++) {
			contas[i] = new Conta(TestaArray.geraDados(), TestaArray.geraDados());
			contas[i].depositar(  (float) Math.ceil(Math.random() * 100) * 100 ) ;
			System.out.println(contas[i]);
		}

		System.out.println("Saldo médio: " + TestaArray.saldoMedio(contas));
	}

	public static float saldoMedio (Conta[] contas) {
		int total = contas.length;
		float soma = 0;

		for (Conta conta:contas) {
			soma += conta.saldo();
		}

		return soma / total;
	}

}