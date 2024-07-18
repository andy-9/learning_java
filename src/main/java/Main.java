import accounts.Account;
import accounts.CheckingAccount;
import accounts.DiamondCheckingAccount;
import accounts.GoldCheckingAccount;
import accounts.SavingsAccount;
import accounts.SilverCheckingAccount;

public class Main {

    public static void main(String[] args) {
        //SilverCheckingAccount silver = new SilverCheckingAccount(5000, 0.025, 1000);
        //GoldCheckingAccount gold = new GoldCheckingAccount(5000, 0.025, 1000);
        //DiamondCheckingAccount diamond = new DiamondCheckingAccount(5000, 0.025, 1000);
        //
        //System.out.println(silver.getRewardPoints());
        //System.out.println(gold.getRewardPoints());
        //System.out.println(diamond.getRewardPoints());
        //
        //silver.purchase(500);
        //gold.purchase(500);
        //diamond.purchase(500);
        //
        //System.out.println(silver.getRewardPoints());
        //System.out.println(gold.getRewardPoints());
        //System.out.println(diamond.getRewardPoints());

        displayShape(new Square());
        displayShape(new Circle());
        displayShape(new Triangle());
    }

    static void displayShape(Shape shape) {
        System.out.println(shape.getName());
        shape.draw();
        System.out.println("Sides: " + shape.getSideCount());
        if (shape instanceof Square) {
            Square square = (Square) shape;
            System.out.println("Shape type: " + square.getShapeType());
        }
        System.out.println("");
    }
}
