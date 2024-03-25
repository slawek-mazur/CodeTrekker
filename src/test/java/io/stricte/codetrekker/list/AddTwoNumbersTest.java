package io.stricte.codetrekker.list;

import io.stricte.codetrekker.list.AddTwoNumbers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  private static final AddTwoNumbers ADD = new AddTwoNumbers();

  @Test
  void test() {
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(7);
    list1.next.next = new ListNode(3);

    ListNode list2 = new ListNode(5);
    list2.next = new ListNode(6);
    list2.next.next = new ListNode(4);

    Assertions.assertEquals("638", ADD.addTwoNumbers(list1, list2).toString());
  }

  @Test
  void testAdd() {
    ListNode list1 = new ListNode(9);
    ListNode list2 = new ListNode(7);
    Assertions.assertEquals("61", ADD.addTwoNumbers(list1, list2).toString());
  }
}