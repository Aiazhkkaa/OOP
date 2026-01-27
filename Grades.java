import java.util.Scanner;

public class Grades{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Score:");
        int score = sc.nextInt();

        if (score>=95) System.out.println("A");
        else if (score>=90) System.out.println("A-");
        else if (score>=85) System.out.println("B+");
        else if (score>=80) System.out.println("B");
        else if (score>=75) System.out.println("B-");
        else if (score>=70) System.out.println("C+");
        else if (score>=65) System.out.println("C");
        else  System.out.println("C-");

    }



}