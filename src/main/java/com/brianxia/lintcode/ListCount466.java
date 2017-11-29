package com.brianxia.lintcode;

/**
 * @author xiadong
 */
class ListNode {
          int val;
    ListNode next;
          ListNode(int val) {
            this.val = val;
             this.next = null;
         }
      }

public class ListCount466 {

    public int countNodes(ListNode head) {

        if(head == null)
            return 0;

        int count = 1;
        while( head.next != null){
            count++;
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {

    }

}
