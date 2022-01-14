package com.example.leetcode;
/*
The entry point into a linked list is called the head of the list.
It should be noted that head is not a separate node, but the
reference to the first node.*/

/*In order to solve this problem in only one pass and O(1) extra space,
however, we would need to find a way to both reach the end of the list
with one pointer and also reach the n'th node from the end simultaneously
with a second pointer.*/

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Set a fast and slow pointer at the head (start of list)
        ListNode fast = head;
        ListNode slow = head;
        // loop fast to the nth node
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // for (int i = 0; i < n; i++) fast = fast.next - also works
        // if the nth node is the last that means the list is only 1 long
        if (fast == null) return head != null ? head.next : null;
        // use fast.next == null as exit condition and loop to end of list
        while (fast.next != null) {
            fast = fast.next;
            // slow starts from the head while fast is already at the nth node
            slow = slow.next;
        }
/*      once we hit fast.next == null i.e. end of the list, we know slow is at the node
        before the end, and can use below to skip a node and return the list without the nth node*/
        slow.next = slow.next.next;
        return head;
    }
}

