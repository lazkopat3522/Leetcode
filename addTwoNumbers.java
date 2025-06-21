
public class addTwoNumbers {
    public static void main(String[] args) {
        // Creating nodes
        Listnode head = new Listnode(10);
        head.next = new Listnode(20);
        head.next.next = new Listnode(30);
        Listnode tail=new Listnode(20);
        head.next=new Listnode(25);
        head.next.next=new Listnode(40);
        // Print the list
        System.out.println("First list = ");
        printList(head);
        System.out.println("Second list = ");
        printList(tail);
    }

    public static void printList(Listnode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}


