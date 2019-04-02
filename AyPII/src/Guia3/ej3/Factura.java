package Guia3.ej3;

public abstract class Factura {
	
	private int fechaDia;
	private int fechaMes;
	private int fechaAnio;
	
	private String descripcion;
	private double valorCompra;
	
	Factura(int dia, int mes, int anio, String descripcion, double valorCompra) {
		if (valorCompra <= 0.0) {
			throw new Error("El valor de compra debe ser mayor a cero");
		}
		
		this.fechaAnio = anio;
		this.fechaMes = mes;
		this.fechaDia = dia;
		this.descripcion = descripcion;
		this.valorCompra = valorCompra;
	}
	
	public int getFechaDia() {
		return this.fechaDia;
	}
	
	public int getFechaMes() {
		return this.fechaMes;
	}
	
	public int getFechaAnio() {
		return this.fechaAnio;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public double getValorCompra() {
		return this.valorCompra;
	}
	public abstract double getMontoTotal();

}
