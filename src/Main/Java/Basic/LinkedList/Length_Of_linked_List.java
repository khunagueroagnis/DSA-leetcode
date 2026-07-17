package Main.Java.Basic.LinkedList;

public class Length_Of_linked_List {


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println(lengthOfList(head));
    }

    public static int lengthOfList(Node head){
        if(head == null){
            return 0;
        }

        Node curr = head;
        int count = 1;
        while(curr.next != null){
            curr = curr.next;
            count ++;
        }
        return count;
    }

}
