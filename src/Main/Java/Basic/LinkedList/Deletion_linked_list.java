package Main.Java.Basic.LinkedList;

public class Deletion_linked_list {
    public static void main(String[] args) {

        Node head  = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);


        // head=deleteAtFront(head);
        // head = deleteAtBack(head);
        head = deleteAtPlace(head, 3);
        traverse(head);



    }

    public static Node deleteAtPlace(Node head, int pos){

        if(head == null){
            return null;
        }

        if(pos == 1){
        return head.next;
        }
        Node curr = head;
        for(int i=1;i<pos-1;i++){
        if(curr.next==null){
            return head;
        }
        curr = curr.next;
        if(curr.next!=null){
            curr.next = curr.next.next;
        }
    }
        return head;
    }



    public static Node deleteAtBack(Node head){
        if(head==null){
            return null;
        }

        if(head.next==null){
            return null;
        }

        Node curr = head;
        while(curr.next.next!=null){
            curr=curr.next;
        }

        curr.next=null;

        return head;
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
