package io.stricte.codetrekker.hashmap;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class IsomorphicStringsTest {

  private static final IsomorphicStrings STRINGS = new IsomorphicStrings();

  @ParameterizedTest
  @MethodSource("testDataSource")
  void test(String s1, String s2, boolean expected) {

    Assertions.assertEquals(expected, STRINGS.isIsomorphic(s1, s2));
  }

  private static Stream<Arguments> testDataSource() {
    return Stream.<Arguments>builder()
        .add(Arguments.of("paper", "title", true))
        .add(Arguments.of("foo", "bar", false))
        .add(Arguments.of("egg", "add", true))
        .build();
  }
}