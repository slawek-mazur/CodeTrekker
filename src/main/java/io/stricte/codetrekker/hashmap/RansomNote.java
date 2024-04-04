package io.stricte.codetrekker.hashmap;

// https://leetcode.com/problems/ransom-note/
class RansomNote {

  boolean canConstruct(String ransomNote, String magazine) {
    int[] map = new int[26];

    for (char c : magazine.toCharArray()) {
      map[c - 'a']++;
    }

    for (char c : ransomNote.toCharArray()) {
      if (map[c - 'a'] == 0) {
        return false;
      }
      map[c - 'a']--;
    }
    return true;
  }
}
