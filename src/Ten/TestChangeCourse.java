package Ten;

/*
现在存在的问题，
 */
public class TestChangeCourse {
    public static void main(String[] args){

        //创建一个学生数组对象
        ChangeCourse student = new ChangeCourse("历史");

        student.addStudent("池智鹏");
        student.addStudent("张语格");
        student.addStudent("冯晓菲");
        student.addStudent("苏叶");
        for(int i = 0;i<student.getNumberOfStudents();i++){
            System.out.printf("%s ",student.getStudents()[i]);
        }
        System.out.println();
        //删除学生方法
        System.out.println(student.dropStudent());
        for(int i = 0;i<student.getNumberOfStudents();i++){
            System.out.printf("%s ",student.getStudents()[i]);
        }
        System.out.println();
        //清除方法生效没有生效
        student.clear();
        for(int i = 0;i<student.getNumberOfStudents();i++){
            System.out.printf("%s ",student.getStudents()[i]);
        }
        System.out.println();
        System.out.println("1");
    }
}
