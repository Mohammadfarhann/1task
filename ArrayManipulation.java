public class ArrayManipulation {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {  // Fix: Change i <= numbers.length to i < numbers.length
            System.out.println(numbers[i]);
        }
    }
}
//Explanation of errors:

//The loop condition in the original code is i <= numbers.length, which will cause an ArrayIndexOutOfBoundsException because array indices in Java start from 0, so the valid range is 0 to numbers.length - 1. To fix this, change the condition to i < numbers.length.