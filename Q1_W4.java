public class Q1_W4 {

    static class LibraryBook {

        String title;
        String isbn;

        LibraryBook(String title, String isbn) {
            this.title = title;
            this.isbn = isbn;
        }

        LibraryBook(String title) {
            this(title, "PENDING");
        }

        void printEntry() {
            boolean catalogued = !isbn.equals("PENDING");

            System.out.println(title + " | " + isbn
                    + " | Catalogued: " + catalogued);
        }
    }

    public static void main(String[] args) {

        String[] titles = {
            "Clean Code",
            "Untitled Draft",
            "1984",
            "Notes"
        };

        String[] isbns = {
            "978-0132350884",
            "",
            "9780451524935",
            "978-0123456784"
        };

        LibraryBook[] books = new LibraryBook[4];

        if (isbns[0].equals("")) {
            books[0] = new LibraryBook(titles[0]);
        } else {
            books[0] = new LibraryBook(titles[0], isbns[0]);
        }

        if (isbns[1].equals("")) {
            books[1] = new LibraryBook(titles[1]);
        } else {
            books[1] = new LibraryBook(titles[1], isbns[1]);
        }

        if (isbns[2].equals("")) {
            books[2] = new LibraryBook(titles[2]);
        } else {
            books[2] = new LibraryBook(titles[2], isbns[2]);
        }

        if (isbns[3].equals("")) {
            books[3] = new LibraryBook(titles[3]);
        } else {
            books[3] = new LibraryBook(titles[3], isbns[3]);
        }

        for (int i = 0; i < books.length; i++) {
            books[i].printEntry();
        }
    }
}