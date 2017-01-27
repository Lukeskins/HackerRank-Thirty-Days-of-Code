// Day 22 - Binary Search Trees

public class Solution {
public static int getHeight(Node root){

        if (root == null) {
                return -1;
        } else {
                int lDepth = getHeight(root.left);
                int rDepth = getHeight(root.right);

                if (lDepth > rDepth) {
                        return (lDepth + 1);
                } else {
                        return (rDepth + 1);
                }
        }
}
}
