package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class atividade5
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
					
		System.out.println("Digite 5 cores");
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("Cor nº "+ i + ": ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.println("Listar todas as cores: ");
		Iterator<String> iCores = cores.iterator();
		while (iCores.hasNext())
		{
			System.out.println(iCores.next());
		}
		System.out.println("Ordenar as cores: ");
		Collections.sort(cores);
		iCores = cores.iterator();
		while (iCores.hasNext())
		{
			System.out.println(iCores.next());
		}
		leia.close();
	}
}
