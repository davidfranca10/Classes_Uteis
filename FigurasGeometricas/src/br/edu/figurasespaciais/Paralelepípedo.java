package br.edu.figurasespaciais;

public class Paralelepípedo {
	private double comprimento;
	private double largura;
	private double altura;
	private double volume;
	private double areaTotal;
	
	public Paralelepípedo() {
		
	}
	public void calcVolume(){
		volume = comprimento*largura*altura;
	}
	public void calcAreaT() {
		areaTotal = 2*(altura*largura + altura*comprimento + comprimento*largura);
	}
	public void listarAtributos() {
		System.out.println("Listando Atributos do Paralelepípedo.");
		System.out.println("Comprimento" +comprimento);
		System.out.println("Largura: "+largura);
		System.out.println("Altura: "+altura);
		System.out.println("Volume: "+volume);
		System.out.println("Área total: "+areaTotal);
	}
}
