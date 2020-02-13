public class Teacher {
    private final String name;
    private String student;


    public Teacher(String name, String student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}
