package linkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        System.out.println(val);
        StringBuilder sb = new StringBuilder();
        while (next != null) {
            sb.append("val = ").append(val).append(", ");
        }
        return sb.toString();
    }
}