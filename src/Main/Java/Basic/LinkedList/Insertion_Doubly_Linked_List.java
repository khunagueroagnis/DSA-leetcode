package Main.Java.Basic.LinkedList;

public class Insertion_Doubly_Linked_List {
    public static void main(String[] args) {

        Noda head = new Noda(2);
        head.next = new Noda(4);
        head.next.prev = head;
        head.next.next = new Noda(5);
        head.next.next.prev = head.next;




        head = InsertAtFront(head,1);
        InsertAtEnd(head,6);
        InsertAtPosition(head,3,3);

        Traverse_Doubly_linked_list traverseClass = new Traverse_Doubly_linked_list();



        traverseClass.forward_traverse(head);

    }

    public static Noda InsertAtFront(Noda head, int newData){
        Noda newNode = new Noda(newData);
        newNode.next = head;
        if(head!=null){
            head.prev = newNode;
        }
        return newNode;
    }

    public static Noda InsertAtEnd (Noda head, int newData){
        Noda newNode = new Noda(newData);
        if(head == null){
            return newNode;
        }
        Noda curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;

        return head;
    }

    public static Noda InsertAtPosition(Noda head, int newData, int pos){
        Noda newnode = new Noda(newData);
        if(head == null){
            newnode = head;
        }
        Noda curr = head;
        int count = 1;

        while(count < pos-1){
            curr = curr.next;
            count++;
        }
        newnode.next = curr.next;
        newnode.prev = curr;
        curr.next = newnode;



    return head;

    }






}
