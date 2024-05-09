package br.com.dio.desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int parametroDois = scanner.nextInt();

        try {
            if (parametroUm >= parametroDois) {
                if(parametroUm == parametroDois) {
                    throw new ParametrosInvalidosException("Os parâmetros não devem ser iguais!");
                }
            	throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }    
            
            	int resultado = parametroDois - parametroUm;
            	
              for (int contador = 1; contador <= resultado; contador++) {
            	  System.out.println("Imprimindo o número " + contador);
              }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

//alteração para ver se faz o push
