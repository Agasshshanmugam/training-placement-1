public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, c;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(a + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(b + " ");
                continue;
            }
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
