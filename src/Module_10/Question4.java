package Module_10;

    class ListNode4 {
        int val;
        ListNode next;

        ListNode4(int val) {
            this.val = val;
            this.next = null;
        }
    }

public class Question4 {

        public static ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode slow = dummy;
            ListNode fast = dummy;

            // move fast n+1 steps
            for(int i = 0; i <= n; i++){
                fast = fast.next;
            }

            // move both pointers
            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }

            // remove node
            slow.next = slow.next.next;

            return dummy.next;
        }

        public static void printList(ListNode head){

            while(head != null){
                System.out.print(head.val + " ");
                head = head.next;
            }
        }

        public static void main(String[] args){

            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            int n = 2;

            head = removeNthFromEnd(head, n);

            printList(head);
        }

}
