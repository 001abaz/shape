public class Circle extends Shape{

    public Circle(String shapeName) {
        super(shapeName);
    }
    private final double pi = 3.14;
    private double r;
    public double getPi() {
        return pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public Circle(){
    }

    public Circle(String shapeName, double r) {
        super(shapeName);
        this.r = r;
    }

    @Override
    public double calcPerimeter(){
        return 2*pi*r;
    }



    @Override
    public double calcArea(){
        return pi*(r*r);
    }


}
