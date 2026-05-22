package Main.Java.Basic.LinkedList;

public class Tranverse_Linked_List_Recursion {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
        head.next.next.next = new Node(80);

        traverse(head);
    }

    public static void traverse(Node head){

        if(head==null){
            System.out.println();
        }
        System.out.print(head.data);

        if(head.next!=null){
            System.out.print("->");
            traverse(head.next);
        }

    }

}
