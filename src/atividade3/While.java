package atividade3;
import java.util.Scanner;

public class While
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
        int idade = 0; 
		int menores21 = 0;
		int maiores50 = 0;

        while(idade >= 0)
		{
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if((idade > 0) && (idade < 21))
			{
				menores21++;
			}
			else if(idade > 50)
			{
				maiores50++;
			}
		}
        leia.close();
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
	}
}
