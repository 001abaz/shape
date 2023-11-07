public abstract class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    public Shape(){

    }


    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    abstract double calcPerimeter();

    abstract double calcArea();


}
