class Solution
{
    public static Node reverse(Node node, int k)
    {
        if(node == null)
            return null;
        
        Node tail = node;
        
        int t = k;
        while(t != 1 && node != null){
            node = node.next;
            t--;
        }
        
        Node temp = null;
        if(node != null)
            temp = node.next;
        
        if(node != null)
            node.next = null;
        Node head = reverse(tail);
        
        tail.next = reverse(temp, k);
        
        return head;
    }
    
    private static Node reverse(Node root){
        if(root == null || root.next == null)
            return root;
            
        Node p = root, q = null, r = null;
        
       
        while(p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        
        return q;
    }
    
}

