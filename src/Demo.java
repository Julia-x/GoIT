public class Demo {
    public static void main(String[] args) {
        ShapePrinted shapePrinted = new ShapePrinted();
        shapePrinted.printName(new Circle());
        shapePrinted.printName(new Triangle());
        shapePrinted.printName(new Square());
        shapePrinted.printName(new Rectangle());
        shapePrinted.printName(new Quad());
    }
}
