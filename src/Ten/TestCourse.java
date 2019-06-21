package Ten;

public class TestCourse {
    public static void main(String[] args){
        //创建了两个课程对象
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        //这里讲getStudents方法将该课程里的所有课程给字符串数组，students
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i = 0; i< course1.getNumberOfStudents();i++){
            System.out.print(students[i] + ", ");
        }
        System.out.println();
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
    }
}
