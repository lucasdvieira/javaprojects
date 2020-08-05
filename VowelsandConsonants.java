import java.util.Scanner;

public class VowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = input.nextLine();
		int stringLength = userInput.length();
		int vowelCount = 0;
		int consonantCount = 0;
		int counter = 0;
		
		while (counter < stringLength) {
			if (userInput.charAt(counter) == 'a') {
				vowelCount++;
				counter++;
			}
			else if(userInput.charAt(counter) == 'e') {
				vowelCount++;
				counter++;
			}
			else if(userInput.charAt(counter) == 'i') {
				vowelCount++;
				counter++;
		}
			else if(userInput.charAt(counter) == 'o') {
				vowelCount++;
				counter++;
	}
			else if(userInput.charAt(counter) == 'u') {
				vowelCount++;
				counter++;
	}
			else {
				consonantCount++;
				counter++;
			}
		

}
		System.out.println("The number of vowels is " + vowelCount);
		System.out.println("The number of consonants is " + consonantCount);
		
	}
}
