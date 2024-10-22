public class MyComplex {
    private double real;
    private double imag;

    // Constructors
    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters and Setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // Set Value
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // toString
    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    // Check if it's a real number
    public boolean isReal() {
        return imag == 0;
    }

    // Check if it's an imaginary number
    public boolean isImaginary() {
        return real == 0;
    }

    // Equals methods
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    // Magnitude of the complex number
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Add to this instance
    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    // Add and return new instance
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    // Subtract from this instance
    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    // Subtract and return new instance
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    // Multiply with another complex number
    public MyComplex multiply(MyComplex right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    // Divide by another complex number
    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / denominator;
        double newImag = (this.imag * right.real - this.real * right.imag) / denominator;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    // Conjugate of this complex number
    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }

    // Argument of the complex number (in radians)
    public double argument() {
        return Math.atan2(this.imag, this.real);
    }
}
