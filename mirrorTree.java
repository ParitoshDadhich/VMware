class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if(node == null)
            return;
            
        Node temp = node.right;
        
        // if(node.right != null)
            node.right = node.left;
            
        // if(node.left != null)
            node.left = temp;
            
        mirror(node.left);
        mirror(node.right);
    }
}
