package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ihor", "KIYKI-20-1");
        System.out.println(student.getNameStudyGroup());

        Teacher teacher = new Teacher("Lilya", "Java");
        System.out.println(teacher.getNameSubject());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}
