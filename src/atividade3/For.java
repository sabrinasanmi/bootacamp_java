package atividade3;

import java.util.Scanner;

public class For
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
        int numero, i; 
		int pares = 0;
		int impares = 0;
				
        for(i = 1; i <= 10; i++)
		{
			System.out.println("Digite o "+ i +"º número: ");
			numero = leia.nextInt();
			if((numero % 2) == 0)
			{
				pares++;
			}
			else
			{
				impares++;
			}
		}
        leia.close();
        System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
	}

}
