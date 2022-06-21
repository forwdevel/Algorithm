// Not completed

class Node {
      int key;
      Node left; // This is store the left child object
      Node right; // This is store the right child object
      boolean visited;

      Node(int key) {
            this.visited = false;
            this.key = key;
            right = null;
            left = null;
      }

      Node search_Recursive(Node root, int key) {
            // Base Cases: root is null or key is present at root
            if (root == null || root.key == key) {
                  return root;
            }
            if (root.left == null && root.right != null) {
                  search_Recursive(root.right, key);
            }
            if (root.right == null && root.left != null) {
                  search_Recursive(root.left, key);
            }
            if (root.left != null &&) {
                  
            }
      }
}

public class BinaryTree {
      Node root;

      // Constructors
      BinaryTree(int key) {
            root = new Node(key);
      };

      BinaryTree() {
            root = null;
      }

      public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();

            // Create root
            tree.root = new Node(1);

            // Insert the nodes
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);

      }
}
