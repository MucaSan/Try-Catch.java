package br.com.treinaweb.main;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This simple java program is just meant to explore the possibilities of breaking a try-catch case. So, let's dig into it.
		// declaring an object obtname to store the receive value
		
		Scanner Obtname = new Scanner (System.in);
		int variableToBeBroken = 0;
		
		try {
			variableToBeBroken = Obtname.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(String.format("You've used a wrong input value in the format: %s, as it's stated that it's only integers!", e.getMessage()));
			
		}catch(Exception e) {
			System.out.println(String.format("We've got an unexpected error! In the format: %s", e.getMessage()));
		}
	}
}
