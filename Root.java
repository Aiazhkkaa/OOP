import java.util.Scanner;

public class Root{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("a:");
        double a=sc.nextDouble();

        System.out.print("b:");
        double b=sc.nextDouble();

        System.out.print("c:");
        double c=sc.nextDouble();

        double D=(b*b)-4*a*c;
        if (D>0) System.out.println("x1:"+(-b+Math.sqrt(D))/(2*a)+" x2:"+(-b-Math.sqrt(D))/(2*a));
        else if (D==0) System.out.println("x:"+(-(b/2)/b));
        else System.out.println("No real roots");
       
    }
}