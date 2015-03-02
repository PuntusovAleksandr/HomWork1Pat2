package Implementation;

import AppInterfase.App;
import AppInterfase.Performance;
import AppInterfase.SchoolClass;
import AppInterfase.Student;

import java.util.List;


/**
 * Created by Aleksandr on 02.03.2015.
 */
public class ImplementationWeb implements App{

    @Override
    public void addNewStudent(Student student, SchoolClass schoolClass) {
        
    }

    @Override
    public void deleteStudentFromClass(Student student, SchoolClass schoolClass) {

    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public List<Student> getStudentsFromClass(SchoolClass schoolClass) {
        return null;
    }

    @Override
    public void shedulePerfomance(Performance performance) {

    }
}
