import producerconsumer.Resource;
import sort.InsertSort;
import sort.MergeSort;
import sort.SelectSort;
import sort.SwapSort;
import tree.TreeNode;
import tree.TreeOrder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by qxing on 2019/1/7.
 */
public class Main {

    public static void main(String[] args) {
        tree();
    }

    private static void tree() {
        TreeNode root = TreeNode.getTree();
        List<Integer> list1 = TreeOrder.postOrderRecursion(root);
        List<Integer> list2 = TreeOrder.postOrder(root);
        System.out.println(list1);
        System.out.println(list2);
    }

    private static void sort() {
        int[] array=new int[]{4,5,1,9,7,6,8,3,2};
        MergeSort.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void producerConsumer() {
        final Resource resource = new Resource();
        Runnable producer = new Runnable() {
            public void run() {
                while (true) {
                    resource.produce();
                }
            }
        };
        Runnable consumer = new Runnable() {
            public void run() {
                while (true) {
                    resource.consume();
                }
            }
        };
        new Thread(producer,"producer1").start();
        new Thread(producer,"producer2").start();
        new Thread(consumer,"consumer1").start();
        new Thread(consumer,"consumer2").start();
    }
}
