package objetos_boletin2_Ejercicio2;

public class Gato {

	String color;
	String raza;
	String sexo;
	int edad;
	float peso;

	void maullar() {
		System.out.println("Miauuu");
	}

	void ronronea() {
		System.out.println("rrrrr");
	}

	void comer(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Yummy Yummy");
		}

		else {
			System.out.println("buahh, mejor no");
		}
	}

	void pelear(Gato g) {
		if (sexo.equals(g.sexo)) {
			System.out.println("Ven aquí que te vas a enterar");
		} else {
			System.out.println("La violencia nunca es la solución");
		}
	}
	

	@Override
	public String toString() {
		return "Gato color: " + color + ", raza: " + raza + ", sexo: " + sexo + ", edad: " + edad + ", peso: " + peso ;
	}

}
