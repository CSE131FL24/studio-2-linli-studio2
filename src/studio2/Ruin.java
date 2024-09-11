package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Asking staring amounts, win chance, and win limit
		Scanner in = new Scanner (System.in);

		System.out.print("What is your starting amount?");
		int startAmount = in.nextInt();

		System.out.print("what is your chance of winning?");
		double winChance = in.nextDouble();

		System.out.print("What is your win limit?");
		int winLimit = in.nextInt();

		
		//Start of loop
		while (startAmount == 0 || startAmount < winLimit) {
		
		//determines win/loss
		double number = (double) Math.random();
		System.out.println(number);
		if (number <= winChance) {
			System.out.println("You win!");
			startAmount ++;
			System.out.println(startAmount);
		}

		else {
			System.out.println("You lose!");
			startAmount --;
			System.out.println(startAmount);
		}
		
		}
		//if 

		
		// loop that will play until success or ruin
		//success = startAmount + 1(number of win) = win limit
		// ruin = startmount - 1(number of loss) = 0 

		//while (eirbgiobg <= );



		//Print this:	
		//The simulation (day) number

		//the number of plays that took place that day, and

		//whether the day ended in success or ruin
	}

}
