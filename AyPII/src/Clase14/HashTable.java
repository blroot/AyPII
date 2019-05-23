package Clase14;

import java.util.ArrayList;

public class HashTable<K, V> {
	
	private class Nodo<K, V> {
		
		K clave;
		V valor;
		
		public Nodo(K c, V v) {
			this.clave = c;
			this.valor = v;
		}
	}
	
	private int size;
	@SuppressWarnings("rawtypes")
	private Nodo[] tabla;
	private int defaultSize=67;
	
	
	public HashTable(int initialSize) {
		this.tabla = new Nodo[initialSize];
		this.size = initialSize;
	}
	
	public HashTable() {
		this.tabla = new Nodo[this.defaultSize];
		this.size = this.defaultSize;
	}
	
	public void put(K key, V value) {
		int posicion = this.computeHash(key);
		
		if (this.tabla[posicion] != null) {
			this.tabla[posicion] = new Nodo<K, V>(key, value);
		}
	}
	
	public V get(K key) {
		int posicion = this.computeHash(key);
		
		return this.tabla[posicion].valor;
	}
	
	public void remove (K key) {
		int posicion = this.computeHash(key);
		this.lista.set(posicion, null);
	}
	
	public boolean containsKey(K key) {
		int posicion = this.computeHash(key);
		return false;
	}
	
	public int size() {
		return this.size;
	}
	
	private int computeHash(K key) {
		return Math.abs(key.hashCode()) % (this.size);
	}
	
}
