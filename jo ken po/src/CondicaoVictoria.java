package src;
import java.util.Scanner;
import jogador.Jogador;
import adversario.Adversario;
public class CondicaoVictoria{
	public Scanner leia = new Scanner(System.in);
	public Jogador jogador = new Jogador();
	public Adversario oponente = new Adversario();
	private int opcao;

	public void escolherOpcao(int opcao){
		this.opcao = opcao;
	}
	public void condicaoDeVictoria(){
			jogador.jogadaDoJogador();
			oponente.jogadaDoOponente();

			if(jogador.jogadaDoJogador() == 1 && oponente.jogadaDoOponente() == 0){
				System.out.println("EMPATE!");
			}else if(jogador.jogadaDoJogador() == 2 && oponente.jogadaDoOponente() == 1){
				System.out.println("EMPATE!");
			}else if(jogador.jogadaDoJogador() == 3 && oponente.jogadaDoOponente() == 2){
				System.out.println("EMPATE!");
			}else if(jogador.jogadaDoJogador() == 1 && oponente.jogadaDoOponente() == 1){
				System.out.println("DERROTA!");
			}else if(jogador.jogadaDoJogador() == 2 && oponente.jogadaDoOponente() == 0){
				System.out.println("VICTÓRIA!");
			}else if(jogador.jogadaDoJogador() == 2 && oponente.jogadaDoOponente() == 2){
				System.out.println("DERROTA!");
			}else if(jogador.jogadaDoJogador() == 3 && oponente.jogadaDoOponente() == 1){
				System.out.println("VICTÓRIA!");
			}else if(jogador.jogadaDoJogador() == 1 && oponente.jogadaDoOponente() == 2){
				System.out.println("VICTÓRIA!");
			}else if(jogador.jogadaDoJogador() == 3 && oponente.jogadaDoOponente() == 0){
				System.out.println("DERROTA");
			}
	}
}
