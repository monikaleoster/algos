package datastruct.trees;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;


    public  TreeNode addLeft(int x){
        TreeNode node = new TreeNode(x);
        this.setLeft(node);
        return node;
    }
    public  TreeNode addRight(int x){
        TreeNode node = new TreeNode(x);
        this.setRight(node);
        return node;
    }

    public TreeNode add(int x, int y){
        if(x!=-1){
            addLeft(x);
        }
        if(y!=-1){
            addRight(y);
        }
        return this;
    }
    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }



    TreeNode(int x){
        this.value=x;
    }

}
