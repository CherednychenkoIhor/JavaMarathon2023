package day14;

public class Person {
    private String name;
    private int year;

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
