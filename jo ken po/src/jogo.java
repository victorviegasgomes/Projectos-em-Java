import jogador.Jogador;
import adversario.Adversario;
import java.util.Scanner;
public class Jogo{
	public static void main(String [] args){
		//criando objectos das classes Jogador e Adversario
		Jogador jogador = new Jogador();
		Adversario oponente = new Adversario();
		Scanner leia = new Scanner(System.in);

		int opcao;

		//chamada do método jogadaDoJogador e o método jogadaDoOponente
		//para entender melhor veja as classes Jogador e Adversario.
		do{
			jogador.jogadaDoJogador();
			oponente.jogadaDoOponente();

		
		//condições de empate.
			if(jogador.getJogada() == 1 && oponente.getJogada() == 0){
				System.out.println("EMPATE!");
			}else if(jogador.getJogada() == 2 && oponente.getJogada() == 1){
				System.out.println("EMPATE!");
			}else if(jogador.getJogada() == 3 && oponente.getJogada() == 2){
				System.out.println("EMPATE!");
			}
			//condições de victoria.
			else if(jogador.getJogada() == 1 && oponente.getJogada() == 2){
				System.out.println("VENCESTE!");
			}else if(jogador.getJogada() == 2 && oponente.getJogada() == 0){
				System.out.println("VENCESTE!");
			}else if(jogador.getJogada() == 3 && oponente.getJogada() == 1){
				System.out.println("VENCESTE!");
			}
			//condicao de derrota (caso nenhuma das anteriores seja verdadeira).
			else{
				System.out.println("PERDESTE!");
			}
			System.out.format("quecontinuar? \n 1) sim \n 2) não \n");
			opcao = leia.nextInt();
		}while(opcao == 1);
	}
}
