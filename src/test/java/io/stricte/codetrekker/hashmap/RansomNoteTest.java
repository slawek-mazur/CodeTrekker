package io.stricte.codetrekker.hashmap;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RansomNoteTest {

  private static final RansomNote NOTE = new RansomNote();

  @ParameterizedTest
  @MethodSource("testDataSource")
  void test(String ransomNote, String magazine, boolean expected) {

    Assertions.assertEquals(expected, NOTE.canConstruct(ransomNote, magazine));
  }

  private static Stream<Arguments> testDataSource() {
    return Stream.<Arguments>builder()
        .add(Arguments.of("aa", "aab", true))
        .add(Arguments.of("aa", "ab", false))
        .add(Arguments.of("a", "b", false))
        .build();
  }
}