package numbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alex", "Kate", "Andrew", "Natalie", "Anastasia"};
        System.out.println("Before swap: " + Arrays.toString(names));
        swapElements(names, 4, 2);
        System.out.println("After swap: " + Arrays.toString(names));

    }

    public static void swapElements(String[] names, int index1, int index2) {
        String temp = names[index1];
        names[index1] = names[index2];
        names[index2] = temp;
    }
}
