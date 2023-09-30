package Education;

public class Student {
    private String studentName;
    private int studentID;

    Student(String _studentName, int StudentID){
        System.out.println("Student Initialized");
        this.studentName = _studentName;
        this.studentID = StudentID;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public int getStudentID(){
        return this.studentID;
    }
}
