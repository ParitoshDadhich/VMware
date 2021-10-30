// method 1
// time o(n2)


class Solution
{
    public int isPairPresent(Node root, int target)
    {
        boolean flag = helper(root, root, target);
        
        return flag == true ? 1 : 0;
    }
    
    private static boolean helper(Node root, Node curNode, int key){
        if(curNode == null)
            return false;
        
        if(find(root, key - curNode.data))
            return true;
        
        return helper(root, curNode.left, key) || helper(root, curNode.right, key);
    }
    
    private static boolean find(Node root, int key){
        if(root == null)
            return false;
        
        if(root.data == key)
            return true;
        
        if(root.data < key)
            return find(root.right, key);
        else
            return find(root.left, key);
    }
    
}




// method 2
// time o(n) and space o(n)


class Solution
{
    public int isPairPresent(Node root, int target)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        
        int i = 0;
        int j = list.size() - 1;
        
        while(i < j){
            if(list.get(i) + list.get(j) > target)
                j--;
            else if(list.get(i) + list.get(j) < target)
                i++;
            else
                return 1;
        }
        
        return 0;
    }
    
    private static void inorder(Node root, ArrayList<Integer> list){
        if(root == null) 
            return;
        
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
        
        return;
    }
    
}

