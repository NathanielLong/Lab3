import java.util.Scanner;

public class Workbook_Lab3 {

	public static void main(String[] args) {
		int userInput;
		String userName;
		boolean possibleRepeat;
		String userAnswer;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, Please Enter Your First Name: ");
		userName = scan.next();
		
		do {
			
		
		System.out.println("Please Enter an Integer in Between 1 and 100: ");
		userInput = scan.nextInt();
		
		if (userInput >= 0 && userInput <= 100) {
			if (userInput % 2 != 0 && userInput > 60) {
				System.out.println("Well " + userName + ", " + userInput + " is an odd number and over 60.");
			}
			
			else if (userInput % 2 == 0 && userInput >= 2 && userInput <= 25) {
				System.out.println("Well " + userName + ", the integer you put in is even and less than 25.");
			}
			
			else if (userInput % 2 == 0 && userInput >= 26 && userInput <= 60) {
				System.out.println("Well " + userName + ", the integer you put in is even.");
			}
			
			else if (userInput % 2 == 0 && userInput > 60) {
				System.out.println("Well " + userName + ", the integer " + userInput + "is even.");
			}
			
			else if (userInput % 2 != 0) {
				System.out.println("Well " + userName + ", " + userInput + " is an odd number.");
			}
		}
		
		System.out.println("Would you like to enter new values, please answer  yes or no: ");
		userAnswer = scan.next();
		possibleRepeat = userAnswer.equalsIgnoreCase("yes");
		
		} while(possibleRepeat);
		
		System.out.println("Good-Bye");
		scan.close();

	}

}
