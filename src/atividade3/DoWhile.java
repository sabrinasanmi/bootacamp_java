package atividade3;
import java.util.Scanner;

public class DoWhile
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
        int numero = 0; 
		int resultPositivo = 0;

		do
		{
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero > 0)
			{
				resultPositivo += numero;
			}
			
		}
		while(numero != 0);
		leia.close();
		System.out.println("A soma dos números positivos é: " + resultPositivo);
	}

}
