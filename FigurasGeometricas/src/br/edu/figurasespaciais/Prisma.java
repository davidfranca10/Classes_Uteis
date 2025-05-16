package br.edu.figurasespaciais;

public class Prisma {
	private double base;
	private double arestaBase;
	private double areaLateral;
	private double altura;
	private double volume;
	private double areaTotal;
	
	public Prisma(){
		
	}
	public void calcAreaBase(){
		base = (Math.sqrt(3) / 4) * Math.pow(arestaBase, 2);
	}
	public void calcVolume(){
		volume = base * altura;
	}
	public void calcAreaLateral(){
		areaLateral = 3*arestaBase*altura;
	}
	public void calcAreaT() {
		areaTotal = 2*base + areaLateral;
	}
	public void listarAtributos() {
		System.out.println("Listando Atributos do Prisma.");
		System.out.println("Área da base: "+base);
		System.out.println("Volume do prisma: "+volume);
		System.out.println("Área lateral: "+areaLateral);
		System.out.println("Área total: "+areaTotal);
	}
}
