package atividade1;

import java.util.Scanner;
public class NovoSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.printf("Novo Salário: %.2f", novoSalario);
		
		leia.close();
	}

}
