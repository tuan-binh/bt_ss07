package Controller;

import Modal.Student;
import Service.StudentService;

public class Controller {
    private StudentService studentService = new StudentService();

    public Student[] getAllStudent() {
        return studentService.showList();
    }

    public boolean createStudent(Student student) {
        return studentService.create(student);
    }

    public Student findById(int id) {
        return studentService.findById(id);
    }

    public void updateStudent(Student student) {
        studentService.update(student);
    }

    public void deleteStudent(int id) {
        studentService.delete(id);
    }

    public int getSize() {
        return studentService.getSize();
    }
}
