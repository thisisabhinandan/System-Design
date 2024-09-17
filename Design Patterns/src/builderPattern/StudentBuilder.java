package builderPattern;
import studentClass.Student;

import java.util.List;

public class StudentBuilder implements Builder{
    private Long id;
    private String name;
    private String dept;
    private List<String> subjects;

    @Override
    public Builder setName(String name)
    {
        this.name=name;
        return this;
    }

    @Override
    public Builder setID(Long id)
    {
        this.id=id;
        return this;
    }

    @Override
    public Builder setDept(String dept) {
        this.dept = dept;
        return this;
    }

    @Override
    public Builder setSubjects(List<String> subjects)
    {
        this.subjects=subjects;
        return this;
    }

    @Override
    public Student build()
    {
        return new Student(id,name,dept,subjects);
    }

}
