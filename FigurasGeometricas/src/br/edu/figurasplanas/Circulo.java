package br.edu.figurasplanas;

public class Circulo {
	private double raio;
	private double area;
	
	public Circulo(){
		
	}
	public void calcArea() {
		area = 3.14*(Math.pow(raio, 2));
	}
	public void listarAtributos() {
		System.out.println("Raio do circulo: "+raio);
		System.out.println("Area do circulo: "+area);
	}
}
