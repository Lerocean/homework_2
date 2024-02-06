package numbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + Arrays.toString(numbers));
        swapElements(numbers, 4, 2);
        System.out.println("After swap: " + Arrays.toString(numbers));

    }

    public static void swapElements(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
