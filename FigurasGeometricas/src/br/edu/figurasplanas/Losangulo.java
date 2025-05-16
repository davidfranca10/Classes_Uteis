package br.edu.figurasplanas;

public class Losangulo {
	private double MaiorD;
	private double MenorD;
	private double area;
	
	public Losangulo(){
		
	}
	public void calcArea() {
		area = (MaiorD*MenorD)/2;
	}
	public void listarAtributos() {
		System.out.println("Ponto mais distantes das estremidades: "+MaiorD);
		System.out.println("Ponto mais próximo das estremidades: "+MenorD);
	}
}
