package br.edu.figurasplanas;

public class Pentagono {
	private double lado;
	private double area;
	private double apotema;
	
	public Pentagono(){
		
	}
	public void calcArea() {
		apotema = lado/(2*Math.tan(Math.PI/5));
		area = ((lado*5)*apotema)/2;
	}
	public void listarAtributos() {
		System.out.println("Valor da lado: "+lado);
		System.out.println("Valor da apotema: "+apotema);
		System.out.println("Valor da área: "+area);
	}
}
