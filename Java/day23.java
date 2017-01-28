// Day 23 - BST Level-Order Traversal

public class Solution {
static void levelOrder(Node root){
        if (root != null) {
                Queue<Node> q = new LinkedList<Node>();
                q.add(root);

                while (!q.isEmpty()) {
                        Node tmp = q.remove();

                        if (tmp.left != null) {
                                q.add(tmp.left);
                        }
                        if (tmp.right != null) {
                                q.add(tmp.right);
                        }
                        System.out.print(tmp.data + " ");
                }
        }
}
}
