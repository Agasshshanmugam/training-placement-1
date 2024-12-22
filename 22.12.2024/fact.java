public class Factorial {
    public static void main(String[] args) {
        int number = 5, result = 1;
        System.out.println("Factorial of " + number + " is:");

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
