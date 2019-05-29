package Guia13;

import java.util.ArrayList;

public class ProductoCompuesto implements ProductoAbstracto {
	
	private ArrayList<ProductoAbstracto> listaDeProductos;
	
	public ProductoCompuesto(ArrayList<ProductoAbstracto> listaDeProductos) {
		this.listaDeProductos = listaDeProductos;
	}

	@Override
	public float calcularCostoDeProduccion() {
		float costoTotal = 0.0f;
		for (ProductoAbstracto producto : this.listaDeProductos) {
			costoTotal += producto.calcularCostoDeProduccion();
		}
		return costoTotal;
	}

}
