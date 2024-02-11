package week03.math;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean equals(ComplexNumber number) {
        return this.real == number.real && this.imag == number.imag;
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public double re() {
        return real;
    }

    public double imag() {
        return imag;
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imag);
    }

    public ComplexNumber abs() {
        double magnitude = Math.sqrt(real * real + imag * imag);
        return new ComplexNumber(magnitude, 0);
    }

    
    
}
