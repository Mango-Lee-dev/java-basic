package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student = new Student();

        student.age = 10;
        student.name = "Lee";
        student.grade = 1;

        System.out.println(student.name + " " + student.age + " " + student.grade);
        System.out.println(student);
    }
}
