package coding_challenges;

public class IfElseStatements {
    /**
    Write a program with two int variables, int x and int y, and give each
    one a value. Depending on their values, print “x is bigger than y”,
    “x is smaller than y”, or “x and y are the same”.
    Change the values and run the program a few times to check it works.*/

    public static void main(String[] args) {
        
        compareInts(3, 8);
        compareInts(9, 2);
        compareInts(7, 7);

    }

    private static void compareInts(int x, int y) {

        int absoluteValue = Math.abs(x-y);

        if (x > y) {
            System.out.println("x is bigger than y");
            System.out.println("The difference between x and y is: " + absoluteValue);
        } else if (x < y) {
            System.out.println("x is smaller than y");
            System.out.println("The difference between x and y is: " + absoluteValue);
        } else {
            System.out.println("x and y are the same");
        }
    }

}
