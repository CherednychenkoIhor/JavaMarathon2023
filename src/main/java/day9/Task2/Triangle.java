package day9.Task2;

public class Triangle extends Figure {
    private final double length1;
    private final double length2;
    private final double length3;

    public Triangle(int length1, int length2, int length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double p = (length1 + length2 + length3) / 2;
        return Math.sqrt(p*(p - length1)*(p - length2)*(p - length3));
    }

    @Override
    public double perimeter() {
        return length1 + length2 + length3;
    }
}
