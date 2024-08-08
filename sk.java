import java.util.*;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class TreeTraversal {
    public void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
        
    }
    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }
    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
       
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);


        // Create a TreeTraversal object and call the preorder method
        TreeTraversal treeTraversal = new TreeTraversal();
        System.out.print("\npreorder traversal: ");
        treeTraversal.preorder(root);
        System.out.print("\npostorder traversal: ");
        treeTraversal.postorder(root);
        System.out.print("\ninorder traversal: ");
        treeTraversal.inorder(root);
    }
}

