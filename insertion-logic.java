public AVLNode insert(AVLNode node, int key, String title, String author, int year) {
    if (node == null) {
        return new AVLNode(key, title, author, year);
    }

    if (key < node.key) {
        node.left = insert(node.left, key, title, author, year);
    } else if (key > node.key) {
        node.right = insert(node.right, key, title, author, year);
    } else {
        return node; // Duplicate keys not allowed
    }

    node.height = 1 + Math.max(height(node.left), height(node.right));
    int balance = balanceFactor(node);

    if (balance > 1 && key < node.left.key) {
        return rotateRight(node);
    }

    if (balance < -1 && key > node.right.key) {
        return rotateLeft(node);
    }

    if (balance > 1 && key > node.left.key) {
        node.left = rotateLeft(node.left);
        return rotateRight(node);
    }

    if (balance < -1 && key < node.right.key) {
        node.right = rotateRight(node.right);
        return rotateLeft(node);
    }

    return node;
}