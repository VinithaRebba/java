import java.util.*;
public class numberGame {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int score=0;
        System.out.println("iam thinking of a number between 1 to 100 you have 5 tries to guess the number");
        System.out.println("you have 5 choices to guess the number after you can continue a new game ");
        for(int i=1;i>0;i++){
            int answer=(int)(Math.random()*100)+1;
                System.out.println("the answer is "+answer);
              for(int limit=1;limit<=5;limit++){
            System.out.println("enetr your guess number");
            int guess=input.nextInt();
            if (guess==answer){
                System.out.println("You guess the number correct You Won");
                score+=1;
               System.out.println("your score is"+score);
                break;
            }
            else if(guess>answer){
                System.out.println("Your guess is too high you have"+(5-limit)+"choices to guess the number");
            }
            else{
                System.out.println("Your guess is too low you have"+(5-limit)+"choices to guess the number");
            }

        
        } System.out.println("you can continue the Newgame");
     } 
    }  
} 
      



