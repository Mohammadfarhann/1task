public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2); // Recursive calculation is incorrect
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n); // This will produce incorrect results for n > 1
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}
//Explanation of errors:

//The recursive calculation in the fibonacci method is incorrect. It calculates the Fibonacci sequence using two recursive calls, but it should only have one recursive call. This error leads to incorrect results for n > 1.
//To fix this, you can modify the fibonacci method like this:
public static int fibonacci(int n) {
    if (n <= 1)
        return n;
    else
        return fibonacci(n-1) + fibonacci(n-2);
}
