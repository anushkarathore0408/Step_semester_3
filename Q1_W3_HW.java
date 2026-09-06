import java.util.Scanner;

public class Q1_W3_HW {

    static class BookInventory {
        String title;
        String author;
        int copiesAvailable;

        BookInventory(String title, String author, int copiesAvailable) {
            this.title = title;
            this.author = author;
            this.copiesAvailable = copiesAvailable;
        }

        void printEntry() {
            System.out.println(title + " by " + author + " - "
                    + copiesAvailable + " copies available");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookInventory[] books = new BookInventory[4];

        for (int i = 0; i < 4; i++) {
            String title = sc.nextLine();
            String author = sc.nextLine();
            int copies = sc.nextInt();
            sc.nextLine();

            books[i] = new BookInventory(title, author, copies);
        }

        for (int i = 0; i < 4; i++) {
            books[i].printEntry();
        }
    }
}