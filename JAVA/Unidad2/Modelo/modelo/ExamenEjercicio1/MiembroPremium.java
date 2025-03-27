package modelo.ExamenEjercicio1;

public class MiembroPremium extends MiembroBase {

	private static int maximoAmigos = 3;
	private TipoPremium tipo;

	public MiembroPremium(String email, String nombre,
			TipoPremium tipo) {
		super(email, nombre);
		this.tipo = tipo;
	}

	public static int getMaximoAmigos() {
		return maximoAmigos;
	}

	public static void setMaximoAmigos(int maximoAmigos) {
		MiembroPremium.maximoAmigos = maximoAmigos;
	}

	public TipoPremium getTipo() {
		return tipo;
	}

	public void setTipo(TipoPremium tipo) {
		this.tipo = tipo;
	}

	@Override
	public String getTipoUsuario() {
		String tipoUsuario;
		
		if(getTipo().equals(TipoPremium.PREMIUM)) {
			tipoUsuario = "Premium: "+ TipoPremium.PREMIUM;
		}
		else {
			tipoUsuario = "Premium: "+ TipoPremium.PREMIU_VIP;
		}
		
		return tipoUsuario;
	}
	
	@Override
	public String toString() {
		return "MiembroBase [id=" + getId() + ", email=" + getEmail() + ", nombre=" + getNombre() + ", tipoUsuario= "+ getTipoUsuario();
	}

	@Override
	public void addAmigo(MiembroBase miembro) {
		// TODO Auto-generated method stub
		
	}

}
