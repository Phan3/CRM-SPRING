package smart;

public class LeetCode2 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        while(head != null && head.next != null) {
            if(head.val == head.next.val) {
                if(head.next.next != null) {
                    result.next = head.next;
                } else {
                    result.next = null;
                }
            }
            head = head.next;
        }
        return result;
    }

}
