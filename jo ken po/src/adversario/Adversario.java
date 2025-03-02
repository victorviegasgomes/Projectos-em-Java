package adversario;
import java.util.Random;
public class Adversario{
	public Random roleta = new Random();
	private int jogada;

	public void Jogadas(int jogada){
		this.jogada = jogada;
	}
	public void jogadaDoOponente(){
		jogada = roleta.nextInt(3);

		switch(jogada){
			case 0: System.out.println("oponente escolheu pedra!");
			break;
			case 1: System.out.println("oponente escolheu papel!");
			break;
			case 2: System.out.println("oponente escolheu tesoura!");
			break;
		}
	}
}
