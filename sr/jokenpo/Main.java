package jokenpo;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner inputObj = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Jokenpo!");
		System.out.println("Digite 1 para pedra");
		System.out.println("Digite 2 para papel");
		System.out.println("Digite 3 para tesoura");
		
		int userInput = inputObj.nextInt();
		int cpuInput = random.nextInt(3);
		
		switch(userInput) {
			case 1:
				if (cpuInput == 0) {
					System.out.println("Pedra! Empate");
					break;
				}
				else if (cpuInput == 1) {
					System.out.println("Papel! Perdeu");
					break;
				}
				else if (cpuInput == 2) {
					System.out.println("Tesoura! Ganhou");
					break;
				}
				else {
					System.out.println("Erro do cpu em escolher uma opção!");
					break;
				}
				
			case 2:
				if (cpuInput == 0) {
					System.out.println("Pedra! Ganhou");
					break;
				}
				else if (cpuInput == 1) {
					System.out.println("Papel! Empate");
					break;
				}
				else if (cpuInput == 2) {
					System.out.println("Tesoura! Perdeu");
					break;
				}
				else {
					System.out.println("Erro do cpu em escolher uma opção!");
					break;
				}
			case 3:
				if (cpuInput == 0) {
					System.out.println("Pedra! Perdeu");
					break;
				}
				else if (cpuInput == 1) {
					System.out.println("Papel! Ganhou");
					break;
				}
				else if (cpuInput == 2) {
					System.out.println("Tesoura! Perdeu");
					break;
				}
				else {
					System.out.println("Erro do cpu em escolher uma opção!");
					break;
				}
		}
			
	}

}
