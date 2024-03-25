package io.stricte.codetrekker.math;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class UglyNumberTest {

  private static final UglyNumber NUMBER = new UglyNumber();

  @ParameterizedTest
  @MethodSource("testDataSource")
  void test(int number, boolean expected) {
    Assertions.assertEquals(expected, NUMBER.isUgly(number));
  }

  private static Stream<Arguments> testDataSource() {
    return Stream.<Arguments>builder()
        .add(Arguments.of(6, true))
        .add(Arguments.of(8, true))
        .add(Arguments.of(14, false))
        .build();
  }
}