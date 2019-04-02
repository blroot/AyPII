package Guia3.ej3;

public class FacturaResponsableInscripto extends Factura {
	
	public static final double IIBB = 0.15;
	public static final double IVA = 0.105; 
	private double montoTotal;
	private double montoIIBB;
	private double montoIVA;

	FacturaResponsableInscripto(int dia, int mes, int anio, String descripcion, double valorCompra) {
		super(dia, mes, anio, descripcion, valorCompra);
		this.montoIIBB = this.getValorCompra() * IIBB;
		this.montoIVA = this.getValorCompra() * IVA;
		this.montoTotal = this.getValorCompra() + this.montoIIBB + this.montoIVA;
	}
	
	public double getMontoIIBB() {
		return this.montoIIBB;
	}
	
	public double getMontoIVA() {
		return this.montoIVA;
	}

	@Override
	public double getMontoTotal() {
		return this.montoTotal;
	}
	
}
