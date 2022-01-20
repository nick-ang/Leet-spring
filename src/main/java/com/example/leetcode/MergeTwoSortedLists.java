package com.example.leetcode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Assign the heads of each list to l1 and l2
        ListNode l1 = list1;
        ListNode l2 = list2;
        // set the head to a new listnode of val -1
        ListNode head = new ListNode(-1);
        // set current node to the head
        ListNode curr = head;
        // loop until we reach the end of both l1 and l2
        while (l1 != null && l2 != null) {
            // if l2's value is bigger than l1, set the node after cur to l1 and l1 to the node after l1
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
                //else set current node to l2 and l2 to the next node
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
//        once l1 ends, set the next node to l2
        if (l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }

        return head.next;
    }
}
