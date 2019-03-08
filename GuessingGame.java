import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
   public static void main(String[]args)
   {
      Random rd = new Random();
      int myNumber = rd.nextInt(100)+1;
      Scanner kb = new Scanner(System.in);
      System.out.print("Guess what the number I have (1-100)? ");
      int userInput = kb.nextInt();
      int counter = 1;
      while (myNumber != userInput)
      {
         if (myNumber<userInput)
            System.out.println("Too high, try again.");
         else
            System.out.println("Too low, try again.");
         System.out.print("Guess again, what's your number? ");
         userInput = kb.nextInt();
         counter++;
      }
      System.out.println("You're right, the number is " + myNumber);
      System.out.printf("You guessed %d times\n",counter );
   }
}
