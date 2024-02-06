package letters;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G"};
        System.out.println("Before swap: " + Arrays.toString(letters));
        swapElements(letters, 5, 1);
        System.out.println("After swap: " + Arrays.toString(letters));

    }

    public static void swapElements(String[] names, int index1, int index2) {
        String temp = names[index1];
        names[index1] = names[index2];
        names[index2] = temp;
    }
}
