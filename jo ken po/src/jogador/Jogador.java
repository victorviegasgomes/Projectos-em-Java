package jogador;
import java.util.Scanner;
public class Jogador{
	public Scanner leia = new Scanner(System.in);
	private int jogada;

	public void jogadas(int jogada){
		this.jogada = jogada;
	}
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
}
