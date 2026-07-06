package Main.Java.Basic.LinkedList;

public class Traverse_Doubly_linked_list {

    public static void main(String[] args) {
        Noda head = new Noda(10);

        head.next = new Noda(20);
        head.next.prev = head;

        head.next.next = new Noda(30);
        head.next.next.prev = head.next;

        head.next.next.next = new Noda(40);
        head.next.next.next.prev =  head.next.next;

        backward_traversal(head.next.next.next);

    }


    public static void forward_traverse(Noda head){
        Noda curr = head;

        if(curr==null){
            return;
        }
        System.out.print(curr.data +" ");
        forward_traverse(curr.next);
        }

    public static void backward_traversal(Noda tail) {
    Noda curr = tail;

    if(curr == null){
        return;
    }
    while(curr!=null){
        System.out.print(curr.data + " ");

        curr = curr.prev;
    }

    }


    }

