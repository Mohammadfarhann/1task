public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[10]); // This line will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        
        int result = divide(10, 0); // This line will throw an ArithmeticException
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        return a / b; // This line will throw an ArithmeticException when dividing by zero
    }
}
//Explanation of errors:

//In the main method, there are two potential exceptions that can be thrown. First, the attempt to access numbers[10] will throw an ArrayIndexOutOfBoundsException because the index is out of bounds. Second, the divide method attempts to divide by zero, which will throw an ArithmeticException.
//To fix these errors, you should handle the ArithmeticException separately and provide proper error messages:
public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
