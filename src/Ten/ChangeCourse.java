package Ten;

public class ChangeCourse {

    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public static final int DEFAULT_NUMBER = 5;

    public ChangeCourse(String courseName){
        this.courseName = courseName;
        students = new String[DEFAULT_NUMBER];
    }

    public void addStudent(String student){
        if(numberOfStudents > student.length()){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students,0,temp,0,students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void clear(){
        this.numberOfStudents = 0;
    }

    public String peek(){
        return students[numberOfStudents - 1];
    }

    public String dropStudent(){
        return students[--numberOfStudents];
    }
}
