//treeNode
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
//method to swap the left and right elements
    static void mirrorBinaryTree(TreeNode root){

        //we can only swap if the element is not null
        if(root != null){
            TreeNode current = root.left;
            root.left = root.right;
            root.right = current;
            //after that call its left and right side and apply same operation
            mirrorBinaryTree(root.left);
            mirrorBinaryTree(root.right);
        }
    }



    public static void main(String[] args) {

    }
}
