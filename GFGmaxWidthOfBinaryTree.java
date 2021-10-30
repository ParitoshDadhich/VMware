class Solution {
    int getMaxWidth(Node root) {
        if(root == null)
            return 0;
        
         int ans = 0;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         
         while(!q.isEmpty()){
             int n = q.size();
             ans = Math.max(n, ans);
             for(int i=0; i<n; i++){
                 Node node = q.poll();
                 if(node.left != null)
                    q.add(node.left);
                    
                 if(node.right != null)
                    q.add(node.right);
             }
         }
        
        return ans;
    }
}





 
