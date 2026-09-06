import java.util.Scanner;

public class Q4_W3 {

    static class IDCard {
        String name;
        int bookId;

        IDCard(String name, int bookId) {
            this.name = name;
            this.bookId = bookId;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IDCard ravi = new IDCard("Ravi", 101);

        IDCard secondVariable = ravi;

        secondVariable.bookId = 202;

        System.out.println("ravi's bookId: " + ravi.bookId);
        System.out.println("secondVariable == ravi? " + (secondVariable == ravi));

        IDCard separate = new IDCard("Ravi", 202);

        System.out.println("separate == ravi? " + (separate == ravi));
    }
}