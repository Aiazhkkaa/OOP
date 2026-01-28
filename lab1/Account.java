import java.util.Scanner;
public class Account{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Balance:");
        double balance=sc.nextDouble();

        System.out.print("Interest:");
        double interest=sc.nextDouble();

        double newBalance=balance + balance*interest/100;

        System.out.println("newBalance:"+newBalance);

    }


}