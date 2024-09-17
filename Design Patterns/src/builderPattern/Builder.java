package builderPattern;
import java.util.List;
import studentClass.Student;

public interface Builder {
    Builder setName(String name);

    Builder setID(Long id);

    Builder setDept(String dept);

    Builder setSubjects(List<String> subjects);

    Student build();
}
