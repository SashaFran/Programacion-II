package sistemaElectoral;

import java.time.LocalDateTime;

public class Voto {


	private Candidato candidato;
	private LocalDateTime horaVoto;
	
	public Voto(Candidato candidato) {
		this.candidato = candidato;
		this.horaVoto = LocalDateTime.now();
	}

	public boolean votoA(Candidato c) {
		return this.candidato.equals(c);
	}
	
	public boolean votoEnBlanco() {
		return this.candidato == null;
	}
	
	public Candidato getCandidato() {
		return candidato;
	}

	public LocalDateTime getHoraVoto() {
		return horaVoto;
	}
	
	
}
