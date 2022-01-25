package com.example.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l1.next = l3;
        l3.next = l5;
        l2.next = l4;
        l4.next = l6;
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(4);
        expected.add(6);
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        final ListNode nodeAfterDummyHead = mergeTwoSortedLists.mergeTwoLists(l1,l2);
        ListNode p = nodeAfterDummyHead;
        List<Integer> result = new ArrayList<Integer>();
        while (p != null ) {
            result.add(p.val);
            if (p != null) p = p.next;
        }
        assertSoftly((softly) -> {
            softly.assertThat(result)
                    .isEqualTo(expected);
        });
    }
}