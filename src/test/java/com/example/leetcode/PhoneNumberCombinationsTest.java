package com.example.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class PhoneNumberCombinationsTest {

    static Stream<Arguments> ArrayProvider() {
        return Stream.of(
                arguments("23", Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                arguments("", List.of()),
                arguments("2", Arrays.asList("a","b","c")
        ));
    }

    @ParameterizedTest
    @MethodSource({"ArrayProvider"})
    void letterCombinations(String digits, List<String> expected) {
        PhoneNumberCombinations phoneNumber = new PhoneNumberCombinations();
        final List<String> result = phoneNumber.letterCombinations(digits);
        assertSoftly ((s) -> {
            s.assertThat(result).isEqualTo(expected);
        });
    }
}