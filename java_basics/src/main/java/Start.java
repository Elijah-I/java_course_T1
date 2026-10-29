public class Start {
    public static void main() {
        guessGame();
    }

    public static void guessGame() {
        int tries = 1;
        int randomNum = 3;

        System.out.println("What number am I thinking (0 to 9)? :");
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int x = sc.nextInt();

        while (x != randomNum) {
            tries++;
            System.out.println("No, try again");
            x = sc.nextInt();
        }

        System.out.println("Yes, it`s " + randomNum + ", tries: " + tries);
    }

    public static void rightTriangle(int x) {
        String result = "";

        for (int row = 0; row < x; row++) {
            for (int column = 0; column < x; column++) {
                int rowOrder = row + 1;
                result += (column >= x - rowOrder) ? "*\t" : " \t";
            }
            result += "\n";
        }

        IO.println(result);
    }

    public static void leftTriangle(int x) {
        String result = "";

        for (int row = 0; row < x; row++) {
            for (int column = 0; column < row + 1; column++) {
                result += "*\t";
            }
            result += "\n";
        }

        IO.println(result);
    }

    public static void square(int x) {
        String result = "";

        for (int row = 0; row < x; row++) {
            for (int column = 0; column < x; column++) {
                result += "*\t";
            }
            result += "\n";
        }

        IO.println(result);
    }

    public static boolean equalNum(int x) {
        int firstDigit = x % 10;

        while (x != 0) {
            if (firstDigit != x % 10) return false;
            x /= 10;
        }

        return true;
    }

    public static int numLen(long x) {
        int length = 0;

        while (x != 0) {
            length++;
            x /= 10;
        }

        return length;
    }

    public static int pow(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    public static String chet(int x) {
        String result = "";

        for (int i = 0; i <= x; i += 2)
            result += i + "\t";

        return result;
    }

    public static String reverseListNums(int x) {
        String result = "";

        for (int i = x; i >= 0; i--)
            result += i + "\t";

        return result;
    }

    public static String listNums(int x) {
        String result = "";

        for (int i = 0; i <= x; i++)
            result += i + "\t";

        return result;
    }
}
