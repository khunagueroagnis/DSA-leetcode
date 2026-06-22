package Main.Java.Basic.LinkedList;

public class Deletion_linked_list {
    public static void main(String[] args) {

        Node head  = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head=deleteAtFront(head);

        traverse(head);



    }
    public static Node deleteAtFront(Node head){
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }

    public static void traverse(Node head){
        if(head == null){
            System.out.println();
        }
        System.out.print(head.data);
        if(head.next!= null) {
            System.out.print("->");
            traverse(head.next);
        }
    }


}
