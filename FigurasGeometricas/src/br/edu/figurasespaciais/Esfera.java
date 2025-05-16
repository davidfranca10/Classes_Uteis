package br.edu.figurasespaciais;

public class Esfera {
	private double raio;
	private double volume;
	private double areaTotal;
	
	public Esfera(){
		
	}
	public void calcVolume(){
		volume = 4/3 * Math.PI*Math.pow(raio, 3);
	}
	public void calcAreaT() {
		areaTotal = 4*Math.PI*Math.pow(raio, 2);
	}
	public void listarAtributos() {
		System.out.println("Listando Atributos da Esfera.");
		System.out.println("Raio: "+raio);
		System.out.println("Volume: "+volume);
		System.out.println("Área da esfera: "+areaTotal);
	}
}
