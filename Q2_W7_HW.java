
public class Q2_W7_HW {

    static abstract class ArtPiece {
        private static int counter = 1000;
        final String pieceId;

        ArtPiece() {
            counter++;
            pieceId = "ART-" + counter;
        }

        abstract String describe();

        String getPieceId() {
            return pieceId;
        }
    }

    static class Painting extends ArtPiece {
        String title;

        Painting(String title) {
            this.title = title;
        }

        String describe() {
            return "Painting: " + title;
        }
    }

    static class Sculpture extends ArtPiece {
        String title;

        Sculpture(String title) {
            this.title = title;
        }

        String describe() {
            return "Sculpture: " + title;
        }
    }

    public static void main(String[] args) {
        Painting p = new Painting("Beautiful Nature");
        Sculpture s = new Sculpture("The Thinker");

        System.out.println(p.describe());
        System.out.println("Piece ID: " + p.getPieceId());

        System.out.println(s.describe());
        System.out.println("Piece ID: " + s.getPieceId());
    }
}