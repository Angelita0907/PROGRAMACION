package modelo;

public class CorreoElectronico {

	public static boolean validaCorreo(String correo) {
		boolean valido = false;
		/*if (correo.matches("\\[A-Za-z_0-9]+@+[A-Za-z_0-9]+.[A-Za-z_0-9]")) {
			System.out.println(valido = true);
		}
		else {
			System.out.println(valido = false);
		}*/
		return valido;
	}

	private String nombre;
	private String dominio;
	
	public CorreoElectronico(String correoCompleto)
	{
		super();
		String [] partes = correoCompleto.split("@");
		this.nombre = partes [0];
		this.dominio = partes[1];
	}

}
