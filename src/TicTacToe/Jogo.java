package TicTacToe;

import java.io.Serializable;

public abstract class Jogo implements Serializable {
	
	private String nomePartida;

	public Jogo() {
	}
	
	public Jogo(String nomePartida) {
		super();
		this.nomePartida = nomePartida;
	}
	
	public void verificaGanhador() {};

	
	
	public String getNomePartida() {
		return nomePartida;
	}

	public void setNomePartida(String nomePartida) {
		this.nomePartida = nomePartida;
	}

	@Override
	public String toString() {
		return "Jogo [nomePartida=" + nomePartida + "]";
	}

	public boolean verificarGanhador() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
