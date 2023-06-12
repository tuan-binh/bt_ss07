import Config.ConfigScanner;
import Controller.Controller;
import Modal.Student;

public class Main {

    static Controller controller = new Controller();

    public static void main(String[] args) {
        int choose;
        while (true) {
            System.out.println("======================== MENU ========================");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm thông tin sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa thông tin sinh viên");
            System.out.println("5. Thoát");
            System.out.println("======================================================");
            System.out.print("Mời bạn lựa chọn: ");
            choose = ConfigScanner.scanner().nextInt();
            switch (choose) {
                case 1:
//                    hiển thị danh sách sinh viên
                    showAllStudent();
                    break;
                case 2:
//                    Thêm thông tin sinh viên
                    addNewStudent();
                    break;
                case 3:
//                    Sửa thông tin sinh viên
                    updateStudent();
                    break;
                case 4:
//                    Xóa thông tin sinh viên
                    deleteStudent();
                    break;
                case 5:
//                    Thoát chương trình
                    System.out.println("~~ Cảm ơn bạn đã sử dụng chương trình ~~");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Mời bạn lựa chọn lại từ 1 -> 5");
            }
        }
    }

    //    Phương thức trong hàm main
    public static void showAllStudent() {
        if (controller.getSize() == 0) {
            System.err.println("Danh sách sinh viên đang trống");
            return;
        }
        Student[] list = controller.getAllStudent();
        for (Student s : list) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public static void addNewStudent() {
        Student newStudent = new Student();
        newStudent.setStudentId(getNewId());
        System.out.print("Nhập vào tên sinh viên: ");
        newStudent.setStudentName(ConfigScanner.scanner().nextLine());
        System.out.print("Nhập vào điểm Toán: ");
        newStudent.setMathPoint(ConfigScanner.scanner().nextDouble());
        System.out.print("Nhập vào điểm Lý: ");
        newStudent.setPhysicalPoint(ConfigScanner.scanner().nextDouble());
        System.out.print("Nhập vào điểm Hóa: ");
        newStudent.setChemistryPoint(ConfigScanner.scanner().nextDouble());
        boolean checkStudent = controller.createStudent(newStudent);
        if (checkStudent) {
            System.out.println("Thêm sinh viên thành công");
        }
    }

    public static void updateStudent() {
        System.out.println("Bạn muốn sửa id sinh viên nào: ");
        int id = ConfigScanner.scanner().nextInt();
        Student student = controller.findById(id);
        if (student == null) {
            System.err.println("Không có sinh viên này :((");
            return;
        }
        System.out.println("Thông tin sinh sinh viên muốn xóa ==>" + student);
        System.out.print("Nhập vào tên sinh viên: ");
        student.setStudentName(ConfigScanner.scanner().nextLine());
        System.out.print("Nhập vào điểm Toán: ");
        student.setMathPoint(ConfigScanner.scanner().nextDouble());
        System.out.print("Nhập vào điểm Lý: ");
        student.setPhysicalPoint(ConfigScanner.scanner().nextDouble());
        System.out.print("Nhập vào điểm Hóa: ");
        student.setChemistryPoint(ConfigScanner.scanner().nextDouble());
        controller.updateStudent(student);
    }

    public static void deleteStudent() {
        System.out.println("Bạn muốn xóa id sinh viên nào: ");
        int id = ConfigScanner.scanner().nextInt();
        Student check = controller.findById(id);
        if (check == null) {
            System.err.println("Không có sinh viên bạn đã chọn :((");
            return;
        }
        System.out.println("Thông tin sinh viên muốn xóa ==> " + check);
        controller.deleteStudent(id);
    }

    public static int getNewId() {
        Student[] list = controller.getAllStudent();
        int idMax = 0;
        for (Student s : list) {
            if (s == null) {
                continue;
            }
            if (idMax < s.getStudentId()) {
                idMax = s.getStudentId();
            }
        }
        return idMax + 1;
    }
}
