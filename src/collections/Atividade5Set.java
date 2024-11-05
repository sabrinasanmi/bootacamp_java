package collections;

import java.util.Set;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Atividade5Set
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		Set<Integer> numeros = new HashSet<>();
				
		System.out.println("Digite 10 números inteiros não repetidos");
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Digite o "+ i +"º número: ");
			int numeroDigitado = leia.nextInt();
			numeros.add(numeroDigitado);
		}
		List<Integer> numerosOrdenados = new ArrayList<>(numeros);
		Collections.sort(numerosOrdenados);
		
		System.out.print("Listar dados do Set: \n");
		Iterator<Integer> iNumeros = numerosOrdenados.iterator();
		while (iNumeros.hasNext())
		{
			System.out.println(iNumeros.next());
		}
		leia.close();
	}
}
