import Education.Classroom;
import Education.School;
import Education.Student;

import java.util.Arrays;
import java.util.Random;
import java.lang.reflect.Method;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    private static void printSchoolInformation(School school) {
        String name = school.getSchoolName();
        String principal = school.getPrincipalName();
        int numberOfClassrooms = school.getNumberOfClassrooms();
        System.out.println(name + " is lead by principal " + principal + " and has " + numberOfClassrooms + " classrooms");

        for (int i=0; i<numberOfClassrooms; i++) {
            int numOfStudents = school.getNumberOfStudents(i);
            System.out.println("\tClassroom Index " + i);
            System.out.println("\t\tTeacher Name: \t" + school.getTeacherName(i));
            System.out.println("\t\tRoom Number: \t" + school.getRoomNumber(i));
            System.out.println("\t\tStudent Count:\t" + numOfStudents);

            for (int j=0; j<numOfStudents; j++) {
                String studentName = school.getStudentName(i,j);
                int studentID = school.getStudentID(i,j);
                System.out.println("\t\t\tStudent Index " + j + " - " + studentName + " - " + studentID);
            }
        }
    }

    private static void generateSchool(int seed) {

        Random random = new Random(seed);

        int numberOfClassRooms = random.nextInt(20) + 20;
        School CR = new School();
        String schoolName = NameArrays.lastNames[random.nextInt(NameArrays.lastNames.length)];
        String schoolLevel = NameArrays.schoolLevels[random.nextInt(NameArrays.schoolLevels.length)];
        String fullSchoolName = schoolName + " " + schoolLevel + " School";
        String princFirstName = NameArrays.firstNames[random.nextInt(NameArrays.firstNames.length)];
        String princLastName = NameArrays.lastNames[random.nextInt(NameArrays.lastNames.length)];
        String princName = princFirstName + " " + princLastName;

        CR.setSchoolName(fullSchoolName);
        CR.setPrincipalName(princName);
        CR.setNumberOfClassrooms(numberOfClassRooms);
        for (int i=0; i<numberOfClassRooms; i++) {
            int roomNum = random.nextInt(100) + 100;
            int numOfStudents = random.nextInt(30)+10;
            String firstName = NameArrays.firstNames[random.nextInt(NameArrays.firstNames.length)];
            String lastName = NameArrays.lastNames[random.nextInt(NameArrays.lastNames.length)];
            String teacherName = firstName + " " + lastName;
            CR.initializeClassroom(i,roomNum,teacherName,numOfStudents);
            for (int j=0; j<numOfStudents; j++) {
                int studentID = random.nextInt(5000)+3000;
                String studFirstName = NameArrays.firstNames[random.nextInt(NameArrays.firstNames.length)];
                String studLastName = NameArrays.lastNames[random.nextInt(NameArrays.lastNames.length)];
                String studName = studFirstName + " " + studLastName;
                CR.setStudentInformation(i,j,studentID,studName);
            }
        }
        printSchoolInformation(CR);

    }

    private static void checkMethodsSchool() {
        String[] expectedMethods = {
                "public java.lang.String Education.School.getSchoolName()",
                "public java.lang.String Education.School.getPrincipalName()",
                "public int Education.School.getNumberOfClassrooms()",
                "public int Education.School.getNumberOfStudents(int)",
                "public java.lang.String Education.School.getTeacherName(int)",
                "public int Education.School.getRoomNumber(int)",
                "public java.lang.String Education.School.getStudentName(int,int)",
                "public int Education.School.getStudentID(int,int)",
                "public void Education.School.setSchoolName(java.lang.String)",
                "public void Education.School.setPrincipalName(java.lang.String)",
                "public void Education.School.setNumberOfClassrooms(int)",
                "public void Education.School.initializeClassroom(int,int,java.lang.String,int)",
                "public void Education.School.setStudentInformation(int,int,int,java.lang.String)"
        };
        School test = new School();
        test.setSchoolName("Russell Institute For Higher Learning");
        test.setPrincipalName("Nathan Russell");
        System.out.println("Test Output School " + test.getSchoolName());
        System.out.println("Test Output School " + test.getPrincipalName());
        Class tClass = test.getClass();
        Method[] methods = tClass.getMethods();
        String[] strMethods = new String[methods.length];

        for (int i = 0; i < methods.length; i++) {
            strMethods[i] = methods[i].toString();
        }

        for ( String expectedMethod : expectedMethods) {
            boolean isPresent = Arrays.asList(strMethods).contains(expectedMethod);
            if (!isPresent) {
                System.out.println("************  Unable To Find Required Method In School Class  *********");
                System.out.println("Did not find : " + expectedMethod);
                System.exit(1);
            }
        }
        System.out.println("All required methods for School Class were found.");
    }

    private static void checkMethodClassRoom() {
        String[] expectedMethods = {
            "public int Education.Classroom.getRoomNum()",
            "public int Education.Classroom.getNumberOfStudents()",
            "public java.lang.String Education.Classroom.getTeacherName()",
            "public java.lang.String Education.Classroom.getStudentName(int)",
            "public int Education.Classroom.getStudentID(int)",
            "public void Education.Classroom.setStudentInformation(int,int,java.lang.String)"
        };
        Classroom test = new Classroom(200,"sandy",10);
        System.out.println("Test Output Classroom " + test.getRoomNum());
        System.out.println("Test Output Classroom " + test.getTeacherName());
        System.out.println("Test Output Classroom " + test.getNumberOfStudents());
        Class tClass = test.getClass();
        Method[] methods = tClass.getMethods();
        String[] strMethods = new String[methods.length];

        for (int i = 0; i < methods.length; i++) {
            strMethods[i] = methods[i].toString();
        }

        for ( String expectedMethod : expectedMethods) {
            boolean isPresent = Arrays.asList(strMethods).contains(expectedMethod);
            if (!isPresent) {
                System.out.println("\n\n\n\n************  Unable To Find Required Method In Classroom Class  *********");
                System.out.println("Did not find : " + expectedMethod);
                System.exit(1);
            }
        }
        System.out.println("All required methods for Classroom Class were found.");
    }

    private static void checkMethodStudent() {
        String[] expectedMethods = {
            "public java.lang.String Education.Student.getStudentName()",
            "public int Education.Student.getStudentID()"
        };
        Student test = new Student("Nate",10);
        System.out.println("Test Output Student " + test.getStudentName());
        System.out.println("Test Output Student " + test.getStudentID());
        Class tClass = test.getClass();
        Method[] methods = tClass.getMethods();
        String[] strMethods = new String[methods.length];

        for (int i = 0; i < methods.length; i++) {
            strMethods[i] = methods[i].toString();
        }

        for ( String expectedMethod : expectedMethods) {
            boolean isPresent = Arrays.asList(strMethods).contains(expectedMethod);
            if (!isPresent) {
                System.out.println("\n\n\n\n************  Unable To Find Required Method In Student Class  *********");
                System.out.println("Did not find : " + expectedMethod);
                System.exit(1);
            }

        }
        System.out.println("All required methods for Student Class were found.");
    }

    private static void verifyStudentInitializes() {

        Student test = new Student("Nate",10);
        System.out.println("Test Output Student " + test.getStudentName());
        System.out.println("Test Output Student " + test.getStudentID());
    }

    private static void verifyClassroomInitializes() {

        Classroom test = new Classroom(200,"sandy",10);
        System.out.println("Test Output Classroom " + test.getRoomNum());
        System.out.println("Test Output Classroom " + test.getTeacherName());
        System.out.println("Test Output Classroom " + test.getNumberOfStudents());

    }

    private static void verifySchoolInitializes() {

        School test = new School();
        test.setSchoolName("Russell Institute For Higher Learning");
        test.setPrincipalName("Nathan Russell");
        System.out.println("Test Output School " + test.getSchoolName());
        System.out.println("Test Output School " + test.getPrincipalName());

    }

    public static void main(String[] args) {
        int argument;
        int argument2;
        try {
            argument = Integer.parseInt(args[0]);
        } catch (Exception e) {
            argument = 150;

        }

        try {
            argument2 = Integer.parseInt(args[1]);
        } catch (Exception e) {
            argument2 = 0;
        }

        switch (argument2) {
            case 0:
                generateSchool(argument);
                break;
            case 1:
                checkMethodsSchool();
                break;
            case 2:
                checkMethodClassRoom();
                break;
            case 3:
                checkMethodStudent();
                break;
            case 4:
                verifyStudentInitializes();
                break;
            case 5:
                verifyClassroomInitializes();
                break;
            case 6:
                verifySchoolInitializes();
                break;
            default:
                boolean t = true;
        }

    }
}