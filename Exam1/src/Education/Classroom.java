package Education;

public class Classroom {
    private String teacherName;
    private int roomNum;
    private Student[] roster;

    Classroom(int roomNum, String teacherName, int numOfStudents){
        System.out.println("Classroom Initialized");
        this.roster = new Student[numOfStudents];
        this.teacherName = teacherName;
        this.roomNum = roomNum;
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

    public int getRoomNumber(){
        return this.roomNum;
    }
}
