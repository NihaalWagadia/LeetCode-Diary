/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Queue<Integer>st = new LinkedList<>();
        ListNode listnode = head;
        ListNode node = new ListNode();
        while(listnode!=null){
            st.add(listnode.val);
            listnode = listnode.next;
        }
        listnode = node;
        int size = st.size();
        int remove = size-n+1;
        for(int i=1; i<=size; i++){
            if(remove!=i){
               node.next = new ListNode(st.poll());
                node = node.next;
            }
            else{
                st.poll();
            }
        }
        return listnode.next;
    }
}
