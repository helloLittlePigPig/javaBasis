package sort;

/**
 * Created by qxing on 2019/2/10.
 */
public class SwapSort {

    public static void bubbleSort(int[] array) {
        if(array == null || array.length <= 1) {
            return;
        }
        for(int i = 0; i < array.length; ++i) {
            boolean flag = false;
            for(int j = array.length-1; j > i; --j) {
                if(array[j] < array[j-1]) {
                    swap(array, j, j-1);
                    flag = true;
                }
            }
            if(!flag) {
                return;
            }
        }
    }

    public static void quickSort(int[] array) {
        if(array == null || array.length <= 1) {
            return;
        }
        partition(array, 0, array.length-1);
    }

    private static void partition(int[] array, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivot = array[end];
        int i = start, j = end-1;
        while (i <= j) {
            while (array[i] < pivot) {
                ++i;
            }
            while (j >= start && array[j] >= pivot) {
                --j;
            }
            if(i < j) {
                swap(array, i, j);
            }
        }
        swap(array, j+1, end);
        partition(array, start, j);
        partition(array, j+2, end);
    }

    private static void swap(int[] array, int i, int j) {
        if(i != j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}
