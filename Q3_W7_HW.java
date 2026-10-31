
public class Q3_W7_HW {

    static abstract class GardenTool {

        GardenTool() {
        }

        abstract String use();

        String baseUse() {
            return "Using garden tool";
        }
    }

    static class CuttingTool extends GardenTool {

        CuttingTool() {
            super();
        }

        String use() {
            return super.baseUse() + ", blade sharpened first";
        }
    }

    static class Pruner extends CuttingTool {

        Pruner() {
            super();
        }

        String use() {
            return super.use() + ", then trimming branches precisely";
        }
    }

    public static void main(String[] args) {
        Pruner pruner = new Pruner();

        System.out.println(pruner.use());
    }
}