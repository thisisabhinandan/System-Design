package builderPattern;
import studentClass.Student;
public class BuilderMain {

    public BuilderMain()
    {
        StudentBuilder studentBuilder=new StudentBuilder();
        StudentDirector studentDirector=new StudentDirector(studentBuilder);
        Student mechStudent=studentDirector.buildMechStudent();
        System.out.println(mechStudent);
    }

}
