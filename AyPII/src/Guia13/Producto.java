package Guia13;

import java.util.ArrayList;

public class Producto {
	
	private String codigoUnico;
	private String nombre;
	private String marca;
	private ArrayList<String> proovedores;
	
	Producto(String codigoUnico, String nombre, String marca, ArrayList<String> proovedores) {
		this.codigoUnico = codigoUnico;
		this.nombre = nombre;
		this.marca = marca;
		this.proovedores = proovedores;
	}
	
	public String getCodigoUnico() {
		return this.codigoUnico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public ArrayList<String> getProovedores() {
		return this.proovedores;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setProovedores(ArrayList<String> proovedores) {
		this.proovedores = proovedores;
	}

}
