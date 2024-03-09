package io.stricte.codetrekker.string;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindCommonCharactersTest {

  private static final FindCommonCharacters FIND = new FindCommonCharacters();

  @Test
  void test() {

    Assertions.assertEquals(List.of("e", "l", "l"),
        FIND.commonChars(new String[]{"bella", "label", "roller"}));

    Assertions.assertEquals(List.of("c", "o"),
        FIND.commonChars(new String[]{"cool", "lock", "cook"}));
  }
}