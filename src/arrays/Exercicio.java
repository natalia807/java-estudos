package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));//são inicializados com 0
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Percorrendo o Array
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);//média do aluno
		System.out.println(notasAlunoA[0]);//primeira nota do aluno
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);//última nota do aluno
		
		
		final double notaArmazenada = 5.9;//armazenando um literal no array
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10};//inicializando diretamente
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
