package io.stricte.codetrekker.string;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-common-characters/
class FindCommonCharacters {

  List<String> commonChars(String[] words) {
    byte[][] map = new byte[26][words.length];
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      for (char c : word.toCharArray()) {
        map[c - 'a'][i]++;
      }
    }

    List<String> res = new ArrayList<>();
    for (int i = 0; i < map.length; i++) {
      byte[] counts = map[i];
      byte min = Byte.MAX_VALUE;
      for (byte count : counts) {
        min = count < min ? count : min;
      }
      for (byte j = 0; j < min; j++) {
        res.add((char) (i + 'a') + "");
      }
    }
    return res;
  }
}
