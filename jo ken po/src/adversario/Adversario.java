package adversario;
import java.util.Random;
public class Adversario{
	//atributos da classe (Random serve para gerar números aleatórios)
	public Random roleta = new Random();
	//atributo jogada vai armazenar o número aleatório gerado pelo Random
	private int jogada;

	//método jogadas (vai transformar o atributo jogada, que é privado em publico)
	public void Jogadas(int jogada){
		this.jogada = jogada;
	}
	//método jogadaDoOponente (vai criar uma estrutura de escolha que vai definir quais são as jogadas do oponente)
	//tendo como base o os números aleatórios do Random
	public void jogadaDoOponente(){
	//jogada está armazenando um número aleatório
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
	//método para obter os números gerados pelo Randomque foram armazenados em jogada
	//este metódo está a ser utilizado na classe principal (Jogo) para aplicar as condições.
	public int getJogada(){
		return jogada;
	}
}
