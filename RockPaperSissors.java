import java.util.Random;
import java.util.Scanner;
public class RockPaperSissors {
    public static void main(String[] args) {
        int userchoice,compchoice,rock,paper,sissors;
        Scanner input=new Scanner(System.in);
        Random rnd=new Random();
        rock=0;
        paper=1;
        sissors=2;
        System.out.println("Rock Paper Sissors Game:");
        System.out.println("Enter your choice: 0=rock,1=paper,2=sissors->");
        userchoice=input.nextInt();
        while (userchoice > 2) {
            System.out.println("give number between 0 and 2");
            userchoice = input.nextInt();
        }
        if(userchoice==rock){
            System.out.println("You choose rock.");
        }
        else if(userchoice==paper){
            System.out.println("You choose paper.");
        }
        else if(userchoice==sissors){
            System.out.println("You choose sissors.");
        }
        compchoice=rnd.nextInt(3);
        if(compchoice==rock){
            System.out.println("comp  choose rock.");
        }
        else if(compchoice==paper){
            System.out.println("comp choose paper.");
        }
        else if(userchoice==sissors){
            System.out.println("comp choose sissors.");
        }
        while (userchoice == compchoice) {
            System.out.println("draw try again");}
            userchoice=input.nextInt();
        while (userchoice > 2) {
            System.out.println("give number between 0 and 2");
            userchoice = input.nextInt();
        }
        if(userchoice==rock){
            System.out.println("You choose rock.");
        }
        else if(userchoice==paper){
            System.out.println("You choose paper.");
        }
        else if(userchoice==sissors){
            System.out.println("You choose sissors.");
        }
        compchoice=rnd.nextInt(3);
        if(compchoice==rock){
            System.out.println("computer choose rock.");
        }
        else if(compchoice==paper){
            System.out.println("computer choose paper.");
        }
        else if(userchoice==sissors){
            System.out.println("computer choose sissors.");
        }
        if (compchoice==rock)
        {
            if (userchoice==paper)
            {  
                System.out.println("User wins!");
            }
            else 
            {
                System.out.println("Computer Wins");
            }
        }
      else if (compchoice==paper)
      {
        if (userchoice==rock)
            {
                System.out.println("Computer wins");
            }
        else
            {
                System.out.println("User Wins!");
            }
      }
      else if (userchoice==rock)
      {
        System.out.println("User Wins");
      }
      else
      {
          System.out.println("Computer Wins");
      }
        }
    }
            
           