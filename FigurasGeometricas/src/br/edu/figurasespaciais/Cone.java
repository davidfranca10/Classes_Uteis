package br.edu.figurasespaciais;

public class Cone {
	private double raio;
	private double base;
	private double altura;
	private double volume;
	private double areaTotal;
	
	public Cone(){
		
	}
	public void calcBase(){
		base = Math.PI*Math.pow(raio, 2);
	}
	public void calcVolume(){
		volume = (Math.PI*Math.pow(raio, 2)*altura)/3;
	}
	public void calcAreaT() {
		areaTotal = (Math.PI*Math.pow(raio, 2)) + (Math.PI*raio*Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2)));
	}
	public void listarAtributos() {
		System.out.println("Listando Atributos do Cone.");
		System.out.println("Raio: "+raio);
		System.out.println("Área da base: "+base);
		System.out.println("Altura: "+altura);
		System.out.println("Volume: "+volume);
		System.out.println("Área total do cone: "+areaTotal);
	}
}
