import java.util.Scanner;
public class CalculadoraSimples{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);

		float numero[] = new float[2];
		char operador;

		System.out.print("primeiro número: ");
		numero[0] = leia.nextFloat();
		System.out.print("operador: ");
		operador = leia.next().charAt(0);
		System.out.print("segundo número: ");
		numero[1] = leia.nextInt();

		switch(operador){
			case '+':
				System.out.format("soma = %.0f",(numero[0] + numero[1]));
			break;
			case '-':
				System.out.format("diferença = %.0f",(numero[0] - numero[1]));
			break;
			case '*':
				System.out.format("produto = %.0f",(numero[0] * numero[1]));
			break;
			case '/':
				if(numero[1] == 0){
					System.out.format("não é possível dividir por zero.");
				}else{
					System.out.format("divisão = %.2f",(numero[0] / numero[1]));
				}
			break;
			default:
				System.out.println("operador não encontrado, por favor tente novamente.");
			break;
		}
	}
}
