package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		int nmenores;
		
		double alturaMedia, percentualMenores;
		Pessoas[] vetor = new Pessoas[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %d pessoa ", i+1);
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int age = sc.nextInt();
			System.out.println("Altura: ");
			double height = sc.nextDouble();
			vetor[i] = new Pessoas(name, age, height);
		}
		
		nmenores = 0;
		for(int i=0; i<n; i++) {
			 if(vetor[i].getAge()<16) {
				 nmenores++;
			 }
		}
		
		percentualMenores = ((double)nmenores/n) *100.0;

		double soma = 0.0;
		
		for(int i=0; i<n; i++) {
			soma += vetor[i].getHeight();
		}
		
		alturaMedia = soma/n;
		System.out.printf("Altura media: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for(int i=0; i<n; i++) {
			if(vetor[i].getAge()<16) {
				System.out.printf("%s\n", vetor[i].getName());
			}
		}
		
 		sc.close();
	}
}
