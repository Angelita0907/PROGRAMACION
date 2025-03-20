package modelo.SimulacroExamen1;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler {

	private int id;
	private VehiculoGEneral datosVehiculo;
	private int numCarnet;
	private String dni;
	private LocalDate fechaEntega;
	private LocalDate fechaRegistro;
	private int numDias;
	private EstadoCoche estado;
	private double precioBase;

	public Alquiler(int id, VehiculoGEneral datosVehiculo, int numCarnet, String dni, LocalDate fechaEntega,
			LocalDate fechaRegistro, int numDias, EstadoCoche estado) {
		super();
		this.id = id;
		this.datosVehiculo = datosVehiculo;
		this.numCarnet = numCarnet;
		this.dni = dni;
		this.fechaEntega = fechaEntega;
		this.fechaRegistro = fechaRegistro;
		this.numDias = numDias;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VehiculoGEneral getDatosVehiculo() {
		return datosVehiculo;
	}

	public void setDatosVehiculo(VehiculoGEneral datosVehiculo) {
		this.datosVehiculo = datosVehiculo;
	}

	public int getNumCarnet() {
		return numCarnet;
	}

	public void setNumCarnet(int numCarnet) {
		this.numCarnet = numCarnet;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public EstadoCoche getEstado() {
		return estado;
	}

	public void setEstado(EstadoCoche estado) {
		this.estado = estado;
	}

	public LocalDate getFechaEntega() {
		return fechaEntega;
	}

	public void setFechaEntega(LocalDate fechaEntega) {
		this.fechaEntega = fechaEntega;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datosVehiculo, fechaEntega, fechaRegistro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(datosVehiculo, other.datosVehiculo) && Objects.equals(fechaEntega, other.fechaEntega)
				&& Objects.equals(fechaRegistro, other.fechaRegistro);
	}

	// se hace con instace of
	
	   public double getPrecioPorDia() {
		   double precioDia = 0;
		   double precioBase;
		   if(datosVehiculo instanceof Furgoneta) {
			  precioBase = 45;
			  precioDia = precioBase;
		   }
		   if(datosVehiculo instanceof Coche) {
				  precioBase = 40;
				  precioDia = precioBase;
		   }
		   if(datosVehiculo instanceof Patinete) {
				  precioBase = 50;
				  precioDia = precioBase;
		   }
		   
		   return precioDia;
	   }
	   
	   public double getImporteGeneradoPorAlquiler() {
		   double importeAlquiler = 0;
		   int diasAlquilados = this.numDias;
		   double precioDia = 0;
		   if(datosVehiculo instanceof Furgoneta) {
				  importeAlquiler = ((precioBase + (getPrecioPorDia() + ((Furgoneta) datosVehiculo).getPma() * 0.05)));
			   }
			   if(datosVehiculo instanceof Coche) {
				   importeAlquiler = getPrecioPorDia()*diasAlquilados;
			   }
			   if(datosVehiculo instanceof Patinete) {
					  importeAlquiler = getPrecioPorDia()+30*(numDias-1);
			   }
		   return importeAlquiler;
	   }
	   
	

}
