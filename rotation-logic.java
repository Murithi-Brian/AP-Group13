public AVLNode rotateRight(AVLNode y) {
    AVLNode x = y.left;
    AVLNode T = x.right;

    x.right = y;
    y.left = T;

    y.height = Math.max(height(y.left), height(y.right)) + 1;
    x.height = Math.max(height(x.left), height(x.right)) + 1;

    return x;
}

public AVLNode rotateLeft(AVLNode x) {
    AVLNode y = x.right;
    AVLNode T = y.left;

    y.left = x;
    x.right = T;

    x.height = Math.max(height(x.left), height(x.right)) + 1;
    y.height = Math.max(height(y.left), height(y.right)) + 1;

    return y;
}
