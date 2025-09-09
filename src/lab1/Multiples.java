package lab1;

public class Multiples {
    public static void main(String[] args) {

        System.out.println(multiples());
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;

        while (i < n) {
            if (i % a == 0 || i % b == 0) {
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
    }
}
