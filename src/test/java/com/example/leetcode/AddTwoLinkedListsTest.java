package com.example.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class AddTwoLinkedListsTest {

    private static final Logger LOG = LoggerFactory.getLogger(AddTwoLinkedLists.class);

    static Stream<Arguments> ArrayProvider() {
        ListNode l1 = new ListNode(2, 4, 3);
        ListNode l2 = new ListNode(5, 6, 4);
        ListNode l3 = new ListNode(7, 0, 8);
        return Stream.of(
                Arguments.of((Object) new ListNode[]{l1, l2, l3})
        );
    }

    //
//    @ParameterizedTest
//    @MethodSource("ArrayProvider")
    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(0);
        expected.add(8);
        final AddTwoLinkedLists addTwoLinkedLists = new AddTwoLinkedLists();
        ListNode nodeAfterDummyHead = addTwoLinkedLists.addTwoNumbers(l1, l4);
        ListNode p = nodeAfterDummyHead;
        List<Integer> result = new ArrayList<Integer>();
        while (p != null ) {
            result.add(p.val);
            if (p != null) p = p.next;
        }
        LOG.info(
                "Result - " + result + " | Expected - " + expected);
        assertSoftly((softly) -> {
            softly.assertThat(result)
                    .isEqualTo(expected);
        });

    }
}