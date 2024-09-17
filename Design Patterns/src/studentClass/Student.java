package studentClass;

import java.util.List;
public class Student {
    private Long id;
    private String name;
    private String dept;
    private List<String> subjects;

    public Student(Long id, String name, String dept, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "studentClass.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
