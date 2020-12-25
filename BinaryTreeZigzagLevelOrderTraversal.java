/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list = new ArrayList<>();
        if(root ==null)return list;
        Stack<TreeNode>st1 = new Stack<>();
        st1.push(root);
        boolean right= true;
        while(!st1.isEmpty()){
            int size = st1.size();
            Stack<TreeNode>st2 = new Stack<>();
           
            List<Integer>temp = new ArrayList<>();
            if(right == true){
                for(int i=0; i<size; i++){
                    TreeNode node = st1.pop();
                    if(node.left!=null){
                        st2.push(node.left);
                    }
                     if(node.right!=null){
                        st2.push(node.right);
                    }
                    temp.add(node.val);
                }
                right = false;
                st1 = st2;
                
            }
            else {
                
                for(int i=0; i<size; i++){
                    TreeNode node = st1.pop();
                    if(node.right!=null){ 
                        st2.add(node.right);
                    }
                     if(node.left!=null){
                        st2.add(node.left);
                    }
                    temp.add(node.val);
                }
                st1 =st2;
              
                right = true;
            }
            
            list.add(new ArrayList<>(temp));
        }
        return list;
    }
}
