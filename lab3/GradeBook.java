import java.util.Scanner;

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + ": " + grade;
    }
}
public class GradeBook {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Number of students; ");
    int n = sc.nextInt();

    Student[] students = new Student[n];
    int sum = 0;
    int max = -1;
    String best = "";

    for (int i = 0; i < n; i++) {
        System.out.print("Student name: ");
        String name = sc.next();
        System.out.print("Grade: ");
        int grade = sc.nextInt();

        students[i] = new Student(name, grade);
        sum += grade;

        if (grade > max) {
            max = grade;
            best = name;
            }
        }

    System.out.println("Average = " + (sum / (double) n));
    System.out.println("Highest = " + max + " (" + best + ")");

    sc.close();
    }
}
