package entity;

public class Plato {

	private int idPlata;
	private int idCategoria;
	private String nombre;
	private double precio;
	public Plato(int idPlata, int idCategoria, String nombre, double precio) {
		super();
		this.idPlata = idPlata;
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.precio = precio;
	}
	public int getIdPlata() {
		return idPlata;
	}
	public void setIdPlata(int idPlata) {
		this.idPlata = idPlata;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Plato [idPlata=" + idPlata + ", idCategoria=" + idCategoria + ", nombre=" + nombre + ", precio="
				+ precio + "]";
	}
	
	
}
