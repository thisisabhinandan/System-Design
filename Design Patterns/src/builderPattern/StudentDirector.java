package builderPattern;
import studentClass.Student;
import java.util.Arrays;

public class StudentDirector {
    private final Builder builder;

    public StudentDirector(Builder builder) {
        this.builder = builder;
    }
    public Student buildMechStudent()
    {
        return builder.setID(1L).setName("Abhi").setDept("Mech").setSubjects(Arrays.asList("Thermo","Mechanics")).build();
    }
}
