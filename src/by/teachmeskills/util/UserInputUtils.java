package by.teachmeskills.util;

import java.util.Scanner;

public class UserInputUtils {
    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int lengthOfArray = scanner.nextInt();
        if (lengthOfArray < 0)
            throw new IllegalArgumentException("Enter correct data.");

        int[] newArr = new int[lengthOfArray];
        System.out.println("Enter elements of array: ");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print("Element number " + (i + 1) + ": ");
            newArr[i] = scanner.nextInt();
        }

        return newArr;
    }
}
