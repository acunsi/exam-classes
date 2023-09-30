package Education;

public class Classroom {
    private String teacherName;
    private int roomNum;
    private Student[] roster;

    public Classroom(int roomNum, String teacherName, int numOfStudents){
        this.roster = new Student[numOfStudents];
        this.teacherName = teacherName;
        this.roomNum = roomNum;
        System.out.println("Classroom Initialized");
    }

    public void setStudentInformation(int studentIndex, int studentID, String studentName){
        this.roster[studentIndex] = new Student(studentName,studentID);
    }

    public int getNumberOfStudents(){
        return this.roster.length;
    }

    public String getTeacherName(){
        return this.teacherName;
    }

    public String getStudentName(int studentIndex){
        return this.roster[studentIndex].getStudentName();
    }

    public int getStudentID(int studentIndex){
        return this.roster[studentIndex].getStudentID();
    }

    public int getRoomNum(){
        return this.roomNum;
    }
}
