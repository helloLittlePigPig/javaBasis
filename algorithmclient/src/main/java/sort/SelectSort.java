package sort;

/**
 * Created by qxing on 2019/2/10.
 */
public class SelectSort {

    public static void easySelectSort(int[] array) {
        if(array == null || array.length <= 1) {
            return;
        }
        for(int i = 0; i < array.length; ++i) {
            int minEle = array[i];
            int minIndex = i;
            for(int j = i+1; j < array.length; ++j) {
                if(array[j] < minEle) {
                    minEle = array[j];
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private static void swap(int[] array, int i, int j) {
        if(i != j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}
