public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Circle circle = new Circle();
        Triangle trian = new Triangle();
        circle.setShapeName("Circle");
        circle.setR(2);
        rec.setShapeName("Rectangle");
        rec.setA(2);
        rec.setB(2);
        trian.setShapeName("Triangle");
        trian.setA(2);
        trian.setB(2);
        trian.setC(2);
        trian.setH(4);

        System.out.println(circle.getShapeName() + " Perimeter - " +circle.calcPerimeter());
        System.out.println(circle.getShapeName() + " Area - " + circle.calcArea());

        System.out.println(rec.getShapeName() + " Perimeter - " +rec.calcPerimeter());
        System.out.println(rec.getShapeName() + " Area - " + rec.calcArea());

        System.out.println(trian.getShapeName() + " Perimeter - " +trian.calcPerimeter());
        System.out.println(trian.getShapeName() + " Area - " + trian.calcArea());




    }
}