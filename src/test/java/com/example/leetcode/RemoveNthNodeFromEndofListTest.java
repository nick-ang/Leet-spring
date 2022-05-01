package com.example.leetcode;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RemoveNthNodeFromEndofListTest {

    @Test
    void removeNthFromEnd() {
        // set up nodes
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        // define expected array
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);

        // instantiate class and call instance method
        RemoveNthNodeFromEndofList instance = new RemoveNthNodeFromEndofList();
        ListNode listnode = instance.removeNthFromEnd(l1,2 );
        // define result array and loop thorugh and append nodes
        List<Integer> result = new ArrayList<Integer>();
        while (listnode != null ) {
            result.add(listnode.val);
            listnode = listnode.next;
        }

        System.out.println(result);
        SoftAssertions.assertSoftly((s)->{
            s.assertThat(result).isEqualTo(expected);
        });
    }

    public static class infTest {

        @Test
       void contextLoads() {
            Inif instance = new Inif();
            Void result = instance.infiniteLoopUsingFor();
        }
    }
}