package com.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class ContainerWithMostWaterTest {

    @Test
    public void Shouldreturn16() {
        final int expected = 16;
        final int[] myNum = {4,3,2,1,4};
        final ContainerWithMostWater container = new ContainerWithMostWater();
        int result = container.maxArea(myNum);

        assertSoftly((softly) -> {
            softly.assertThat(expected)
                    .isEqualTo(result);
        });
    }
}