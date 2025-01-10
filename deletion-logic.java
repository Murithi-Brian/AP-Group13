public AVLNode delete(AVLNode node, int key) {
    if (node == null) {
        return node;
    }

    if (key < node.key) {
        node.left = delete(node.left, key);
    } else if (key > node.key) {
        node.right = delete(node.right, key);
    } else {
        if ((node.left == null) || (node.right == null)) {
            AVLNode temp = (node.left != null) ? node.left : node.right;
            if (temp == null) {
                return null;
            } else {
                node = temp;
            }
        } else {
            AVLNode temp = minValueNode(node.right);
            node.key = temp.key;
            node.title = temp.title;
            node.author = temp.author;
            node.year = temp.year;
            node.right = delete(node.right, temp.key);
        }
    }

    if (node == null) {
        return node;
    }

    node.height = 1 + Math.max(height(node.left), height(node.right));
    int balance = balanceFactor(node);

    if (balance > 1 && balanceFactor(node.left) >= 0) {
        return rotateRight(node);
    }

    if (balance > 1 && balanceFactor(node.left) < 0) {
        node.left = rotateLeft(node.left);
        return rotateRight(node);
    }

    if (balance < -1 && balanceFactor(node.right) <= 0) {
        return rotateLeft(node);
    }

    if (balance < -1 && balanceFactor(node.right) > 0) {
        node.right = rotateRight(node.right);
        return rotateLeft(node);
    }

    return node;
}