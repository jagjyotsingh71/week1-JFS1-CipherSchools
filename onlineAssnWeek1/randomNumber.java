package onlineAssnWeek1;
import java.util.Scanner;
import java.util.Random;

public class randomNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int computerGuess = rnd.nextInt(20);
        System.out.println("WELCOME TO THE GUESSING GAME !!!!");
        System.out.println("Computer Guess: " + computerGuess);

        for(int i=0; i<6; i++){
            System.out.println("Enter your guess: ");
            int a = sc.nextInt();
            if(a>computerGuess){
                System.out.println("Your guess is too high.");
            }
            else if(a<computerGuess){
                System.out.println("Your guess is too low");
            }
            else{
                System.out.println("Right guess.");
                break;
            }
        }

    }
}
