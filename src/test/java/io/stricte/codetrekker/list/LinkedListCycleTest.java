package io.stricte.codetrekker.list;

import io.stricte.codetrekker.list.LinkedListCycle.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

  private static final LinkedListCycle CYCLE = new LinkedListCycle();

  @Test
  void test() {

    ListNode three = new ListNode(3);
    ListNode two = new ListNode(2);
    ListNode zero = new ListNode(0);
    ListNode minusFour = new ListNode(-4);

    three.next = two;
    two.next = zero;
    zero.next = minusFour;
    minusFour.next = two;

    Assertions.assertTrue(CYCLE.hasCycle(three));

    ListNode ten = new ListNode(10);
    ListNode twenty = new ListNode(20);
    ten.next = twenty;
    twenty.next = ten;

    Assertions.assertTrue(CYCLE.hasCycle(ten));
  }
}