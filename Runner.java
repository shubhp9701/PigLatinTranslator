import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		String input = "";
		int numOfWords = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string: ");
		input = scan.nextLine();
		
		System.out.println("Enter the number of words in the string: ");
		numOfWords = scan.nextInt();
		
		Translator pig = new Translator(input, numOfWords);
		pig.separateWords();
		

	}

}
