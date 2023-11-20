import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner vendas = new Scanner(System.in);
		
		int x;
		System.out.println("Quantos Notebooks você vendeu?");
		x = vendas.nextInt();
		System.out.printf("Você vendeu %d notebooks.%n", x);
		
		int y;
		System.out.println("Quantas geladeiras você vendeu?");
		y = vendas.nextInt();
		System.out.printf("Você vendeu %d geladeiras.%n", y);
		
		float z;
		System.out.println("Qual o valor em porcentagem da sua comissão?");
		z = vendas.nextFloat();
		vendas.close();
		
		int valorNotebook = 2700;
		int valorGeladeira = 3200;
		float porcentagemComissao =  z/100;
		
		int faturamentoNotebook = valorNotebook * x; 
		double comissaoNotebook = faturamentoNotebook * porcentagemComissao;
		System.out.printf("O seu valor de comissão pelas vendas dos notebooks é: %.2f%n",comissaoNotebook);
		

		int faturamentoGeladeira = valorGeladeira * y; 
		double comissaoGeladeira = faturamentoGeladeira * porcentagemComissao;
		System.out.printf("O seu valor de comissão pelas vendas das geladeiras é: %.2f%n",comissaoGeladeira);
		
		System.out.printf("Você tem um total a receber de: %.2f R$", comissaoNotebook + comissaoGeladeira);
		
		
		
	}

}

// entrada de dados sobre cada produto, multiplicar a entrada pelo preÃ§o, tirar a porcentagem de comissÃ£o do vendendor e somar tudo e mostrar no console