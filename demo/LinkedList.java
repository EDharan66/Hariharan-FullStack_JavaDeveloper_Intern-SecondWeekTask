public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    //add - asc
    public void addList(int data) {
        Node node = new Node(data);


        if (head == null) {
            head = node;
            tail = node;
        } else {

            Node current = head;
            if (current.data > data) {
                node.next = head;
                head = node;
                return;
            }
            while (current != null) {
                if (current.next == null) {
                    current.next = node;
                    current = node;
                } else if (current.next.data > data) {
                    node.next = current.next;
                    current.next = node;
                    break;
                }
                current = current.next;
            }
        }
    }

    //remove method
    public void removeList(int data) {
        if (this.head == null) {
            System.out.println("empty list");
        }else if(this.head.data==data){
            head = head.next;
        }else {
            remove(data,this.head);
        }
    }

    private void remove(int data, Node current) {
        if (current.next == null) {
            System.out.println("no " + data + " value found");
        }else if (current.next.data == data) {
            current.next = current.next.next;
        }else  {
            remove(data, current.next);
        }
    }


    //print list
    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("empty list ");
        }
        System.out.print("list = [");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//
        list.addList(1);
        list.addList(3);
        list.addList(4);
        list.addList(5);
        list.addList(2);
//

        System.out.println("before deletion ");
        list.printList(); // 12345

        list.removeList(4);


        System.out.println("after deletion of 4");
        list.printList(); // 1235
    }
}

