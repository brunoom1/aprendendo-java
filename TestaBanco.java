import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

import com.gabrielmendonca.Banco;
import com.gabrielmendonca.Conta;

class TestaBanco {

	private static String geraDados () {
		return Integer.valueOf((((int) Math.round(Math.random() * 3232 + 1000)))).toString();
	}

	public static void main(String args[]) {
		Banco bancos[] = new Banco[200];

		try {
			bancos = TestaBanco.generate();
		} catch (IOException e) {
			System.out.println("Problema ao ler arquivo com dados. " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Outro erro " + e.getMessage());
		}


		for (int i = 0; i < bancos.length; i ++) {
			if (bancos[i] == null) {
				break;
			}
			System.out.println(bancos[i]);
		}

	}


	public static Banco[] generate() throws IOException {

		Banco bancos[] = new Banco[200];

		FileInputStream file = new FileInputStream("bancos.data");
		InputStreamReader readerFile = new InputStreamReader(file, "UTF-8");
		BufferedReader buffer = new BufferedReader(readerFile);

		int i = 0;

		String line;

		while ( (line = buffer.readLine()) != null ) {
			String bancoData[] = line.split(",");

			String bancoNome = bancoData[0];
			String bancoCode = bancoData[1];

			Conta[] contas = new Conta[100];
			for (int x = 0; x < contas.length; x++) {
				contas[x] = new Conta(TestaBanco.geraDados(), TestaBanco.geraDados());
				contas[x].depositar(  (float) Math.ceil(Math.random() * 100) * 100 ) ;
			}

			bancos[i] = new Banco(bancoNome, bancoCode);
			bancos[i].setContas(contas);

			i ++;			

		}

		file.close();

		return bancos;
	}


}