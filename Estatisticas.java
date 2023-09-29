package Calculadora;

import java.util.ArrayList;

import java.util.Collections;

import javax.swing.JOptionPane;

public class Estatisticas {

	public Double CalcularSoma(ArrayList<Integer> numeros) {

		Double Soma = 0.0;

		// Itera sobre o Array que foi inicilizado anteriormente
		for (int i = 0; i < numeros.size(); i++) {

			// Atribui e acrescenta os valores a cada iteração
			Soma += numeros.get(i);

		}

		// Após somar todos os valores , imprime em uma caixa de dialogo.
		JOptionPane.showMessageDialog(null, "Resultado Final da SOMA entre todos os valores fornecidos = " + Soma);

		return Soma;

	}

	public Double CalcularSubtracao(ArrayList<Integer> numeros) {

		Double Subtracao = 0.0;

		// Itera sobre o Array que foi inicilizado anteriormente

		for (int i = 0; i < numeros.size(); i++) {

			// Atribui e subtrai os valores a cada iteração

			Subtracao -= numeros.get(i);

		}

		// Após Subtrair todos os valores , imprime em uma caixa de dialogo.
		JOptionPane.showMessageDialog(null,
				"Resultado Final da SUBTRAÇÃO entre todos os valores fornecidos = " + Subtracao);

		return Subtracao;

	}

	public Double CalcularMultiplicacao(ArrayList<Integer> numeros) {

		// Iniciando por um valor, não é possível iniciar por 0 pois todos os valores
		// seguintes serão nulos igualmente.
		Double Multiplicacao = 2.0;

		for (int i = 0; i < numeros.size(); i++) {

			// Itera sobre o arrai e atribui e multiplica cada valor
			Multiplicacao *= numeros.get(i);

		}

		// Ao final imprime na tela o resultado de todos os valores multiplicados.
		JOptionPane.showMessageDialog(null,
				"Resultado Final da MULTIPLICAÇÃO entre todos os valores fornecidos = " + Multiplicacao);

		return Multiplicacao;

	}

	public Double CalcularDivisao(ArrayList<Integer> numeros) {

		// Iniciando por um valor, não é possível iniciar por 0 pois todos os valores
		// seguintes serão nulos igualmente.

		Double Divisao = 1.0;

		for (int i = 0; i < numeros.size(); i++) {

			// Itera sob o Array dividindo e atribuindo todos os valores.
			Divisao /= numeros.get(i);
		}

		// O erro de divisão por 0 não irá ocorrer nesse caso, pois um valor nulo ou
		// negativo ja será tratado na entrada do usuário na parte inicial
		JOptionPane.showMessageDialog(null,
				"Resultado Final da DIVISÃO entre todos os valores fornecidos =  " + Divisao);

		return Divisao;

	}

	public Double CalcularMedia(ArrayList<Integer> numeros) {

		Double Media = 0.0;

		for (int i = 0; i < numeros.size(); i++) {

			// Itera sob o array, incrementa e soma;
			Media += numeros.get(i);
		}

		// Divide os valores somados pela quantidade do array , como não é um valor fixo
		// não irá ocorrer um erro caso o tamanho do array aumente ou diminua
		Media /= numeros.size();

		//Imprime na tela o resultado final.
		JOptionPane.showMessageDialog(null, "Resultado Final da MÉDIA entre todos os valores fornecidos =  " + Media);

		return Media;

	}

	// uma boa prática usar Double para representar a média e a subtração para que
	// os cálculos de variância possam lidar com números decimais. Isso é importante
	// para evitar perda de precisão nos cálculos.

	public Double CalcularVariancia(ArrayList<Integer> numeros) {

		// Cálculo da Diferença entre os valores fornecidos e a Média desses valores.

		Double SomaDosQuadradosDasDiferencas = 0.0;

		Double Diferenca = 0.0;

		Double Variancia = 0.0;

		// Cálculo da Média utilizando o método CalcularMedia, é uma boa prática
		// reutilizar um método que ja foi criado.
		Double Media = CalcularMedia(numeros);

		for (int i = 0; i < numeros.size(); i++) {

			Diferenca = numeros.get(i) - Media;

			Double DiferencaAoQuadrado = Diferenca * Diferenca;

			SomaDosQuadradosDasDiferencas += DiferencaAoQuadrado;
		}

		// Cálculo da variância
		Variancia = SomaDosQuadradosDasDiferencas / numeros.size();

		JOptionPane.showMessageDialog(null, "Resultado Final do Cálculo da Variância = " + Variancia);

		return Variancia;
	}

	public int CalcularMediana(ArrayList<Integer> numeros) {
		// Para ordenar uma lista ArrayList, é possível utilizar o Método Collections.
		// Em ordem Crescente.
		Collections.sort(numeros);

		int tamanho = numeros.size();

		if (tamanho % 2 == 0) {
			// Se o tamanho do ArrayList for par

			int indice1 = tamanho / 2 - 1;

			int indice2 = tamanho / 2;

			int valor1 = numeros.get(indice1);

			int valor2 = numeros.get(indice2);

			int MedianaPar = (valor1 + valor2) / 2;

			JOptionPane.showMessageDialog(null, "Mediana dos números Pares = " + MedianaPar);

			return MedianaPar;

		} else {

			// Se for ímpar

			int indice = tamanho / 2;

			int MedianaImpar = numeros.get(indice);

			JOptionPane.showMessageDialog(null, "Mediana dos números Ímpares = " + MedianaImpar);

			return MedianaImpar;
		}
	}

	public int CalcularAmplitude(ArrayList<Integer> numeros) {

		// Ordenando o array em ordem Crescente.
		Collections.sort(numeros);

		// Obtendo o primeiro e menor valor.

		int MenorValor = numeros.get(0);

		// Ordenando o array em ordem Decrescente.

		Collections.reverse(numeros);

		// Obtendo o primeiro e maior valor(em ordem Descrescente).

		int MaiorValor = numeros.get(0);

		// Cálculo da Amplitude, diferença entre o menor valor e maior valor.
		int ResultadoFinal = MaiorValor - MenorValor;

		JOptionPane.showMessageDialog(null,
				"O Resultado Final da Amplitude dos valores fornecidos = " + ResultadoFinal);

		return ResultadoFinal;

	}

	public Double CalcularDesvioPadrao(ArrayList<Integer> numeros) {

		Double MediaQuadradosDiferencas = 0.0;

		Double SubtracaoMedia = 0.0;

		Double DiferencaAoQuadrado = 0.0;

		// Cálculo da Média, para iniciar o cálculo do Desvio Padrão.

		Double Media = CalcularMedia(numeros);

		for (int i = 0; i < numeros.size(); i++) {

			SubtracaoMedia = Media - numeros.get(i);

			DiferencaAoQuadrado = SubtracaoMedia * SubtracaoMedia;

			MediaQuadradosDiferencas += DiferencaAoQuadrado;

		}

		Double Variancia = MediaQuadradosDiferencas / numeros.size();

		Double DesvioPadrao = Math.sqrt(Variancia);

		JOptionPane.showMessageDialog(null, "Desvio Padrão dos valores fornecidos = " + DesvioPadrao);

		return Media;
	}

}
