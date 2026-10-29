import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100:");
        int guessed_number = input.nextInt();
        int number = (int) (Math.random() * 101);
        while(guessed_number != number){
            if (guessed_number > number ){
                System.out.print("Good try, but the number is less or equal, try again:");
                guessed_number = input.nextInt();
                }
            if(guessed_number < number){
                System.out.print("Nice try, but the number is greater or equal, try again:");
                guessed_number = input.nextInt();
            }
        }
        if(guessed_number == number){
            System.out.printf("Congratulations, the number is %d, you made it!", number);
        }
    }
}
