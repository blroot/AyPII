package Guia13;

public class ProductoYStock {
	
	private Producto producto;
	private Integer stock;
	
	public ProductoYStock(Producto producto, Integer stock) {
		this.producto = producto;
		this.stock = stock;
	}
	
	public Producto getProducto() {
		return this.producto;
	}
	
	public Integer getStock() {
		return this.stock;
	}
	
	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
