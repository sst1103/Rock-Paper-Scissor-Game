package JavaProgramming;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor


        Scanner sc = new Scanner(System.in);
        int option;
        do {

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor :");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                    || userInput == 2 && computerInput == 1) {
                System.out.println("You Win!");
            } else if(userInput >=3){
                System.out.println("Invalid Input!!");
                break;
            }
            else {
                System.out.println("Computer Win!");
            }
            // System.out.println("Computer choice: " + computerInput);
            if (computerInput == 0) {
                System.out.println("Computer choice: Rock");
            } else if (computerInput == 1) {
                System.out.println("Computer choice: Paper");
            } else {
                System.out.println("Computer choice: Scissors");
            }

            System.out.println("Want to continue ? (yes(1) or no(0))");
             option = sc.nextInt();

        }while(option == 1);
    }
}

