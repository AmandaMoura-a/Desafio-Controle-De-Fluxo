package DesafioControleFluxo;

import java.util.Scanner;

	public class Contador {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o primeiro parâmetro: ");
	        int parametroUm = scanner.nextInt(); // Leitura do primeiro parâmetro
	        System.out.println("Digite o segundo parâmetro: ");
	        int parametroDois = scanner.nextInt(); // Leitura do segundo parâmetro

	        try {
	            // Chamando o método contendo a lógica de contagem
	            contar(parametroUm, parametroDois);

	        } catch (ParametrosInvalidosException exception) {
	            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
	            System.out.println(exception.getMessage());
	        }
	    }

	    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
	        if (parametroUm >= parametroDois) {
	            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
	        }

	        // Realizar o for para imprimir os números com base na variável contagem
	        for (int i = parametroUm; i <= parametroDois; i++) {
	            System.out.println("Imprimindo o número " + i);
	        }
	    }
	}

