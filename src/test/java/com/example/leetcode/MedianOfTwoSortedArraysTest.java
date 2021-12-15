package com.example.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MedianOfTwoSortedArraysTest {

    static Stream<Arguments> ArrayProvider() {
        return Stream.of(
                arguments(2, new int[][]{{1, 3}, {2}}),
                arguments(2.5, new int[][]{{1, 2}, {3,4}})
        );
    }

    static Stream<Arguments> ResultProvider() {
        return Stream.of(
                Arguments.of(2)
        );
    }

    @ParameterizedTest
    @MethodSource({"ArrayProvider"})
    void findMedianSortedArrays(final double expected, final int[][] array) {
        final MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        final double result = medianOfTwoSortedArrays.findMedianSortedArrays(array[0], array[1]);
        assertSoftly((s) -> {
            s.assertThat(expected).isEqualTo(result);
        });
    }
}