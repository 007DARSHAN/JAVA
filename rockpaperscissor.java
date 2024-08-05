
import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor
{
    public static void main(String[] args)
    {
        //0 for rock
        //1 for paper
        //2 for scissor
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 0 for rock ,1 for paper ,2 for scissor ");
         int userInput=sc.nextInt();
         Random random=new Random();
         int computerInput=random.nextInt(3);
         if(userInput==computerInput)
         {
            System.out.println("DRAW");
         }
         else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1)
         {
            System.out.println("***YOU WIN!***"); 
         }
         else 
         {
            System.out.println("***COMPUTER WIN!***");
         }
         if(computerInput==0)
         {
            System.out.println("COMPUTER CHOICE:ROCK");
         }
        else if(computerInput==1)
         {
            System.out.println("COMPUTER CHOICE:PAPER");
         }
         else if(computerInput==2)
         {
            System.out.println("COMPUTER CHOICE:SCISSOR");
         }
    }
}