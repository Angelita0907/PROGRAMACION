package modelo.Interfaces2Ejercicio1;

public abstract class Producto {
	
		private int id;
		private String nombre;
		private String descripcion;
		private double peso;
		private double precioVenta;
		private double precioCompra;
		private double ivaAplicable;
		
		public Producto(int id, String nombre, String descripcion, double peso, double precioVenta, double precioCompra,
				double ivaAplicable) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.peso = peso;
			this.precioVenta = precioVenta;
			this.precioCompra = precioCompra;
			this.ivaAplicable = ivaAplicable;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public double getPrecioVenta() {
			return precioVenta;
		}

		public void setPrecioVenta(double precioVenta) {
			this.precioVenta = precioVenta;
		}

		public double getPrecioCompra() {
			return precioCompra;
		}

		public void setPrecioCompra(double precioCompra) {
			this.precioCompra = precioCompra;
		}

		public double getIvaAplicable() {
			return ivaAplicable;
		}

		public void setIvaAplicable(double ivaAplicable) {
			this.ivaAplicable = ivaAplicable;
		}

		@Override
		public String toString() {
			return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", peso=" + peso
					+ ", precioVenta=" + precioVenta + ", precioCompra=" + precioCompra + ", ivaAplicable=" + ivaAplicable
					+ "]";
		}
		
		//public double precioNeto();
		//public double precioBruto();

		
}
