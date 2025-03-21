package objetos_boletin2_Ejercicio3;

public class Notas {

	/*
	 * nombre: String
	 * primerT: int
	 * segundoT: int
	 * terceroT: int
	 * 
	 * Método:
	 * + calculaMedia():float
	 * [ calculaTrimestreAprobado(): int
	 * toString():String
	 * Constructor
	 * */
	
	String nombre;
	int primerT;
	int segundoT;
	int tercerT;
	int media;
	
	public Notas(String nombre, int primerT, int segundoT, int tercerT) {
		super();
		this.nombre = nombre;
		this.primerT = primerT;
		this.segundoT = segundoT;
		this.tercerT = tercerT;
	}
	public Notas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	float mediaNota()
	{
		media =(primerT+segundoT+tercerT)/3;
		
		return media;
	}
	
	void imprimeAprobado()
	{
		if(media>5)
		{
			System.out.println("Ha aprobado la asignatura");
		}
		
		else
		{
			System.out.println("Ha suspendido la asignatura");
		}
	}
	
	int calculaNumApro() 
	{
		int numTri=0;
		if(primerT>=5)
		{
			numTri=1;
		}

		else if(primerT>=5 && segundoT>=5)
		{
			numTri=2;
		}
		else if(primerT>=5&& segundoT>=5&& tercerT>=5)
		{
			numTri=3;
		}
		else {
			numTri=0;
		}
		return numTri;
	}
	
	@Override
	public String toString() {
		return "Notas nombre: " + nombre + ", primerT: " + primerT + ", segundoT: " + segundoT + ", tercerT: " + tercerT;
	}
	
	
	
	
	
}
