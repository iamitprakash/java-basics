
public class CircleAreaCalculator {
    public double CalculateArea(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number!");
        }
        double area = Math.PI * Math.pow(radius, 2);
        return  area;
    }
}