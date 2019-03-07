package sort;

/**
 * Created by qxing on 2019/1/15.
 */
public class InsertSort {

    public static void easyInsertSort(int[] array) {
        if(array == null || array.length <= 1) {
            return;
        }
        for(int i = 1; i < array.length; ++i) {
            int j = i;
            int tmp = array[i];
            while (j >= 1 && tmp < array[j-1]) {
                array[j] = array[j-1];
                --j;
            }
            array[j] = tmp;
        }
    }

    public static void binaryInsertSort(int[] array) {
        if(array == null || array.length <= 1) {
            return;
        }
        for(int i = 1; i < array.length; ++i) {
            int tmp = array[i];
            int left = 0, right = i-1;
            while (left <= right) {
                int mid = (left+right)/2;
                if(tmp < array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            int j = 1;
            while(j > left) {
                array[j] = array[j-1];
                --j;
            }
            array[left] = tmp;
        }
    }
}
