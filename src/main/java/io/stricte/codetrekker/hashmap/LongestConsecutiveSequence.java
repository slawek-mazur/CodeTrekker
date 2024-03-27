package io.stricte.codetrekker.hashmap;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-consecutive-sequence/description/
class LongestConsecutiveSequence {

  int longestConsecutive(int[] nums) {
    if (nums == null || nums.length < 2) {
      return 1;
    }

    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    int max = 0;
    for (int num : nums) {
      int count = 1;

      // look left
      int n = num;
      while (set.contains(--n)) {
        count++;
        set.remove(n);
      }

      // look right
      n = num;
      while (set.contains(++n)) {
        count++;
        set.remove(n);
      }
      max = Math.max(max, count);
    }
    return max;
  }
}
