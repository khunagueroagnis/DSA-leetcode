package Main.Java.Basic.LinkedList;

public class Insertion_lined_list {


    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);

        int x = 1;
        int k = 4;
        int m = 56;
        head = insertAtFront(head,x);
        head = insertAtBack(head,k);
        head = insertAtSpecificLocation(head,2,m);
        traverse(head);


    }

    public static Node insertAtFront(Node head, int x){
        Node newnode = new Node(x);
        newnode.next = head;
        return newnode;
    }

    public static Node insertAtBack(Node head, int x){
        Node newnode = new Node(x);
        if(head==null){
            return newnode;
        }
        Node last = head;

        while(last.next!=null){
            last=last.next;
        }
        last.next= newnode;

        return head;
    }

    // middle

    public static Node insertAtSpecificLocation(Node head,int pos, int val){
       Node newnode = new Node(val);
        if(head==null){
           return newnode;
       }
        if(pos==1){
            newnode.next=head;
        }

        Node curr = head;
        for(int i=1; i<pos-1 && curr!=null;i++){
            curr = curr.next;
        }
        if(curr==null){
            return head;
        }
        newnode.next = curr.next;
        curr.next=newnode;

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
