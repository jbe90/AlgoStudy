
public class BST {
    public class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
            left = right = null;
        }
    }

    TreeNode root;

    BST() {
        root = null;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (current.value < value) {
            current.right = insertRecursive(current.right, value);
        } else if (current.value > value) {
            current.left = insertRecursive(current.left, value);
        }

        return current;
    }

    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(TreeNode root, int value) {

        if (root == null) {
            return false;
        }
        if (value == root.value) {
            return true;
        }

        return value < root.value ? containsRecursive(root.left, value) : containsRecursive(root.right, value);
    }

    public TreeNode search(int value) {
        return searchRecursive(root, value);
    }

    private TreeNode searchRecursive(TreeNode current, int value) {

        if (current == null) {
            return null;
        }
        if (value == current.value) {
            return current;
        }

        return value < current.value ? searchRecursive(current.left, value) : searchRecursive(current.right, value);
    }

    public void delete(int value) {
        root =  deleteRecursive(root, value);
    }

    private TreeNode deleteRecursive(TreeNode current, int value) {

        if (current == null) {
            return null;
        }

        if (value < current.value){
            current.left =  deleteRecursive(current.left, value);
        }else if ( value > current.value)
        {
            current.right = deleteRecursive(current.right, value);
        }

        if (value == current.value) {
            if (current.left == null)
                return current.right;
            else if (current.right == null)
                return current.left;

            current.value = findSmallestValue(root.right);

            // Delete the inorder successor
            current.right = deleteRecursive(current.right, current.value);
        }

        return current;
    }

    private int findSmallestValue(TreeNode root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
}
