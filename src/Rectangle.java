public class Rectangle extends Shape{
    private double a;
    private double b;
    public Rectangle(String shapeName, double a, double b ) {
        super(shapeName);
        this.a = a;
        this.b = b;
    }

    public Rectangle(){
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    @Override
    double calcPerimeter() {
        return (a+b)*2;
    }

    @Override
    double calcArea() {
        return a*b;
    }


}
