package Education;

public class Student {
    private String studentName;
    private int studentID;

    public Student(String _studentName, int StudentID){
        this.studentName = _studentName;
        this.studentID = StudentID;
        System.out.println("Student Initialized");
    }

    public String getStudentName(){
        return this.studentName;
    }

    public int getStudentID(){
        return this.studentID;
    }
}
