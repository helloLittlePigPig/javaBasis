package tree;


/**
 * Created by qxing on 2019/2/15.
 */
public class TreeNode {
    protected int val;
    protected TreeNode left;
    protected TreeNode right;


    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode getTree() {
        TreeNode node2 = new TreeNode(2,null,null);
        TreeNode node4 = new TreeNode(4,null,null);
        TreeNode node7 = new TreeNode(7,null,null);
        TreeNode node8 = new TreeNode(8,null,null);
        TreeNode node1 = new TreeNode(1,null,node2);
        TreeNode node3 = new TreeNode(3,node1,node4);
        TreeNode node6 = new TreeNode(6,node7,node8);
        TreeNode node5 = new TreeNode(5,node3,node6);
        return node5;
    }
}
