public class ArrayUtils {

    public static double getAverageNumber(int[] array) {
        if (array == null || array.length == 0)
            return 0;

        double sum = 0;
        int count = 0; // counter
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }

        return sum / count;
    }

    public static int[] reverseArray(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Enter a correct array.");

        int[] newArr = new int[array.length];
        int count = 0;

        for (int i = array.length - 1; i >= 0; i--)
            newArr[count++] = array[i];

        return newArr;
    }

    public static int getIndexOfElement(int[] array, int element) {
        if (array == null || array.length == 0)
            return -1;

        for (int i = 0; i < array.length; i++)
            if (array[i] == element)
                return i;

        return -1;
    }
  }

