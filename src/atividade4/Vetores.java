package atividade4;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int vetor_numero[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		int i = 0;
		
		while (true)
		{
			System.out.println("Digite o número que você deseja encontrar: ");
			numero = leia.nextInt();

			Arrays.sort(vetor_numero);
			i = Arrays.binarySearch(vetor_numero, numero);

			if(i >= 0)
			{
				System.out.println("O número " + numero + "  está localizado na posição: " + i);
			}
			else
			{
				System.out.println("O número " + numero + " não foi encontrado!");
				break;
			}
		}
	}
}
