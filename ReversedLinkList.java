package chitra;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class ReversedLinkList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ReversedLinkList obj = new ReversedLinkList();
        ListNode result = obj.reverseList(head);

        System.out.print("Reversed list: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
