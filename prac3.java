import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        System.out.println("Enter the kilometers to be converted into miles: ");
        Scanner sc =new Scanner(System.in);
        Double kilometers = sc.nextDouble();
        Double converted_miles=kilometers*0.621371;
        System.out.print(kilometers + " km is equal to " + converted_miles + " miles");


    }
    
}
