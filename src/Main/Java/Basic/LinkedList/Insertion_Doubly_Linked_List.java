package Main.Java.Basic.LinkedList;

public class Insertion_Doubly_Linked_List {
    public static void main(String[] args) {

        Noda head = new Noda(2);
        head.next = new Noda(3);
        head.next.prev = head;
        head.next.next = new Noda(4);
        head.next.next.prev = head.next;




        head = InsertAtFront(head,1);
        InsertAtEnd(head,5);

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






}
