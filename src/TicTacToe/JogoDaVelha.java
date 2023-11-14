package TicTacToe;

import java.io.Serializable;
import java.util.Arrays;

public class JogoDaVelha extends Jogo implements Serializable {

	private char[][] tabuleiro;

	public JogoDaVelha() {
	}

	public JogoDaVelha(String nomePartida) {
		super(nomePartida);
		this.tabuleiro = new char[3][3];
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[0].length; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
	}

	public boolean jogaO(int i, int j) {
		if (i < 3 && i >= 0 && j < 3 && j >= 0) {
			if (tabuleiro[i][j] == ' ') {
				tabuleiro[i][j] = 'O';
				return true;
			}
		}
		return false;
	}

	public boolean jogaX(int i, int j) {
		if (i < 3 && i >= 0 && j < 3 && j >= 0) {
			if (tabuleiro[i][j] == ' ') {
				tabuleiro[i][j] = 'X';
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean verificarGanhador() {
		// verifica se O ganhou
		if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') {
			System.out.println("o jogador O ganhou");
			return true;
		}
		if (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') {
			System.out.println("o jogador O ganhou");
			return true;
		}
		if (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') {
			System.out.println("o jogador O ganhou");
			return true;
		}
		if (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') {
			System.out.println("o jogador O ganhou");
			return true;
		}
		if (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') {
			System.out.println("o jogador O ganhou");
			return true;
		}
		if (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') {
			System.out.println("o jogador O ganhou");
			return true;
		}
		if (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') {
			System.out.println("o jogador O ganhou");
			return true;
		}
		if (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') {
			System.out.println("o jogador O ganhou");
			return true;
		}

		// verifica se X ganhou

		if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') {
			System.out.println("o jogador X ganhou");
			return true;
		}
		if (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') {
			System.out.println("o jogador X ganhou");
			return true;
		}
		if (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') {
			System.out.println("o jogador X ganhou");
			return true;
		}
		if (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') {
			System.out.println("o jogador X ganhou");
			return true;
		}
		if (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') {
			System.out.println("o jogador X ganhou");
			return true;
		}
		if (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') {
			System.out.println("o jogador X ganhou");
			return true;
		}
		if (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') {
			System.out.println("o jogador X ganhou");
			return true;
		}
		if (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X') {
			System.out.println("o jogador X ganhou");
			return true;
		}
		
		int contador = 0;
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[0].length; j++) {
				if(tabuleiro[i][j] != ' ') {
					contador++;
				}
				if(contador ==9) {
					System.out.println("o jogo deu velha");
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public String toString() {

		return "nome da partida: " + super.getNomePartida() + "\n\n" + " " + 0 + " " + 1 + " " + 2 + "\n" + "0"
				+ tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2] + "\n" + "1" + tabuleiro[1][0] + "|"
				+ tabuleiro[1][1] + "|" + tabuleiro[1][2] + "\n" + "2" + tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|"
				+ tabuleiro[2][2];
	}
}
