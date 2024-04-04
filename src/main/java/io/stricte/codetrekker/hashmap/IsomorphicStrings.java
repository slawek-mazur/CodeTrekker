package io.stricte.codetrekker.hashmap;

// https://leetcode.com/problems/isomorphic-strings/
class IsomorphicStrings {

  boolean isIsomorphic(String s1, String s2) {
    int[] m = new int[256];
    for (int i = 0; i < s1.length(); i++) {
      char c1 = s1.charAt(i);
      char c2 = s2.charAt(i);
      if (m[c1] != m[c2 + 128]) {
        return false;
      }
      m[c1] = m[c2 + 128] = i + 1;
    }
    return true;
  }
}
