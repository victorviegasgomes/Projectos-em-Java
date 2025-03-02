import jogador.Jogador;
import adversario.Adversario;
public class Jogo{
	public static void main(String [] args){
		Jogador jogador = new Jogador();
		Adversario oponente = new Adversario();

		jogador.jogadaDoJogador();
		oponente.jogadaDoOponente();
	}
}
