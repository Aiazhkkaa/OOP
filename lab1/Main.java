import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int length = text.length();

        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.print("+");

        System.out.println();

        System.out.print("|");
        System.out.print(text);
        System.out.print("|");
        System.out.println();

        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.print("+");

    }}
