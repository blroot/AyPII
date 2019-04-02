package Guia3.ej3;

public class FacturaEmpresa extends Factura {
	
	public static final double IVA = 0.21;
	public static final double Retenciones = 0.17;
	private double montoRetenciones;
	private double montoIva;
	private double montoTotal;

	FacturaEmpresa(int dia, int mes, int anio, String descripcion, double valorCompra) {
		super(dia, mes, anio, descripcion, valorCompra);
		this.montoRetenciones = this.getValorCompra() * Retenciones;
		this.montoIva = this.getValorCompra() * IVA;
		this.montoTotal = this.getValorCompra() + this.montoRetenciones + this.montoIva;
	}
	
	public double getMontoRetenciones() {
		return this.montoRetenciones;
	}
	
	public double getMontoIva() {
		return this.montoIva;
	}

	@Override
	public double getMontoTotal() {
		return this.montoTotal;
	}
	
}
