package modelo.Interfaces2Ejercicio1;

import java.time.LocalDate;

public interface IAlimentos {
	public void setCaducidad(LocalDate fecha); 
	public LocalDate getCaducidad(); 
	public int getCalorias();


}
