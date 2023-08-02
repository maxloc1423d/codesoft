import java.util.Scanner;
import java.util.Random;

public class finaltaks {
    public static void main(String[] args) {
        int min = 1; 
        int max = 100; 
        int maxAttempts = 10; 
        int userScore=0;
        Random random = new Random();
        int generatedNumber = random.nextInt(max - min + 1) + min;
        boolean play=true;
        while(play){
        Scanner scanner = new Scanner(System.in);
        
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + ": Guess the number: ");
            int userGuess = scanner.nextInt();
            
            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                userScore = 100 - (attempt - 1) * 10; // Calculate score based on attempts
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            
            if (attempt == maxAttempts) {
                System.out.println("Sorry, you're out of attempts. The number was " + generatedNumber + ".");
            }
        }
        System.out.println("your score: "+userScore);
        System.out.print("Do you want to play again? (yes/no): ");
        String playinInput = scanner.next();
        play = playinInput.equalsIgnoreCase("yes");
    
        scanner.close();
    }}

}
