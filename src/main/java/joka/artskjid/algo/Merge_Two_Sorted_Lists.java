package joka.artskjid.algo;

public class Merge_Two_Sorted_Lists {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode head, tail;
        if (p1.val <= p2.val) {
            head = p1;
            p1 = p1.next;
        } else {
            head = p2;
            p2 = p2.next;
        }
        tail = head;

        while (true) {
            if (p1 == null) {
                tail.next = p2;
                return head;
            }

            if (p2 == null) {
                tail.next = p1;
                return head;
            }

            if (p1.val < p2.val) {
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                p2 = p2.next;
            }
            tail = tail.next;
        }
    }
}
