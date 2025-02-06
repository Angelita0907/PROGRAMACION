package simulacro1;

import java.util.Scanner;

public class Redondeo {
	public static void main(String[] args) {
		Redondeo f = new Redondeo();
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un número");
		String numeroCadena = input.next();
		String resultado = f.redondear(numeroCadena);
		System.out.println(resultado);
	}

	String redondear(String numeroARedondear) {
		int numeroDecimales = calculaNumeroDecimales(numeroARedondear);
		String resultado = numeroARedondear;
		if (numeroDecimales >= 3) {
			// resultado = redondeoCon3oMasDecimales(numeroARedondear);
		} else if (numeroDecimales < 2) {
			resultado = redondeoCon2oMenosDecimales(numeroARedondear);
		}
		return numeroARedondear;
	}

	String redondeoCon2oMenosDecimales(String numeroARedondear) {
		String resultado = numeroARedondear;
		int numeroDecimales = calculaNumeroDecimales(resultado);
		while (calculaNumeroDecimales(resultado) != 2) {
			if (numeroDecimales == 0) {
				resultado = resultado + ",0";
			} else {
				resultado = resultado + "0";
			}

		}
		return resultado;
	}

	String redondeoCon3oMasDecimales(String numeroARedondear) {
		String resultado = numeroARedondear;

		return resultado;
	}

	int calculaNumeroDecimales(String numeroARedondear) {
		// 12.1234
		// partes[0] = 12
		// partes[1] = 1234
		int numDecimales;
		String[] partes = numeroARedondear.split(",");
		if (partes.length == 2) {
			numDecimales = partes[1].length();
		} else {
			numDecimales = 0;
		}
		return partes[1].length();
	}
}
