package Guia13;

public class ProductoBasico implements ProductoAbstracto {
	
	private float precioDeCompra;
	
	public ProductoBasico(float precioDeFabrica) {
		this.precioDeCompra = precioDeFabrica;
	}
	
	public float getPrecioDeCompra() {
		return this.precioDeCompra;
	}

	@Override
	public float calcularCostoDeProduccion() {
		return this.precioDeCompra;
	}

}
