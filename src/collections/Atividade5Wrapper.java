package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade5Wrapper
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);
		
        Scanner leia = new Scanner(System.in);
        
		while (true)
		{
			System.out.print("Digite o número que você deseja encontrar: ");
			int numeroBuscado = leia.nextInt();
			
			if(numeros.indexOf(numeroBuscado) != -1)
				System.out.println("O número "+ numeroBuscado +" está localizado na posição: " + numeros.indexOf(numeroBuscado));
			else
			{
				System.out.print("O número "+ numeroBuscado +" não foi encontrado!");
				break;
			}
		}
		leia.close();
	}
}
