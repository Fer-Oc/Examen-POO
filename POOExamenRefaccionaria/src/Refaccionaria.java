
public class Refaccionaria {
	private String nombre_refaccion;
	private String ubicacion;
	private String tipo_refaccion;
	private float precio_refaccion;
	private int cantidad;
	
	public Refaccionaria() {
	}

	public Refaccionaria(String nombre_refaccion, String ubicacion, String tipo_refaccion, float precio_refaccion,
			int cantidad) {
		this.nombre_refaccion = nombre_refaccion;
		this.ubicacion = ubicacion;
		this.tipo_refaccion = tipo_refaccion;
		this.precio_refaccion = precio_refaccion;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Refaccionaria [nombre_refaccion=" + nombre_refaccion + ", ubicacion=" + ubicacion + ", tipo_refaccion="
				+ tipo_refaccion + ", precio_refaccion=" + precio_refaccion + ", cantidad=" + cantidad + "]\n";
	}

	public String getNombre_refaccion() {
		return nombre_refaccion;
	}

	public void setNombre_refaccion(String nombre_refaccion) {
		this.nombre_refaccion = nombre_refaccion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipo_refaccion() {
		return tipo_refaccion;
	}

	public void setTipo_refaccion(String tipo_refaccion) {
		this.tipo_refaccion = tipo_refaccion;
	}

	public float getPrecio_refaccion() {
		return precio_refaccion;
	}

	public void setPrecio_refaccion(float precio_refaccion) {
		this.precio_refaccion = precio_refaccion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

	
}
