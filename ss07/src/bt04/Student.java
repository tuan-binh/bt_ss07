package bt04;

public class Student {
    private String name;
    private String classes;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "[ Name: " + name + " | Classes: " + classes + " ]";
    }
}
