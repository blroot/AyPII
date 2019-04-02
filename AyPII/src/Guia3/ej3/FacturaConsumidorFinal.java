package Guia3.ej3;

public class FacturaConsumidorFinal extends Factura {

	FacturaConsumidorFinal(int dia, int mes, int anio, String descripcion, double valorCompra) {
		super(dia, mes, anio, descripcion, valorCompra);
	}

	@Override
	public double getMontoTotal() {
		return this.getValorCompra();
	}
	
}
