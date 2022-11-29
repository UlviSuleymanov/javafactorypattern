public class Demo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape shape1 = sf.getShape("Circle");
        shape1.draw();
        Shape shape2 = sf.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = sf.getShape("Square");
        shape3.draw();
    }
}
