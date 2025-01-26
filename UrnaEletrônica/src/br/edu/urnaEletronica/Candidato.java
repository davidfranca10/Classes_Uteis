package br.edu.urnaEletronica;

public class Candidato {
	private String nome;
	private int numero;
	private int partido;
	private double votos;
	
	public Candidato(String nome, int numero, int partido) {
		this.nome = nome;
		this.numero = numero;
		this.partido = partido;
		this.votos = 0;
	}
		
	public void getInformacoes() {
		System.out.println("Nome: "+nome);
		System.out.println("Número: "+numero);
		System.out.println("Partido: "+partido);
		System.out.println("Votos: "+votos);
	}
	public int getnumero() {
		return numero;
	}
}
