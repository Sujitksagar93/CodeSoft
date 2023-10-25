import java.util.Random;
import java.util.Scanner;


public class RandomNumber {

	public static void main(String[] args) {

		int randomnum, guess = 0, choice;

		System.out.println("Welcome here to guess number select below options");

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		do {
			System.out.println("1.Start");
			System.out.println("2.End");
			choice = sc.nextInt();

			randomnum = random.nextInt(101);// generate random no from 1 to 100

			switch (choice) {

			case 1:
				System.out.println("Enter number between 1 to 100 \n");
				guess = sc.nextInt();
				if (guess>100) {System.out.println("Please Enter Valid Number \n ");}
				else if (randomnum == guess) {
					System.out.println("Your Guess is correct " + randomnum);
				} else if (guess < randomnum) {
					System.out.println("Your guess is low please try again \n");
				}

				else if (guess > randomnum) {
					System.out.println("Your guess is high please try again \n");
				}
				break;
			case 2: {
				System.out.println("You are exited thank you........");
			}
			
			}

		} while (choice != 2);

		sc.close();
	}

	
}
