import java.util.Scanner;
public class Data {
    private double sum;
    private double max;
    private int count;

    public Data(){
        sum=0;
        max=Double.NEGATIVE_INFINITY;
        count=0;
    }

    public void add(double val){
        sum+=val;
        if(count==0 || max<val){
            max=val;
        }
        count++;
    }

    public double getMean(){
        if(count==0){
            return 0;}
        return sum/count;
    }
     public double getMax(){
        if(count==0){
            return 0;}
        return max;
    }

    public static void main(String[] var0){
        Scanner sc= new Scanner(System.in);
        Data data=new Data();
        while(true){
            System.out.print("Numer:");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("Q")) {
            break;}
            try {
            double value = Double.parseDouble(input);
            data.add(value);
            } 
            catch (Exception e) {
            System.out.println("Error! Write num or Q:");
            }

        System.out.println("Mean = " + data.getMean());
        System.out.println("Max = " + data.getMax());
        }
      
    }







}
