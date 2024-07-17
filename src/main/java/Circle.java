public class Circle implements Shape {
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public int getSideCount() {
        return 1;
    }

    @Override
    public void draw() {
        System.out.println("   . ````.");
        System.out.println(" /          \\");
        System.out.println("|            |");
        System.out.println(" \\          /");
        System.out.println("   ' ___  '");
    }
}
