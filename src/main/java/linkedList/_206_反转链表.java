package linkedList;

/**
 * https://leetcode.cn/problems/reverse-linked-list/description/
     给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。


     示例 1：
     输入：head = [1,2,3,4,5]
     输出：[5,4,3,2,1]

     示例 2：
     输入：head = [1,2]
     输出：[2,1]

     示例 3：
     输入：head = []
     输出：[]

     提示：
     链表中节点的数目范围是 [0, 5000]
     -5000 <= Node.val <= 5000

 */
public class _206_反转链表 {

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

        //println(listNode1);
        println(reverseList(listNode1));


    }

    /**
     * 递归
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if(null == head || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 以链表1->2->3->4->5举例
     * @param head
     * @return
     */
    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        while (head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    public static void println( ListNode listNode){
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
