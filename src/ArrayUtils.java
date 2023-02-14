public class ArrayUtils {
    public static double getAverageNumber(int[] array) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }

        return sum / count;
    }
}
