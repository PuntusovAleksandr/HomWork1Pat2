package AppInterfase;

import java.util.List;

/**
 * Created by Aleksandr on 28.02.2015.
 */
public interface App {

    void  addNewStudent(Student student, SchoolClass schoolClass);
    void  deleteStudentFromClass(Student student, SchoolClass schoolClass);
    List<Student> getAllStudents();
    List<Student> getStudentsFromClass(SchoolClass schoolClass);
    void shedulePerfomance(Performance performance);


}
