package io.stricte.codetrekker.list;

// https://leetcode.com/problems/add-two-numbers/description/
class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0), node = head;
    int carry = 0;
    while (null != l1 || null != l2 || carry > 0) {
      node.next = new ListNode(carry);
      node = node.next;

      if (null != l1) {
        node.val += l1.val;
        l1 = l1.next;
      }
      if (null != l2) {
        node.val += l2.val;
        l2 = l2.next;
      }
      carry = node.val / 10;
      node.val %= 10;
    }
    return head.next;
  }

  public static class ListNode {

    int val;

    ListNode next;

    ListNode(int val) {
      this.val = val;
    }

    @Override
    public String toString() {
      return val + (next != null ? next.toString() : "");
    }
  }
}
