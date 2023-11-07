public class Triangle extends Shape{

    private double a;
    private double b;
    private  double c;
    private double h;

    public Triangle(String shapeName, double a, double b, double c, double h){
        super(shapeName);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public Triangle(){
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    double calcPerimeter() {
        return a+b+c;
    }

    @Override
    double calcArea() {
        return 0.5 * a * h;
    }
}
