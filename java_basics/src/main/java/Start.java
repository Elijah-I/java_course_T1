public class Start {
    public static void main(String[] args) {
        printDays("ПН");
        printDays("СР");
        printDays("QQ");
    }

    public static void printDays(String x) {
        switch (x) {
            case "ПН":
                IO.println("ПН");
            case "ВТ":
                IO.println("ВТ");
            case "СР":
                IO.println("СР");
            case "ЧТ":
                IO.println("ЧТ");
            case "ПТ":
                IO.println("ПТ");
            case "СБ":
                IO.println("СБ");
            case "ВС":
                IO.println("ВС");
                break;
            default:
                IO.println("Это не день недели");
        }
    }

    public static String day(int x) {
        return switch (x) {
            case 1 -> "ПН";
            case 2 -> "ВТ";
            case 3 -> "СР";
            case 4 -> "ЧТ";
            case 5 -> "ПТ";
            case 6 -> "СБ";
            case 7 -> "ВС";
            default -> "Это не день недели";
        };
    }

    public static String age(int x) {
        String postfix = "лет";

        if (x % 10 == 1) postfix = "год";
        if (x % 10 > 1 && x % 10 < 5) postfix = "года";
        if (x % 100 > 10 && x % 100 < 15) postfix = "лет";

        return x + " " + postfix;
    }

    public static boolean magic6(int x, int y) {
        if (x == 6 || y == 6) return true;
        if (x + y == 6) return true;

        return Math.abs(x - y) == 6;
    }

    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) return false;
        return x % 3 == 0 || x % 5 == 0;
    }

    public static int abs(int x) {
        return Math.abs(x);
    }

    public static int safeDiv(int x, int y) {
        return y == 0 ? 0 : x / y;
    }

    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    public static String makeDecision(int x, int y) {
        int dif = x - y;

        if (dif < 0) return x + " < " + y;
        if (dif > 0) return x + " > " + y;

        return x + " == " + y;
    }

    public static int max3(int[] args) {
        int max = -Integer.MAX_VALUE;

        for (int arg : args) {
            if (arg > max) max = arg;
        }

        return max;
    }

    public static boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }

    public static int sum2(int x, int y) {
        int sum = x + y;
        return sum > 9 && sum < 20 ? 20 : sum;
    }

}
