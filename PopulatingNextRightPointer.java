/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*//**
This solution connects each node to its next right node in the same level of the binary tree using level order traversal via a queue.
Time complexity: O(N) - where N is the number of nodes in the tree.
Space complexity: O(N) - for the queue to store nodes at each level.
 */


class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root == null) return root;
        q.add(root);

        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                Node curr = q.poll();
                if(i != s-1){
                    curr.next = q.peek();
                }
                if(curr.left != null){
                    q.add(curr.left);
                    q.add(curr.right);
                }
            }
        }
        return root;
        
    }
}
