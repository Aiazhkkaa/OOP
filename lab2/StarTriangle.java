public class StarTriangle {
    private int count;

    public StarTriangle(int count) {
        this.count = count; 
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int number = 1;
        while (number <= count) {
            sb.append("[*]".repeat(number)); 
            if (number < count) sb.append("\n"); 
            number++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(4);
        System.out.println(small.toString());
    }
}
