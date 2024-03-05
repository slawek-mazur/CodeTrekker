package io.stricte.codetrekker.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveElementTest {

  private static final RemoveElement REMOVE_ELEMENT = new RemoveElement();

  @ParameterizedTest
  @MethodSource("testDataSource")
  void test(int[] nums, int val, int expected) {

    Assertions.assertEquals(expected, REMOVE_ELEMENT.removeElement(nums, val));
  }

  private static Stream<Arguments> testDataSource() {
    return Stream.<Arguments>builder()
        .add(Arguments.of(new int[]{4, 5}, 5, 1))
        .add(Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5))
        .add(Arguments.of(new int[]{3, 2, 2, 3}, 3, 2))
        .add(Arguments.of(new int[]{1, 2, 1, 1}, 1, 1))
        .add(Arguments.of(new int[]{5}, 5, 0))
        .add(Arguments.of(new int[]{}, 10, 0))
        .add(Arguments.of(null, 10, 0))
        .build();
  }
}