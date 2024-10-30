package atividade2;
import java.util.Scanner;

public class LaçoCondicional_if2
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int numero, parOUimpar;

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		parOUimpar = numero % 2;

		if ((parOUimpar == 0) && (numero > 0))
		{
			System.out.printf("O Número %d é par e positivo!", numero);
		}
		else if ((parOUimpar != 0) && (numero < 0))
		{
			System.out.printf("O Número %d é ímpar e negativo!", numero);
		}
		else if ((parOUimpar == 0) && (numero < 0))
		{
			System.out.printf("O Número %d é par e negativo!", numero);
		}
		else if ((parOUimpar != 0) && (numero > 0))
		{
			System.out.printf("O Número %d é ímpar e positivo!", numero);
		}
		leia.close();
	}
}
