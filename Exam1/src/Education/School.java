package Education;

public class School {
    private String schoolName;
    private String principalName;
    private Classroom[] classRoomArray;

    School(){
        System.out.println("School Initialized");
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public void setPrincipalName(String principalName){
        this.principalName = principalName;
    }

    public void setNumberOfClassrooms(int numClassrooms){
        this.classRoomArray = new Classroom[numClassrooms];
    }

    public void initializeClassroom(int classRoomIndex, int roomNum, String teacherName, int numOfStudents){
        this.classRoomArray[classRoomIndex] = new Classroom(roomNum, teacherName, numOfStudents);
    }

    public void setStudentInformation(int classRoomIndex, int studentIndex, int studentID, String studentName){
        this.classRoomArray[classRoomIndex].setStudentInformation(studentIndex, studentID, studentName);
    }

    public int getNumberOfClassrooms(){
        return this.classRoomArray.length;
    }

    public String getPrincipalName(){
        return this.principalName;
    }

    public String getTeacherName(int classRoomIndex){
        return this.classRoomArray[classRoomIndex].getTeacherName();
    }

    public String getStudentName(int classRoomIndex, int studentIndex){
        return this.classRoomArray[classRoomIndex].getStudentName(studentIndex);
    }

    public int getStudentID(int classRoomIndex,int studentIndex){
        return this.classRoomArray[classRoomIndex].getStudentID(studentIndex);
    }

    public int getNumberOfStudents(int classRoomIndex){
        return this.classRoomArray[classRoomIndex].getNumberOfStudents();
    }

    public String getSchoolName(){
        return this.schoolName;
    }

    public int getRoomNumber(int classRoomIndex){
        return this.classRoomArray[classRoomIndex].getRoomNumber();
    }


}
