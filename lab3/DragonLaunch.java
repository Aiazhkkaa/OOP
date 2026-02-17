import java.util.Vector;

enum Gender { B, G }

class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString() {
        return gender.toString();
    }
}

public class DragonLaunch {
    Vector<Person> line = new Vector<>();

    public void kidnap(Person p) {
        line.add(p);
    }

    public boolean willDragonEatOrNot() {
        int i = 0;
        while (i < line.size() - 1) {
            if (line.get(i).getGender() == Gender.B && line.get(i + 1).getGender() == Gender.G) {
                line.remove(i);
                line.remove(i);   
                if (i > 0) i--;   
            } 
            else {
                i++;
            }
        }
        return line.size() > 0;
    }

    public static void main(String[] args) {
        DragonLaunch d = new DragonLaunch();

        d.kidnap(new Person(Gender.B));
        d.kidnap(new Person(Gender.G));
        d.kidnap(new Person(Gender.G));
        d.kidnap(new Person(Gender.G));

        System.out.println("Someone left? " + d.willDragonEatOrNot());
    }
}