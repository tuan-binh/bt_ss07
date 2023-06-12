package Service;

import Modal.Student;

public class StudentService {

    private Student[] listStudent = new Student[100];

    private int size = 0;

    public Student[] showList() {
        return listStudent;
    }

//    Thêm sinh viên vào danh sách
    public boolean create(Student student) {
        if(size == 100) {
            System.err.println("Đã đủ sinh viên");
            return false;
        }
        for (int i = 0; i < listStudent.length; i++) {
            if(listStudent[i] == null) {
                listStudent[i] = student;
                size++;
                break;
            }
        }
        return true;
    }

//    findById
    public Student findById(int id) {
        for (Student s:listStudent) {
//            if(s == null) {
//                continue;
//            }
            if(s != null && s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }


//    Sửa thông tin sinh viên
    public void update(Student student) {
        for (int i = 0; i < listStudent.length; i++) {
            if(listStudent[i].getStudentId() == student.getStudentId()) {
                listStudent[i] = student;
                break;
            }
        }
    }
//    Xóa thông tin sinh viên
    public void delete(int id) {
        for (int i = 0; i < listStudent.length; i++) {
            if(listStudent[i].getStudentId() == id) {
                listStudent[i] = null;
                size--;
                break;
            }
        }
    }

//    Check size
    public int getSize() {
        return size;
    }
}
