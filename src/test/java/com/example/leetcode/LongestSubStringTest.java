package com.example.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class LongestSubStringTest {

    static Stream<Arguments> ArrayProvider() {
        return Stream.of(
                Arguments.of((Object) new String[]{"abcabcbb", "3"}),
                Arguments.of((Object) new String[]{"bbbbb", "1"}),
                Arguments.of((Object) new String[]{"pwwkew", "3"}),
                Arguments.of((Object) new String[]{"", "0"})
        );
    }

    @ParameterizedTest
    @MethodSource("ArrayProvider")
//    @ValueSource(strings = {"   ", " | ", "blah1|blah2", "blah1=value|blah2=value", "blah=value"})
    void lengthOfLongestSubstring(String[] s) {
        final int expected = Integer.parseInt(s[1]);
        final ReviseLongestSubString longestSubString = new ReviseLongestSubString();
        final int result = longestSubString.lengthOfLongestSubstring(s[0]);

        assertSoftly((softly) -> {
            softly.assertThat(expected)
                    .isEqualTo(result);
        });
    }
}