package java_for_absolute_beginners.sec3_hello_world;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("SHOPPINGLIST");
        System.out.println("\t- Milk");
        System.out.println("\t\t> Semi-skimmed");
        System.out.println("\t\t> Medium");
        System.out.println("\t- Eggs");
        System.out.println("\t\t> Free-range");
        System.out.println("\t- Bread");

        singleLine();

        cakeLie();
    }

    public static void singleLine() {
        System.out.println("SHOPPINGLIST\n\t- Milk\n\t\t> Semi-skimmed\n\t\t> Medium\n\t- Eggs\n\t\t> Free-range\n\t- Bread");
    }

    public static void cakeLie() {
        System.out.println("The");
        System.out.println("\tCake");
        System.out.print("Is");
        System.out.println("\t\t\tA");
        System.out.println("\tLie.");
    }

}
