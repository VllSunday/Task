import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Тест 1
        int[] array = {5,1,3,3,1,5};
        int target = 4;

        // Тест 2
        int[] array1 = {1,2,4,5};
        int target1 = 3;

        //Тест 3
        int[] array2 = {1, 2, 3};
        int target2 = 4;

        //Тест 4
        int[] array3 = {6, 7, 8};
        int target3 = 5;

        //Тест 5
        int[] array4 = {1, 1, 2, 2, 3, 3};
        int target4 = 2;

        System.out.println(Arrays.toString(findMinAndMax(array4, target4)));

    }

    public static int[] findMinAndMax (int[] array, int target) {
        int min = -1;
        int max = Integer.MAX_VALUE;
        int counterMin = 0;
        int counterMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < target) {
                if (array[i] > min) {
                    min = array[i];
                    counterMin = 1;
                } else if (array[i] == min) {
                    counterMin++;
                }
            }

            if (array[i] > target) {
                if (array[i] < max) {
                    max = array[i];
                    counterMax = 1;
                } else if (array[i] == max) {
                    counterMax++;
                }
            }
        }

        int[] result = new int[counterMin + counterMax];
        //Вставка мин значения(если они есть)
        for (int i = 0; i < counterMin; i++) {
            result[i] = min;
        }
        //Вставка макс значения(если они есть)
        for (int i = counterMin; i < result.length ; i++) {
            result[i] = max;
        }

        return result;
    }
}