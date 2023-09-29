package Calculadora;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EstatisticaApp {

	public static void main(String[] args) {

		/*
		 * Crie uma calculadora de estatísticas em Java que permita aos usuários inserir
		 * uma lista de números e, em seguida, calcular várias estatísticas
		 */
		int ArraySize = 10;

		int contagem = 1;

		int limite = 0;

		int Number1 = 0;

		int userInput = 0;

		// Criação de um array dinâmico
		ArrayList<Integer> numeros = new ArrayList<>();

		// Instanciando o objeto
		Estatisticas e = new Estatisticas();

		do {

			try {

				Number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o " + contagem++ + "° Número"));

				// Verificação , se o número for negativo ou igual a 0 o programa é interrompido
				if (Number1 <= 0) {

					JOptionPane.showMessageDialog(null,
							"Não é possível inserir números negativos ou iguais a zero, tente novamente!!");
				}

				else {

					// caso contrário ele adiciona o número fornecido no ArrayList e incrementa a
					// contagem.

					numeros.add(Number1);

					limite++;

				}

				// Verifica o erro, caso aconteça.
			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Ocorreu um erro inesperado, você finalizou a aplicação incorretamente ou inseriu dados inválidos , tente novamente!!");

			}

			// Enquanto a contagem for menor ou igual a 5 o loop continuará, complementando
			// a quantidade do array dinâmico.
		} while (limite < ArraySize);

		// Loop para imprimir os valores fornecidos
		for (int i = 0; i < numeros.size(); i++) {

			System.out.print(numeros.get(i) + " " + " ");

		}

		// -------------------------- Inicio das opções de Cálculo
		// -------------------------------------//

		do {

			try {

				// Entrada do usuário, onde é possível escolhar uma operação matemática, com os
				// números fornecidos anteriormente
				userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha uma opção \n1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão \n5-Média \n6-Variância \n7-Mediana \n8-Amplitude \n9-Desvio Padrão"));

				// Verificação da entrada do usuário, se o número fornecido pelo usuário for
				// menor ou igual a 0 ocorre uma mensagem de erro.
				if (userInput <= 0) {

					JOptionPane.showMessageDialog(null,
							"Não é possível inserir números negativos ou iguais a zero, tente novamente!!!");
				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Ocorreu um erro inesperado, você finalizou a aplicação incorretamente ou inseriu dados inválidos , tente novamente!!");

			}

			switch (userInput) {

			case 1:

				// Se o usuario escolher a opção 1 , o método SOMA ocorre.
				e.CalcularSoma(numeros);

				break;

			case 2:
				// Se o usuario escolher a opção 2 , o método SUBTRAÇÃO ocorre.

				e.CalcularSubtracao(numeros);

				break;

			case 3:

				// Se o usuario escolher a opção 3 , o método MULTIPLICAÇÃO ocorre.

				e.CalcularMultiplicacao(numeros);

				break;

			case 4:

				// Se o usuario escolher a opção 4 , o método DIVISÃO ocorre.

				e.CalcularDivisao(numeros);

				break;

			case 5:

				// Se o usuario escolher a opção 5 , o método MÉDIA ocorre.

				e.CalcularMedia(numeros);

				break;

			case 6:

				// Se o usuario escolher a opção 6 , o método VARIÂNCIA ocorre.

				e.CalcularVariancia(numeros);

				break;

			case 7:

				// Se o usuario escolher a opção 7 , o método MEDIANA ocorre.

				e.CalcularMediana(numeros);

				break;

			case 8:

				// Se o usuario escolher a opção 8 , o método AMPLITUDE ocorre.

				e.CalcularAmplitude(numeros);

				break;

			case 9:

				// Se o usuario escolher a opção 9 , o método Desvio Padrão ocorre.

				e.CalcularDesvioPadrao(numeros);

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"Você não selecionou nenhuma opção, portanto o programa foi finalizado");

				break;

			}

		} while (userInput > 0);

	}

}
