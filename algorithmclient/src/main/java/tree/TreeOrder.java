package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qxing on 2019/2/15.
 */
public class TreeOrder {

    /**
     * 先序遍历，递归
     * @param root
     * @return
     */
    public static List<Integer> preOrderRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        preOrderRecursion(root, res);
        return res;
    }

    private static void preOrderRecursion(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        res.add(root.val);
        preOrderRecursion(root.left, res);
        preOrderRecursion(root.right, res);
    }

    /**
     * 先序遍历，非递归
     * @param root
     * @return
     */
    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while (!st.empty()) {
            TreeNode curNode = st.pop();
            res.add(curNode.val);
            if(curNode.right != null) st.push(curNode.right);
            if(curNode.left != null) st.push(curNode.left);
        }
        return res;
    }

    /**
     * 中序遍历，递归
     * @param root
     * @return
     */
    public static List<Integer> inOrderRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        inOrderRecursion(root, res);
        return res;
    }

    private static void inOrderRecursion(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        inOrderRecursion(root.left, res);
        res.add(root.val);
        inOrderRecursion(root.right, res);
    }

    /**
     * 中序遍历，非递归
     * @param root
     * @return
     */
    public static List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curNode = root;
        while (!st.empty() || curNode != null) {
            while (curNode != null) {
                st.push(curNode);
                curNode = curNode.left;
            }
            curNode = st.pop();
            res.add(curNode.val);
            curNode = curNode.right;
        }
        return res;
    }

    /**
     * 后序遍历，递归
     * @param root
     * @return
     */
    public static List<Integer> postOrderRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        postOrderRecursion(root, res);
        return res;
    }

    private static void postOrderRecursion(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        postOrderRecursion(root.left, res);
        postOrderRecursion(root.right, res);
        res.add(root.val);
    }

    /**
     * 后序遍历，非递归
     * @param root
     * @return
     */
    public static List<Integer> postOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curNode = root;
        TreeNode lastNode = null;
        while (!st.empty() || curNode != null) {
            while (curNode != null) {
                st.push(curNode);
                curNode = curNode.left;
            }
            curNode = st.peek();
            if(curNode.right == null) {
                lastNode = st.pop();
                res.add(lastNode.val);
                curNode = null;
            } else {
                curNode = curNode.right;
            }
        }
        return res;
    }
}
