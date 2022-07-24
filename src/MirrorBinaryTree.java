class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data, TreeNode left, TreeNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class MirrorBinaryTree {

    static void mirrorBinaryTree(TreeNode root){
        if(root != null){
            TreeNode current = root.left;
            root.left = root.right;
            root.right = current;
            mirrorBinaryTree(root.left);
            mirrorBinaryTree(root.right);
        }
    }



    public static void main(String[] args) {

    }
}
