package br.edu.figurasespaciais;

public class Cilindro {
	private double raio;
	private double altura;
	private double base;
	private double volume;
	private double areaTotal;
	
	public Cilindro() {
		
	}
	public void calcVolume() {
		volume = Math.PI*Math.pow(raio, 2)*altura;
	}
	public void calcAreaTotal() {
		areaTotal = (2*(Math.PI*Math.pow(raio,2)))+(2*Math.PI*raio*altura);
	}
	public void listarAtributos() {
		System.out.println("Listando atributos do Cilindro.");
		System.out.println("Raio: "+raio);
		System.out.println("Área da base: "+base);
		System.out.println("Altura: "+altura);
		System.out.println("Volume: "+volume);
		System.out.println("Área do Cilíndro: "+areaTotal); 
	}
	
	
	}
