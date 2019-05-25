package Guia13;

import java.util.ArrayList;
import java.util.HashMap;

public class Negocio {
	
	private HashMap<String, ProductoYStock> productos;
	private static Negocio negocioInstance;
	
	private Negocio() {
		this.productos = new HashMap<String, ProductoYStock>();
	}
	
	public void modificarStock(String codigoUnico, Integer stock) {
		this.productos.get(codigoUnico).setStock(stock);
	}
	
	public void modificarNombre(String codigoUnico, String nombre) {
		this.productos.get(codigoUnico).getProducto().setNombre(nombre);
	}
	
	public void modificarMarca(String codigoUnico, String marca) {
		this.productos.get(codigoUnico).getProducto().setMarca(marca);
	}
	
	public void modificarProovedores(String codigoUnico, ArrayList<String> proovedores) {
		this.productos.get(codigoUnico).getProducto().setProovedores(proovedores);
	}
	
	public void altaDeProducto(Producto producto, Integer stock) {
		ProductoYStock productoYStock = new ProductoYStock(producto, stock);
		this.productos.put(producto.getCodigoUnico(), productoYStock);
	}
	
	public void bajaDeProducto(String codigoUnico) {
		this.productos.remove(codigoUnico);
	}
	
	public ProductoYStock getProductoYStock(String codigoUnico) {
		return this.productos.get(codigoUnico);
	}
	
	public boolean contieneProducto(String codigoUnico) {
		return this.productos.containsKey(codigoUnico);
	}
	
	// Patron Singleton
	public static Negocio getNegocioInstance() {
		if (negocioInstance == null) {
			negocioInstance = new Negocio();
		}
		return negocioInstance;
	}

}
