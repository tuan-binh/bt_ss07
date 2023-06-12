package Modal;

public class Student {
    private int studentId;
    private String studentName;
    private double MathPoint;
    private double PhysicalPoint;
    private double ChemistryPoint;

    public Student() {
    }

    public Student(int studentId, String studentName, double mathPoint, double physicalPoint, double chemistryPoint) {
        this.studentId = studentId;
        this.studentName = studentName;
        MathPoint = mathPoint;
        PhysicalPoint = physicalPoint;
        ChemistryPoint = chemistryPoint;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMathPoint() {
        return MathPoint;
    }

    public void setMathPoint(double mathPoint) {
        MathPoint = mathPoint;
    }

    public double getPhysicalPoint() {
        return PhysicalPoint;
    }

    public void setPhysicalPoint(double physicalPoint) {
        PhysicalPoint = physicalPoint;
    }

    public double getChemistryPoint() {
        return ChemistryPoint;
    }

    public void setChemistryPoint(double chemistryPoint) {
        ChemistryPoint = chemistryPoint;
    }

    @Override
    public String toString() {
        return "[ ID: " + studentId + " | Name: " + studentName + " | Toán: " + MathPoint + " | Lý: " + PhysicalPoint + " | Hóa: " + ChemistryPoint + " ]";
    }
}
