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

    public void addStudent (Student student) {
        students.add(student);
    }
    public void addTask (String task) {
        tasks.add(task);
    }
}
