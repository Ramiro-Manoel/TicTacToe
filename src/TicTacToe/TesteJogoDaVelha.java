package TicTacToe;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TesteJogoDaVelha {

	public static int confereInt() {
		Scanner sc = new Scanner(System.in);
		int valor = -1;
		do {
		try {
			valor = sc.nextInt();
		} catch (Exception e) {
			System.out.println("digite um caractere valido");
		}
		sc.nextLine();
		} while (valor < 0);
		
		return valor;
		
	}
	
	public static boolean desistencia(char jogador) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		System.out.println("opcoes:"
				+ "\n1 - jogar"
				+ "\n2 - desistir");
		while(op != 1 || op !=2) {
			op = sc.nextInt();
		switch(op) {
		case 1: 
			return false;
		case 2: 
			System.out.println("o jogador " + jogador + " desistiu");
			return true;
		default:
			System.out.println("opcao inválida, digite uma opcao dentre as listadas");
			break;
		}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o nome da partida");
		
		JogoDaVelha jogo = new JogoDaVelha(sc.nextLine());
		
		System.out.println(jogo);
		while(jogo.verificarGanhador() == false) {
			
			
			
			System.out.println("\njogador O:");
			if(desistencia('O') == true) {
				System.out.println("O jogador X ganhou");
				break;
			}
			System.out.println("digite as cordenadas que deseja jogar (primeiro I, depois J)");
			
				while(jogo.jogaO(confereInt(), confereInt()) == false) {
					System.out.println("jogada in´valida digite uma posição não ocupada dentro do tabuleiro");
				}
				
				System.out.println(jogo);
				
				if(jogo.verificarGanhador()) {
					break;
				}
				
			System.out.println("\njogador X:");
			if(desistencia('X') == true) {
				System.out.println("O jogador O ganhou");
				break;
			}
			System.out.println("digite as cordenadas que deseja jogar (primeiro I, depois J)");
			
			while(jogo.jogaX(confereInt(), confereInt()) == false) {
				System.out.println("jogada invalida digite uma posição não ocupada dentro do tabuleiro");
			}
			System.out.println(jogo);
		}
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("jogovelha.dat"));
			out.writeObject(jogo);
			out.close();
			System.out.println("\njogo salvo no arquivo local");
		} catch (IOException e) {
			System.out.println("\nerro ao salvar jogo no arquivo local");
		}
		
	}

}
