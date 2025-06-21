
public class addTwoNumbers {
    public static void main(String[] args) {
        // Creating nodes
        Listnode head = new Listnode(10);
        head.next = new Listnode(20);
        head.next.next = new Listnode(30);
        Listnode tail=new Listnode(20);
        tail.next=new Listnode(25);
        tail.next.next=new Listnode(40);
        // Print the list
        System.out.print("First list = ");
        printList(head);
        System.out.println("");
        System.out.print("Second list = ");
        printList(tail);
    }

    public static void printList(Listnode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}


