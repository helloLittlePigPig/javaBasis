package sort;

/**
 * Created by qxing on 2019/2/10.
 */
public class MergeSort {

    public static void mergeSort(int[] array) {
        if(array == null || array.length <= 1) {
            return;
        }
        int[] res = new int[array.length];
        mergeSort(array, res, 0, array.length-1);
    }

    private static void mergeSort(int[] array, int[] res, int start, int end) {
        if(start == end) {
            return;
        }
        int mid = (start+end)/2;
        mergeSort(array, res, start, mid);
        mergeSort(array, res, mid+1, end);
        merge(array, res, start, mid, end);
    }

    private static void merge(int[] array, int[] res, int start, int mid, int end) {
        int index = end;
        int i = mid, j = end;
        while(i >= start && j >= mid+1) {
            if(array[i] <= array[j]) {
                res[index--] = array[j--];
            } else {
                res[index--] = array[i--];
            }
        }
        while (i >= start) {
            res[index--] = array[i--];
        }
        while (j >= mid+1) {
            res[index--] = array[j--];
        }
        for(int k = start; k <= end; ++k) {
            array[k] = res[k];
        }
    }
}
