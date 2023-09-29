# exam-prog-modules-java-3
Exam covering classes, primitive &amp; non-primitive types, and packages

# Persona Statement
As a Superintendent of a large school district, I need a program that will help me organize schools, classrooms, and students.  I need to assign students and teachers to classrooms that are part of specific schools.  
# Acceptance Criteria
Below are the requirements to earn a perfect score on this assignment.
* The Main class should not be edited in any fashion.  Making a small change will cause the checksum hash to fail. A failure in the Main class function will result in a zero score for the assignment.
* Do not touch the NameArrays class file.  It contains information to generate random names.
* Create a Java package called Education. This package should be located in the src directory.
* The package should contain the following three classes:
  * School - Below are the details for the School class.
    * The School class should contain the following private variables (with types):
      * String schoolName - This is the name of the school building.
      * String principalName - This is the name of the school principal.
      * Classroom[] classRoomArray - This is an array of classes having type Classroom.
    * This class should contain the following constructors:
      * A default constructor that does not accept input parameters.  The body of the constructor should print the statement _School Initialized_ using the println method.
    * This class should contain the  public methods listed below that require the class to be initialized.  These methods do not return any information.
      * _setSchoolName(String schoolName)_ : Sets the schoolName class variable.
      * _setPrincipalName(String principalName)_ : Sets the principalName class variable.
      * _setNumberOfClassrooms(int numClassrooms)_ : Allocates an array of classes having type Classroom.  This should not initialize the individual classes. It will only allocate the array _classRoomArray_.
      * _initializeClassroom(int classRoomIndex, int roomNum, String teacherName, int numOfStudents)_ : This should initialize the Classroom class indexed by _classRoomIndex_ by calling the constructor of the Classroom that accepts the teachers name, room number, and number of students.
      * _setStudentInformation(int classRoomIndex, int studentIndex, int studentID, String studentName)_ : This will set the studentId and the studentName for the student indexed by _studentIndex_ in the classroom indexed by _classRoomIndex_. 
    * This class should contain the public methods listed below that DO return information.
      * _getNumberOfClassrooms()_ : Returns an integer representing the number of Classrooms allocated for this school.
      * _getPrincipalName()_ : Returns a string containing the name of the principal.
      * _getTeacherName(int classRoomIndex)_ : Returns the teachers name for the classroom indexed by the _classRoomIndex_ value.
      * _getStudentName(int classRoomIndex, int studentIndex)_ : Returns a string representing the name of the student in Classroom indexed by _classRoomIndex_ and the student in that Classroom indexed by _studentIndex_.
      * _getStudentID(int classRoomIndex, int studentIndex)_ : Returns an integer representing the ID of the student in Classroom indexed by _classRoomIndex_ and the student in that Classroom indexed by _studentIndex_.
      * _getNumberOfStudents(int classRoomIndex)_ : Returns the number of students in the Classroom indexed by _classRoomIndex_.
      * _getSchoolName()_ Returns the name of the school as a string.
      * _getRoomNumber(int classRoomIndex)_ : Returns the integer representing the room number for the classroom indexed by _classRoomIndex_ in _classRoomArray_.
  * Classroom - Below are the details for the Classroom class.
    * The Classroom class should contain the following private variables (with types):
      * String teacherName - This is the name of the teacher for this classroom.
      * int roomNum - This is the classroom room number.
      * Student[] roster - This is a roster (array) for all the students in this classroom.
    * The Classroom class should contain the following constructor:
      * A constructor that accepts 3 parameters (int roomNum, String teacherName, int numOfStudents). 
        * The body of the constructor should print the statement _Classroom Initialized_ using the _println_ method.
        * The body of the constructor should allocate an array (class variable _roster_) of classes having type Student. The classes allocated in the array should not be initialized only the array _roster_ should be allocated.
    * The Classroom class should contain the following public methods that require the class to be initialized but do not return anything:
      * _setStudentInformation(int studentIndex, int studentID, string studentName)_ : This will call the constructor for the Student in the _roster_ array indexed by _studentIndex_.
    * The Classroom class should contain the following public methods that require the class to be initialized and return information:
      * _getNumberOfStudents()_ : Returns an integer representing the number of students in the classroom.
      * _getTeacherName()_ : Returns a string representing the teacher's name.
      * _getStudentName(int studentIndex)_ : Returns a string representing the  name for the student indexed by _studentIndex_ in the _roster_ array.
      * _getStudentID(int studentIndex)_ : Returns an integer representing the ID for the student indexed by _studentIndex_ in the _roster_ array.
      * _getRoomNumber()_ : Returns an integer representing the room number for the classroom.

  * Student - Below are the details for the Student Class.
    * The Student class should contain the following private class variables:
      * String studentName
      * int studentID
    * The Student class should have the following constructor:
      * The constructor should accept two parameters (String _studentName, int StudentID) to set the class variables.
      * The body of the constructor should print the statement _Student Initialized_ using the _println_ method.
    * The Student class should have the following public methods that require the class to be initialized:
      * _getStudentName()_ : Returns a string representing the student's name.
      * _getStudentID()_ : Returns an integer representing the student's ID.

The School, Classroom, and Student classes must be in the package Eduction.  The classes may not contain any extra methods or variables other than the ones listed above.  The classes should all be public classes.

# Hints
Here are some hints:sha
* Construct the Student class first.
* Construct the Classroom class second.  The public methods returning student information in the Classroom class should call the public methods in the Student class.
* Construct the School class last.  The public methods returning information about Classroom and students should call the public methods in the Classroom class.
* The Main driver class will ONLY call methods in the School Class.

# Sample Output
You can configure Intellij to run command line arguments.  Passing a single integer command line arguement seeds the random number generated the Main class uses to check your class behavior.

By default, the seed it 150.  If you look in the _output_samples_ directory you will find the results of various seeds.  The output of your program (generated by your classes) should match file test-150.txt (if you just run Intellij).

# GitHub WebHook Tests
Several GitHub webhooks have been created to help grade your submission.  Every push to your repository will trigger a new webhook grading instance.  Altering the Main class will be detected and will result in a zero grade regardless of whether the rest of the tests pass.
Passing all the webhook tests is a good sign your submission will earn a good grade.  However, poor coding practices, shortcuts, and academic dishonesty may cause you grade to decline.

You must name the Classes and class methods exactly as they are specified in the ACs above.  The input parameters for each method must match exactly as specified in the ACs above.

# Collaboration
I encourage collaboration.  Passing hints on Slack is acceptable but exact details and code samples are forms of academic dishonest and will result in a failing grade for the person providing the information.  