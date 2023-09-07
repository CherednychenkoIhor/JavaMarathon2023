package day9.Task1;

public class Student extends Human {
    private String nameStudyGroup;

    public Student(String name, String nameStudyGroup) {
        super(name);
        this.nameStudyGroup = nameStudyGroup;
    }

    public String getGroupName() {
        return nameStudyGroup;
    }

    public void setNameStudyGroup(String nameStudyGroup) {
        this.nameStudyGroup = nameStudyGroup;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
