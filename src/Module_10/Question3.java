package Module_10;

    class ListNode3 {
        int val;
        ListNode next;

        ListNode3(int val) {
            this.val = val;
            this.next = null;
        }
    }

public class Question3 {

        public static ListNode middleNode(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;        // move 1 step
                fast = fast.next.next;   // move 2 steps
            }

            return slow;
        }

        public static void printList(ListNode node) {

            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }

        public static void main(String[] args) {

            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next = new ListNode(6);

            ListNode middle = middleNode(head);

            System.out.println(middle.val);        }

}
