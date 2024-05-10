public class ComplexNumber {
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    private double real;
    private double imaginary;

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber(double real) {
        this(real, 0);
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
}