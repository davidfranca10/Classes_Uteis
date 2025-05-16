package br.edu.figurasespaciais;

public class Pirâmide {
	private double altura;
	private double arestab;
	private double Base;
	private double Face;
	private double areaTotal;
	private double volume;
	
	public Pirâmide() {
		
	}
	public void calcAreaBase() {
		Base = Math.pow(arestab, 2);
	}
	public void calcAreaFaces() {
		Face = (arestab*altura)/2;
	}
	public void calcAreaTotal() {
		areaTotal = Base+Face;
	}
	public void calcVolume() {
		volume = (Base*altura)/3;
	}
	public void listarAtributos() {
		System.out.println("Listando atributos da Pirâmide.");
		System.out.println("Base: "+Base);
		System.out.println("Altura: "+altura);
		System.out.println("Área: "+areaTotal);
		System.out.println("Volume: "+volume);
	}
}
