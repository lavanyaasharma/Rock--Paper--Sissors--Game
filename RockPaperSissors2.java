import java.util.Random;
import java.util.Scanner;
public class RockPaperSissors2 {
    public static void main(String[] args) {
        int userinput,rock,paper,sissors,compchoice;
        rock=0;
        paper=1;
        sissors=2;
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("Enter a number: 0 for rock, 1 for paper and 2 for sissors:");
        //Taking input from user.
        userinput=sc.nextInt();
        if(userinput>2){
            System.out.println("Enter a number between 0 and 2:");
        }
        if(userinput==rock){
            System.out.println("you choose Rock.");
        }
        else if(userinput==paper){
            System.out.println("you choose Paper.");
        }
        else if(userinput==sissors){
            System.out.println("you choose Sissors.");
        }
        //Taking input from computer.
        compchoice=rnd.nextInt(3);
        if(compchoice==rock){
            System.out.println("computer choose Rock.");
        }
        else if(compchoice==paper){
            System.out.println("computer choose Paper.");
        }
        else if(compchoice==sissors){
            System.out.println("computer choose Sissors.");
        }
        //Condition for a draw match.
        while(userinput==compchoice){
            System.out.println("MATCH DRAW...");
            userinput=sc.nextInt();
        
        //Taking input from user.
        userinput=sc.nextInt();
        if(userinput>2){
            System.out.println("Enter a number between 0 and 2:");
        }
        if(userinput==rock){
            System.out.println("you choose Rock.");
        }
        else if(userinput==paper){
            System.out.println("you choose Paper.");
        }
        else if(userinput==sissors){
            System.out.println("you choose Sissors.");
        }
        //Taking input from computer.
        compchoice=rnd.nextInt(3);
        if(compchoice==rock){
            System.out.println("computer choose Rock.");
        }
        else if(compchoice==paper){
            System.out.println("computer choose Paper.");
        }
        else if(compchoice==sissors){
            System.out.println("computer choose Sissors.");
        }
    }
        //RESULT CONDITIONS.
        if(compchoice==rock){
            if(userinput==paper){
                System.out.println("YOU WIN");
                
            }
            else{
                System.out.println("COMPUTER WINS");
            }
        }
        else if(compchoice==paper){
            if(userinput==sissors){
                System.out.println("YOU WIN");
                
            }
            else{
                System.out.println("COMPUTER WINS");
            }
        }
        else if(compchoice==sissors){
            if(userinput==rock){
                System.out.println("YOU WIN");
                
            }
            else{
                System.out.println("COMPUTER WINS");
            }
        } 

        

        
    }
    
}
