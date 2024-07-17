public class Triangle implements Shape {
    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public int getSideCount() {
        return 3;
    }

    @Override
    public void draw() {
        System.out.println("    -    ");
        System.out.println("   / \\ ");
        System.out.println("  /   \\");
        System.out.println(" /     \\");
        System.out.println("/-------\\");
    }
}
