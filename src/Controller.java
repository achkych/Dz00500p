import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void getAllStudents() {
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }

    public void filterStudentsBySurname(String surname) {
        List<User> filteredStudents = service.filterStudentsBySurname(surname);
        for (User user : filteredStudents) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }
}
