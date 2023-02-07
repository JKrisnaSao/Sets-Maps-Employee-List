
package assignment1ant;


public class multiSet {

    Node root;

    public multiSet() {
        root = null;
    }

    //Adds a element to the MultiSet
    void add(Employee e) {
        if (this.root == null) {
            root = new Node(e);
        } else {
            Node x = this.root;
            if (x.key.compare(e) == 0) {
                x.value++;
            } else {
                while (true) {
                    if (x.key.compare(e) > 0) {
                        if (x.left == null) {
                            x.left = new Node(e);
                            break;
                        } else {
                            x = x.left;
                        }
                    } else if (x.key.compare(e) < 0) {
                        if (x.right == null) {
                            x.right = new Node(e);
                            break;
                        } else {
                            x = x.right;
                        }
                    } else {
                        x.value++;
                        break;
                    }
                }
            }
        }
    }

    public boolean contains(Employee e) {
        if (root == null) {
            return false;
        } else {
            Node x = this.root;
            while (x != null) {
                if (x.key.compare(e) == 0) {
                    return true;
                } else if (x.key.compare(e) > 1) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }

            return false;
        }

    }

    public int count(Node n) {
        if (n == null) {
            return 0;
        } else {
            int count = n.value;
            count += count(n.left);
            count += count(n.right);
            return count;
        }
    }

    void prints(Node n) {
        if (n != null) {
            prints(n.left);
            System.out.println(n.key + " " + n.value);
            prints(n.right);
        }
    }

    void display() {
        prints(this.root);
    }
}
