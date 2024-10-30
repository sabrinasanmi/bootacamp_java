package atividade2;
import java.util.Scanner;

public class LaçoCondicional_Switch2
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String nome;
		int codCargo;
		float salario, novoSalario, reajuste;

		System.out.println("Nome do Colaborador: ");
		nome = leia.nextLine();

		System.out.println("Código do Cargo: ");
		codCargo = leia.nextInt();

		System.out.println("Salário atual: ");
		salario = leia.nextFloat();
		
		System.out.println("Nome do Colaborador: " + nome);

		switch (codCargo) 
		{
		case 1:
			reajuste = 0.1f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário com Reajuste: R$ %.2f", novoSalario);
			break;

		case 2:
			reajuste = 0.07f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário com Reajuste: R$ %.2f", novoSalario);
			break;

		case 3:
			reajuste = 0.09f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário com Reajuste: R$ %.2f", novoSalario);
			break;

		case 4:
			reajuste = 0.06f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário com Reajuste: R$ %.2f", novoSalario);
			break;

		case 5:
			reajuste = 0.05f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário com Reajuste: R$ %.2f", novoSalario);
			break;

		case 6:
			reajuste = 0.08f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salário com Reajuste: R$ %.2f", novoSalario);
			break;
		}
		leia.close();
	}
}
