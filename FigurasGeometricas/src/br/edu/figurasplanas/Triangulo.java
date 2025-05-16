package br.edu.figurasplanas;

public class Triangulo {
	public double altura;
	public double base;
	public double area;
	
	public Triangulo(){
		
	}
	public void calcArea() {
		area = (base*altura)/2;
	}
	public void listarAtributos() {
		System.out.println("Valor da base2: "+base);
		System.out.println("Valor da altura: "+altura);
		System.out.println("Valor da área: "+area);
	}
}

