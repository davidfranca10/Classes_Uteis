package br.edu.figurasplanas;

public class Trapezio {
	public double base1;
	public double base2;
	public double altura;
	public double area;
	
	public Trapezio(){
		
	}
	public void calcArea() {
		area = ((base1*base2)*altura)/2;
	}
	public void listarAtributos() {
		System.out.println("Valor da base1: "+base1);
		System.out.println("Valor da base2: "+base2);
		System.out.println("Valor da altura: "+altura);
		System.out.println("Valor da área: "+area);
	}
}

