package com.example.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GenerateParanthesisTest {

    static Stream<Arguments> ArrayProvider() {
        return Stream.of(
                arguments(3, Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")),
                arguments(1, Arrays.asList("()"))
        );
    }

    @ParameterizedTest
    @MethodSource({"ArrayProvider"})
    void generateParenthesis(int max, List<String> expected) {
        ReviseGenerateParanthesis generateParanthesis = new ReviseGenerateParanthesis();
        List<String> result = generateParanthesis.generateParenthesis(max);
        assertSoftly((s) -> {
                    s.assertThat(result).isEqualTo(expected);
                }
        );
    }

}