public class Coffee {
    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    public static int totalOrders = 0;
    private final int id;

    private String customerName;
    private Size size;
    private double price;
    {
        totalOrders++;  
    }
    public Coffee(int id, String customerName) {
        this.id = id;                    
        this.customerName = customerName;
        this.size = Size.MEDIUM;          
        this.price = 1500;
    }

    public Coffee(int id, String customerName, Size size) {
        this(id, customerName);
        this.size = size;      
        recalcPrice();
    }

    public void setSize(Size size) {
        this.size = size;
        recalcPrice();
    }

    public void setSize(String size) {
        this.size = Size.valueOf(size.toUpperCase());
        recalcPrice();
    }

    private void recalcPrice() {
        if (size == Size.SMALL) price = 1200;
        else if (size == Size.MEDIUM) price = 1500;
        else price = 1800;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order #" + id + " | " + customerName + " | " + size + " | " + price;
    }

    public static void main(String[] args) {

        Coffee o1 = new Coffee(1, "Aiazhan");
        Coffee o2 = new Coffee(2, "Dana", Coffee.Size.LARGE);

        System.out.println(o1);
        System.out.println(o2);

        System.out.println("Total orders: " + Coffee.totalOrders);
    }
}
