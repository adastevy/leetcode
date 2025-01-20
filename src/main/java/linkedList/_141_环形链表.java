package linkedList;

/**
 * https://leetcode.cn/problems/linked-list-cycle/description/
 * @author: csw
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class _141_环形链表 {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {return false;}
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);

        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;

        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;

        ListNode listNode5 = new ListNode(5);
        listNode4.next = listNode5;


        listNode5.next = listNode2;

        //println(listNode1);
        System.out.println(hasCycle(listNode1));


    }
}
