import java.util.*;
public class NumberGame{
    public static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);
        // Generate the numbers
        Random r = new Random();
        int number = r.nextInt(101);
        //int number = 1 + (int)(100* Math.random());
        // Given K Number of trials
        int K = 5;
        int i, guess;
        System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");
        // Iterate over K Trials
        for (i = 0; i < K; i++){
            System.out.println("Guess the number:");
            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed
            if (number == guess){
                System.out.println("Congratulations!"+ " You guessed the number.");
                System.out.println("Your score is: "+((K-i)*100));
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is "+ "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is"+ " less than " + guess);
            }
        }
        if (i == K){
            System.out.println("You have exhausted" + " 5 trials.");
            System.out.println("The number was " + number);
            System.out.println("Score : 0");
        }
    }
    public static void main(String[] args){
        guessingNumberGame();
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("Do you want to play again?(yes/no):");
            String n = s.next();
            if(n.equalsIgnoreCase("yes")){
                guessingNumberGame();
            }
            else if(n.equalsIgnoreCase("no")){
                System.out.println("Thanks for playing.");
                break;
            }
        }
    }
}
