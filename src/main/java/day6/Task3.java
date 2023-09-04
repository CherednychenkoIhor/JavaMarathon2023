package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Ihor");
        Teacher teacher = new Teacher("Lilya", "Java");
        teacher.evaluate(student, 5);
    }
}
