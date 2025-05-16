package br.edu.figurasplanas;

public class Quadrado {
	private double lado;
	private double area;
	
	public Quadrado(){
		
	}
	public void calcArea() {
		area = Math.pow(lado, 2);
	}
	public void listarAtributos() {
		System.out.println("Valor da lado: "+lado);
		System.out.println("Valor da área: "+area);
	}
}