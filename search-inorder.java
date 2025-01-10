public AVLNode search(AVLNode node, int key) {
    if (node == null || node.key == key) {
        return node;
    }
    return (key < node.key) ? search(node.left, key) : search(node.right, key);
}

public void inOrder(AVLNode node) {
    if (node != null) {
        inOrder(node.left);
        System.out.println("ID: " + node.key + ", Title: " + node.title +
                ", Author: " + node.author + ", Year: " + node.year);
        inOrder(node.right);
    }
}