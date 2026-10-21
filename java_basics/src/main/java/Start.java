public class Start {
    public static void main(String[] args) {
        int a = lastNumSum(lastNumSum(lastNumSum(lastNumSum(5, 11), 123), 14), 1);
        System.out.println(a);
    }

    public static double fraction(double x) {
        return x - (int) x;
    }

    public static int sumLastNums(int x) {
        return x % 100 / 10 + x % 10;
    }

    public static int charToNum(char x) {
        return x - 48;
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean is2Digits(int x) {
        return x > 9 && x < 100;
    }

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static boolean isInRange(int a, int b, int num) {
        return a <= num && num <= b;
    }

    public static boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public static boolean isEqual(int a, int b, int c) {
        return a == b && a == c;
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}
