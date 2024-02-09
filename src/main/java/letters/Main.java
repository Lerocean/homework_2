package letters;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G"};
        System.out.println("Before swap: " + Arrays.toString(letters));
        swapElements(letters, 5, 1);
        System.out.println("After swap: " + Arrays.toString(letters));

    }

    public static void swapElements(String[] letters, int index1, int index2) {
        String temp = letters[index1];
        letters[index1] = letters[index2];
        letters[index2] = temp;
    }
}
