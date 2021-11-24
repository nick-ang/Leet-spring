package com.example.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}

// Works by starting 1 pointer at the end and 1 at the start
// We move whichever pointers height is smallest inward