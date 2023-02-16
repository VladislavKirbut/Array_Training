import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char taskNumber;
        do {
            System.out.println("Enter number of task: ");
            System.out.print("""
                    1. Function isLeapYear
                    2. Function getAverageNumber
                    3. Function reverseArray
                    4. Function getIndexOfElement
                    5. Function getSubArray
                    6. Function getElementsOnPage
                    0. End the program
                    """);

            taskNumber = (char) System.in.read();
        } while (taskNumber < '0' || taskNumber >'6');

        switch (taskNumber) {
            case '1' -> {
                System.out.print("Enter year: ");
                int year = scanner.nextInt();
                boolean isLeap = DateTimeUtils.isLeapYear(year);
                System.out.println("Is the [" + year + "] a leap year?");
                if (isLeap) System.out.println("Yes, it's a leap year!");
                else System.out.println("No, it isn't a leap year.");
            }
            case '2' -> {
                int[] arr = UserInputUtils.createArray();
                double averageNumber = ArrayUtils.getAverageNumber(arr);
                System.out.println("Average number of array: " + averageNumber);
            }
            case '3' -> {
                int[] arr = UserInputUtils.createArray();
                int[] newArray = ArrayUtils.reverseArray(arr);
                System.out.println("Reverse array: " + Arrays.toString(newArray));
            }
            case '4' -> {
                int[] arr = UserInputUtils.createArray();
                System.out.print("Enter element, that we looking for: ");
                int element = scanner.nextInt();
                int index = ArrayUtils.getIndexOfElement(arr, element);
                System.out.println("Index of element: " + index);
            }
            case '5' -> {
                int[] arr = UserInputUtils.createArray();
                System.out.print("Enter begin index: ");
                int beginIndex = scanner.nextInt();
                System.out.println("Enter last index: ");
                int lastIndex = scanner.nextInt();
                int[] subArray = ArrayUtils.getSubArray(arr, beginIndex,lastIndex);
                System.out.println("SubArray of array: " + Arrays.toString(subArray));
            }
            case '6' -> {
                int[] arr = UserInputUtils.createArray();
                System.out.print("Enter number of page (not less 1): ");
                int numberOfPage = scanner.nextInt();
                System.out.println("Enter count of elements on page: ");
                int countOfElement = scanner.nextInt();
                int[] newArr = ArrayUtils.getElementsOnPage(arr, numberOfPage,countOfElement);
                System.out.println("Elements on " + numberOfPage + " page: " + Arrays.toString(newArr));
            }
        }
    }
}
