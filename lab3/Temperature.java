public class Temperature {
    private double value;
    private char scale; 

    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C') return value;
        return 5 * (value - 32) / 9;
    }

    public double getFahrenheit() {
        if (scale == 'F') return value;
        return 9 * getCelsius() / 5 + 32;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }

    public static void main(String[] args) {
        Temperature t1 = new Temperature(36.6, 'C');
        System.out.println("C = " + t1.getCelsius());
        System.out.println("F = " + t1.getFahrenheit());

        Temperature t2 = new Temperature(100, 'F');
        System.out.println("C = " + t2.getCelsius());
        System.out.println("F = " + t2.getFahrenheit());
    }
}