package jogador;
import java.util.Scanner;
public class Jogador{
	//metodos da classe
	//Scanner é utilizado para dar entrada de dados do usuário
	public Scanner leia = new Scanner(System.in);
	//jogada vai armazenar os números digitados pelo usuário
	private int jogada;
	//tranforma o ateibuto jogada que está privado em publico
	public void jogadas(int jogada){
		this.jogada = jogada;
	}
	//método para escolha das jogadas do usuário
	public void jogadaDoJogador(){
		System.out.format("escolha: \n1) pedra \n2) papel \n3) tesoura\n");
		jogada = leia.nextInt();

		switch (jogada){
			case 1: System.out.println("jogador escolheu pedra!");
			break;
			case 2: System.out.println("jogador escolheu papel!");
			break;
			case 3: System.out.println("jogador escolheu tesoura!");
			break;
			default: System.out.println("opção não existe, escolha outro número!");
			break;
		}
	}
	//método para obter o número digitado pelo usuário
	//também está a ser utilizado na classe principal(Jogo)
	public int getJogada(){
		return jogada;
	}
}
