package numberguessinggame;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Enter the Number of rounds you want to play");
        int totalScore=0;
        int rounds=sc.nextInt();
        for(int round=1;round<=rounds;round++){
            boolean isGuessed=false;
            int randomNumber=rand.nextInt(100)+1;
            int guess=0;
            int maxAttempts=5;
            int pointsEarned=0;
            System.out.println("Round "+round+" Starts");
            System.out.println("Enter the number with in the range of 1 to 100 you have maximum number of attempts "+maxAttempts);
            for(int attempt=1;attempt<=maxAttempts;attempt++){
                System.out.print(attempt+" attempt ");
                guess=sc.nextInt();
                if(guess<randomNumber){
                    System.out.println("Too Low");
                }
                else if(guess>randomNumber){
                    System.out.println("Too High");
                }
                else{
                    pointsEarned = 100-(attempt-1)*20;
                    System.out.println("Correct you guessed in attempt "+attempt);
                    System.out.println("Points in these round "+round+" earned is "+pointsEarned);
                    totalScore+=pointsEarned;
                    isGuessed=true;
                    break;
                }
           }
           if(!isGuessed){
                    System.out.println("Out of attempts The correct guessing number is "+randomNumber);
           }
           System.out.println("Round "+round+"Ends");
         }
        System.out.println("Game over out of "+rounds+" rounds  the total score is "+totalScore+" out of "+(rounds*100));
    } 
}
