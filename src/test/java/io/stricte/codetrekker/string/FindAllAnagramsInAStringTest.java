package io.stricte.codetrekker.string;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindAllAnagramsInAStringTest {

  private static final FindAllAnagramsInAString STRING = new FindAllAnagramsInAString();

  @Test
  void test() {

    Assertions.assertEquals(List.of(0, 6), STRING.findAnagrams("cbaebabacd", "abc"));
    Assertions.assertEquals(List.of(0, 1, 2), STRING.findAnagrams("abab", "ab"));
  }
}