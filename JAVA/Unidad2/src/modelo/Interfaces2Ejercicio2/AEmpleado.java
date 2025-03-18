package modelo.Interfaces2Ejercicio2;

import java.util.Objects;

public abstract class AEmpleado implements INomina {
	
	private String nombre;
	private String identificador;
	private String apellidos;
	private float salario;
	private boolean tienereReduccionHoraria;
	private Categoria puesto;
	
	public AEmpleado(String nombre, String identificador, String apellidos, float salario,
			boolean tienereReduccionHoraria, Categoria puesto) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
		this.apellidos = apellidos;
		this.salario = salario;
		this.tienereReduccionHoraria = tienereReduccionHoraria;
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean isTienereReduccionHoraria() {
		return tienereReduccionHoraria;
	}

	public void setTienereReduccionHoraria(boolean tienereReduccionHoraria) {
		this.tienereReduccionHoraria = tienereReduccionHoraria;
	}

	public Categoria getPuesto() {
		return puesto;
	}

	public void setPuesto(Categoria puesto) {
		this.puesto = puesto;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AEmpleado other = (AEmpleado) obj;
		return Objects.equals(identificador, other.identificador);
	}
	
	abstract void imprimeHorario();

	@Override
	public String toString() {
		return "AEmpleado [nombre=" + nombre + ", identificador=" + identificador + ", apellidos=" + apellidos
				+ ", salario=" + salario + ", tienereReduccionHoraria=" + tienereReduccionHoraria + ", puesto=" + puesto
				+ "]";
	}
	
	

}
