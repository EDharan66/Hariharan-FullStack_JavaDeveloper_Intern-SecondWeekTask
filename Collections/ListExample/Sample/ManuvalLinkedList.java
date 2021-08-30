public class ManuvalLinkedList {


    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){

        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node current = head;
        if (current==null){
            System.out.println("empty node");
        }

        System.out.print("list = [");
        while (current!=null){
            System.out.print(current.data);
            if(current.next!=null){
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ManuvalLinkedList list = new ManuvalLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        list.display();
    }

}


