package Main.Java.Basic.LinkedList;

public class Insertion_lined_list {


    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);

        int x = 1;
        head = insertAtFront(head,x);
        traverse(head);


    }

    public static Node insertAtFront(Node head, int x){
        Node newnode = new Node(x);
        newnode.next = head;
        return newnode;
    }

    //have to do insertion at back and middle

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
