/ AVLTree Class
public class AVLTree {
    private AVLNode root;

    public AVLNode getRoot() {
        return root;
    }
    public void setRoot(AVLNode root) {
        this.root = root;
    }
    private int height(AVLNode node) {
        return (node == null) ? 0 : node.height;
    }
    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }
}
