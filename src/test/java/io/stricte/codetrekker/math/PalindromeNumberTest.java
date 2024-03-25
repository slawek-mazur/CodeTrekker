package io.stricte.codetrekker.math;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PalindromeNumberTest {

  private static final PalindromeNumber NUMBER = new PalindromeNumber();

  @ParameterizedTest
  @MethodSource("testDataSource")
  void test(int number, boolean expected) {
    Assertions.assertEquals(expected, NUMBER.isPalindrome(number));
  }

  private static Stream<Arguments> testDataSource() {
    return Stream.<Arguments>builder()
        .add(Arguments.of(11, true))
        .add(Arguments.of(8, true))
        .add(Arguments.of(14, false))
        .build();
  }
}