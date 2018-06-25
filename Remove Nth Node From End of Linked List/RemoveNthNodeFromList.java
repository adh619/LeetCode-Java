/*
 * Given a linked list, remove the n-th node from the end of list and return its head.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempNode = new ListNode(0);
        tempNode.next = head;
        
        ListNode firstNode = tempNode;
        ListNode secondNode = tempNode;
        
        for(int i = 1; i <= n + 1; i++){
            firstNode = firstNode.next;
        }
        
        while(firstNode != null){
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        
        secondNode.next = secondNode.next.next;
        return tempNode.next;
    }
}
