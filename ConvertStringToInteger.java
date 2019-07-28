
public class ConvertStringToInteger {

	public int toInteger(String s) {

		// s = "434"

		int numero = 0;
		int count = s.length() - 1;

		for(int i = 0; i <= count; i++) {
			char cs = s.charAt(i);
			int n = cs - '0';

			numero += Math.pow(10, count - i) * n;
		}

		return numero;
	}

	public static void main (String args[]) {

		int idades[] = new int[10];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = (int) Math.ceil(Math.random() * 100); 
		}

		for(int valor:idades) {
			System.out.println(valor);
		}

	}

}