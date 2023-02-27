package basicjava;


import java.util.Arrays;

public class Basic {

    
    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

   
    public static int[] removeElement(int[] arr, int value) {
        int index = findIndex(arr, value);
        if (index == -1) {
            return arr;
        }
        return Arrays.stream(arr)
                .filter(element -> element != value)
                .toArray();
    }

   
    public static int[] insertElement(int[] arr, int value, int position) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }
        result[position] = value;
        for (int i = position + 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }


    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    
    public static int[] findDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                result[index++] = arr[i];
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
