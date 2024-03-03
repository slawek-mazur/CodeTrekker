package io.stricte.codetrekker.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeSortedArrayTest {

  private static final MergeSortedArray ARRAY = new MergeSortedArray();

  @ParameterizedTest
  @MethodSource("testDataSource")
  void test(int[] expected, int[] nums1, int m, int[] nums2, int n) {

    ARRAY.merge(nums1, m, nums2, n);
    Assertions.assertArrayEquals(expected, nums1);
  }

  private static Stream<Arguments> testDataSource() {
    return Stream.<Arguments>builder()
        .add(
            Arguments.of(
                new int[]{1, 2, 2, 3, 5, 6},
                new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3
            )
        )
        .add(
            Arguments.of(
                new int[]{1, 2},
                new int[]{1, 0}, 1, new int[]{2}, 1
            )
        )
        .build();
  }
}