package Guia13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ProductoAbstractoTest {
	
	@Test
	public void calcularCostoDeProductoBasico() {
		ProductoAbstracto tornillo = new ProductoBasico(10.0f);
		assertEquals(10.0f, tornillo.calcularCostoDeProduccion());
	}
	
	@Test
	public void calcularCostoDeProductoCompuestoPorDosBasicos() {
		ProductoAbstracto tornillo = new ProductoBasico(0.15f);
		ProductoAbstracto tuerca = new ProductoBasico(0.12f);
		
		ArrayList<ProductoAbstracto> listaDeProductos = new ArrayList<ProductoAbstracto>();
		listaDeProductos.add(tornillo);
		listaDeProductos.add(tuerca);
		
		ProductoAbstracto producto = new ProductoCompuesto(listaDeProductos);
		
		assertEquals(0.27f, producto.calcularCostoDeProduccion());
	}
	
	@Test
	public void calcularCostoDeProductoCompuestoPorDosCompuestos() {
		ProductoAbstracto tornillo = new ProductoBasico(0.15f);
		ProductoAbstracto tuerca = new ProductoBasico(0.12f);
		
		ArrayList<ProductoAbstracto> listaDeProductosBasicos = new ArrayList<ProductoAbstracto>();
		listaDeProductosBasicos.add(tornillo);
		listaDeProductosBasicos.add(tuerca);
		
		ProductoAbstracto producto = new ProductoCompuesto(listaDeProductosBasicos);
		ProductoAbstracto producto1 = new ProductoCompuesto(listaDeProductosBasicos);
		
		ArrayList<ProductoAbstracto> listaDeProductosCompuestos = new ArrayList<ProductoAbstracto>();
		listaDeProductosCompuestos.add(producto);
		listaDeProductosCompuestos.add(producto1);
		
		ProductoAbstracto packDeDosTornillosConTuerca = new ProductoCompuesto(listaDeProductosCompuestos);
		
		
		assertEquals(0.54f, packDeDosTornillosConTuerca.calcularCostoDeProduccion());
	}

}
