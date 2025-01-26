package br.edu.urnaEletronica;

public class Eleitor {
	private String nome;
	private String tituloEleitoral;
	private boolean votou;
	
	public Eleitor(String nome, String titulo) {
		this.nome = nome;
		this.tituloEleitoral = titulo;
		this.votou = false;
	}
	
	public boolean podeVotar() {
		return !votou;
	}
	
	public String gettituloEleitoral() {
		return tituloEleitoral;
	}
}
