package lab1;

public class Multiples {
    public static void main(String[] args) {

        int count = multiples();
        System.out.println(count);
    }

    public static int multiples() {
        int i = 1;
        int count = 0;

        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
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
