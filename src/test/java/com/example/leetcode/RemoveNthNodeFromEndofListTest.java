package com.example.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndofListTest {

    @Test
    void removeNthFromEnd() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        ListNode listnode = RemoveNthNodeFromEndofList.removeNthFromEnd(l1,4 );
        List<Integer> result = new ArrayList<Integer>();
        while (listnode != null ) {
            result.add(listnode.val);
            if (listnode != null) listnode = listnode.next;
        }
        System.out.println(result);
    }
}