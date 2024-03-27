package io.stricte.codetrekker.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

  private static final LongestConsecutiveSequence SEQUENCE = new LongestConsecutiveSequence();

  @Test
  void test() {

    Assertions.assertEquals(
        4,
        SEQUENCE.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    Assertions.assertEquals(
        9,
        SEQUENCE.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
  }
}