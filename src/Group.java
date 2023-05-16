import java.util.ArrayList;
import java.util.List;

class Group {
    private Student groupLeader;
    private List<Student> students;
    private List<String> tasks;

    public Group(Student groupLeader) {
        this.groupLeader = groupLeader;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(Student student, String newFirstName, String newLastName) {
        student.setFirstName(newFirstName);
        student.setLastName(newLastName);
    }
    public void addTask (String task) {
        tasks.add(task);
    }
}
