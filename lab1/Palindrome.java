import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Word:");
        String word=sc.nextLine();

        int l=0;
        int r=word.length()-1;
        while(l<r){
            if(word.charAt(l)!=word.charAt(r)){
                System.out.println("not Palindrom");
                System.exit(0);}
        
        l++;
        r--;
        }
        System.out.println("Palindrome");
    }

}