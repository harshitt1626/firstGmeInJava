
import java.util.Scanner;
import java.util.Random;



public class RockPaperScissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("0 for Rock 👊 , 1 for Paper 📃 , 2 for Scissor ✂️");
        System.out.println("Enter the number :");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerNo = random.nextInt(3);

        if(userInput == computerNo){
            System.out.println("Draw");
        }
        else if(userInput == 0 && computerNo == 2 || userInput == 2 && computerNo == 1 && userInput == 1 && computerNo == 0  ){

            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Win" +" : " + computerNo);

        }

    }
}

