package io.stricte.codetrekker.math;

// https://leetcode.com/problems/ugly-number/description/
class UglyNumber {

  private static final int[] factors = {2, 3, 5};

  boolean isUgly(int num) {
    if (num < 1) {
      return false;
    }
    if (1 == num) {
      return true;
    }
    for (int factor : factors) {
      if (0 == num % factor) {
        return isUgly(num / factor);
      }
    }
    return false;
  }
}
