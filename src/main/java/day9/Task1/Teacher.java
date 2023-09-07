package day9.Task1;

public class Teacher extends Human {
    private String nameSubject;

    public Teacher(String name, String nameSubject) {
        super(name);
        this.nameSubject = nameSubject;
    }

    public String getSubjectName() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
