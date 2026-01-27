import java.util.Scanner;

public class SquareCalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("side a:");
        double a = sc.nextDouble();

        double S = a*a;
        double P = 4*a;
        double D = a* Math.sqrt(2);

        System.out.println("S:"+ S);
        System.out.println("P:"+ P);
        System.out.println("D:"+ D);

    }


}


