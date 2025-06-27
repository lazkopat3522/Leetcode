public class leetCode {
    public static void main(String[] args) {
public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    // Dummy node to simplify handling the start of the list.
    ListNode dummyHead = new ListNode(0);
    ListNode current = dummyHead;
    int carry = 0;

    // Loop until we have processed both lists and any final carry.
    while (l1 != null || l2 != null || carry != 0) {
        // Get the value of the current nodes, or 0 if the list is exhausted.
        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;

        // Calculate the sum for the current position.
        int sum = val1 + val2 + carry;

        // The new carry is the tens digit of the sum.
        carry = sum / 10;

        // The new node's value is the ones digit of the sum.
        current.next = new ListNode(sum % 10);

        // Advance the pointer for the result list.
        current = current.next;

        // Advance pointers for the input lists if they are not null.
        if (l1 != null) {
            l1 = l1.next;
        }
        if (l2 != null) {
            l2 = l2.next;
        }
    }

    // The result starts after the dummy head.
    return dummyHead.next;
}
}