package datastruct.trees;

public class MyTree {


    public static void inOrderTraversal(TreeNode root){
       if(root.left!=null)
           inOrderTraversal(root.left);
       System.out.println(root.value);
        if(root.right!=null)
            inOrderTraversal(root.right);

    }

    public static void preOrderTraversal(TreeNode root){

        System.out.println(root.value);
        if(root.left!=null)
            preOrderTraversal(root.left);
        if(root.right!=null)
            preOrderTraversal(root.right);

    }

    public static void postOrderTraversal(TreeNode root){


        if(root.left!=null)
            postOrderTraversal(root.left);
        if(root.right!=null)
            postOrderTraversal(root.right);
        System.out.println(root.value);

    }

    public static int height(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }

    public static void main(String[] args) {
       TreeNode root = new TreeNode(10);
       TreeNode node1= root.addLeft(20);
        TreeNode node2= root.addRight(30);
        node1.addLeft(40);
        TreeNode node3 =node1.addRight(50);
        node3.addLeft(70);
        node3.addRight(80);

        node2.addRight(60);

      // inOrderTraversal(root);
     //  preOrderTraversal(root);
       // postOrderTraversal(root);
       System.out.println( height(root));



    }
}
