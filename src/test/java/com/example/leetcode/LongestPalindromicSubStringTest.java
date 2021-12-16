package com.example.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestPalindromicSubStringTest {

    static Stream<Arguments> ArrayProvider() {
        return Stream.of(
                arguments("babad", "aba"),
                arguments("a", "a"),
                arguments("ac", "c"),
                arguments("cbbd", "bb")
        );
    }

    @ParameterizedTest
    @MethodSource({"ArrayProvider"})
    void test(String s, String expected) {
        final String result = LongestPalindromicSubString.longestPalindrome(s);
        assertSoftly((softly) -> {
            softly.assertThat(expected).isEqualTo(result);
        });
    }
}