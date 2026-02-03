public class Student {

    private String name;
    private int id;
    private int year;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.year = 1; 
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
	public int incrementYear() {
    year++;
    return year;
	}
    public static void main(String[] args) {

        Student s = new Student("Ayazhan", 1);

        System.out.println(s.getName());
        System.out.println(s.getId());
		System.out.println(s.incrementYear());
    }
}


