package br.edu.urnaEletronica;
public class voto {
	private Eleitor eleitor;
	private Candidato candidato;
	
	public voto(Eleitor eleitor, Candidato candidato) {
		this.eleitor = eleitor;
		this.candidato = candidato;
	}
	public String getResumo() {
		return "Eleitor: "+eleitor.gettituloEleitoral()+" votou no candidato: "+candidato.getnumero();
	}
}
