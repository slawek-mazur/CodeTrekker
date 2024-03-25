package io.stricte.codetrekker.math;

public class PalindromeNumber {

  boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int result = 0, tmp = x;

    while (tmp > 0) {
      result = result * 10 + (tmp % 10);
      tmp /= 10;
    }
    return result == x;
  }
}
