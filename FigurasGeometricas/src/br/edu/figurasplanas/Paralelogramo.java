package br.edu.figurasplanas;

public class Paralelogramo {
	private double base;
	private double altura;
	private double area;
	
	public Paralelogramo(){
		
	}
	public void calcArea() {
		area = base*altura;
	}
	public void listarAtributos() {
		System.out.println("Valor da base: "+base);
		System.out.println("Valor da altura: "+altura);
		System.out.println("Valor da área: "+area);
	}
}
