import java.util.Scanner;
public class prac2 {
    public static void main(String[] args) {
       // System.out.println("working");
       Scanner sub = new Scanner(System.in);
       int Total_Marks = 500;

       System.out.println("Enter marks of Mathematics:");
       Float sub1=sub.nextFloat();
       System.out.println("Enter marks of English:");
       Float sub2=sub.nextFloat();
       System.out.println("Enter marks of Physics:");
       Float sub3=sub.nextFloat();
       System.out.println("Enter marks of Chemistry:");
       Float sub4=sub.nextFloat();
       System.out.println("Enter marks of Computer Science:");
       Float sub5=sub.nextFloat();
       Float Obtained_Marks= sub1+sub2+sub3+sub4+sub5;
       Float Percentage=(Obtained_Marks/Total_Marks)*100;
       System.out.print("The percentage of the given marks is:");
       System.out.println(Percentage);


        
    
        
    }
    
}
