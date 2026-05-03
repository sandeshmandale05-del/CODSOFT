// Number game
import java.util.Scanner;
import java.util.Random;
public class Numguessgame{
    public static void main(String args[]){
        Random random=new Random();
        Scanner scan=new Scanner(System.in);

        System.out.println("Computer generated Random number b/w(1-100): ");

        int RandomNumber=random.nextInt(100)+1;
        System.out.println(RandomNumber);
        int trycount=0;

        while(true){
            trycount=trycount+1;

        System.out.println("Enter your Guessing number for to match with Computer generated Number:");

        int userguess=scan.nextInt();

        if(RandomNumber==userguess){
            System.out.println("Your Guess is correct! You win the game! ");
            System.out.println("Score out of 10 , -1 for each attempt you took");
            int score=10-trycount;

            if(score<0){
                System.out.println("your score is 0/10 ");
            }
            else if(score>10){
                System.out.println("Your score is 10/10 ");
            }
            else{
                System.out.println("Your score:" + score +" /10");
            }
            break;
        }
        else if(RandomNumber > userguess){
            System.out.println("your guess is lower , guess again ");
        }
        else if(RandomNumber < userguess){
            System.out.println("Your guess is higher , guess again ");
        }
        }
        scan.close();
        System.out.println("your total trials is:" + trycount);
    }
}