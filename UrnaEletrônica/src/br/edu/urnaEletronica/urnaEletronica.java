package br.edu.urnaEletronica;

public class urnaEletronica {
	private int[] candidatos = new int[5];
	private int[] eleitores= new int[5]; 
	private boolean funcionamento = false;
	
	public void iniciarVotacao() {
		funcionamento = true;
		System.out.println("Votação Iniciada!");
	}
	public void encerrarVotacao() {
		funcionamento = false;
		System.out.println("Votação Encerrada!");
	}
	
	public void exibirResultado() {
		
	}
	
	public void registrarVoto(Eleitor eleitor, Candidato candidato) {
		
	}
}
