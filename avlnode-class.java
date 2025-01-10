// AVLNode Class
public class AVLNode {
    int key;
    String title;
    String author;
    int year;
    int height;
    AVLNode left, right;

    public AVLNode(int key, String title, String author, int year) {
        this.key = key;
        this.title = title;
        this.author = author;
        this.year = year;
        this.height = 1;
    }
}
