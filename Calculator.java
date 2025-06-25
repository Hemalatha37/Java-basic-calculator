public class Calculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) return 0;
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Add: " + add(num1, num2));
        System.out.println("Subtract: " + subtract(num1, num2));
        System.out.println("Multiply: " + multiply(num1, num2));
        System.out.println("Divide: " + divide(num1, num2));
    }
}
