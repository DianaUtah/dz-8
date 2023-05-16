import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student leader = new Student(1, "John", "Doe");
        Group group = new Group(leader);

        Student student1 = new Student(2, "Alice", "Smith");
        Student student2 = new Student(3, "Bob", "Johnson");

        group.addStudent(student1);
        group.addStudent(student2);

        group.addTask("Learn encapsulation");
        group.addTask("Complete project");

    }
}