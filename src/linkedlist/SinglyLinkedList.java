package linkedlist;

public class SinglyLinkedList {

    private static class Node {
        private Integer data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public Integer getData() {
            return data;
        }

        @Override
        public String toString() {
            return data.toString();
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int data) {
        addLast(data);
    }

    public void addLast(Integer data) {
        if (head == null) { // data is the first element in the list
            Node node = new Node(data);
            head = node;
            tail = node;
            size++;
        } else { // if list already contains nodes
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void addFirst(Integer data) {
        Node node = new Node(data);
        Node temp = head;
        head = node;
        head.next = temp;
        size++;
    }

    public void add(int index, Integer data) throws RuntimeException{
        if (index < 0 || index > size) throw new RuntimeException("invalid index");
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node tmp1 = head; // stores reference
        Node tmp2 = head;
        for (int i = 1; i < index; ++i) {
            tmp1 = tmp1.next; // node that comes before the node being inserted
            tmp2 = tmp2.next;
        }
        tmp2 = tmp2.next; // node that comes after the node that is being inserted
        Node node = new Node(data);
        tmp1.next = node;
        node.next = tmp2;
        size++;
    }

    public Integer remove() {
        return removeFirst();
    }

    public Integer removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        Integer data = head.getData();
        Node temp = head.getNext();
        head.setNext(null);
        head = temp;
        size--;
        return data;
    }

    public Integer removeLast() throws RuntimeException{
        if (isEmpty()) throw new RuntimeException("List is empty");
        Node tmp = head;
        int itr = size - 1;
        for (int i = 1; i < itr; ++i)
            tmp = tmp.next;
        Integer data = tail.data;
        tail = null; // not necessary, just for helping GC
        tmp.next = null;
        tail = tmp;
        size--;
        return data;
    }

    public boolean remove(Integer data) throws RuntimeException{
        if (isEmpty()) throw new RuntimeException("list is empty");
        if (!contains(data)) return false;
        if (head.data == data) { // user is trying to delete the first element
            removeFirst();
        } else {
            Node tmp1 = head;
            Node tmp2 = head;
            while (tmp1.next.data != data) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
            tmp2 = tmp1.next.next;
            tmp1.next.next = null;
            tmp1.next = tmp2;
            size--;
            return true;
        }
        return false;
    }

    public Integer getFirst() {
        return head.getData();
    }

    /*public Node getFirstNode() {
        return head;
    }*/

    public Integer getLast() {
        return tail.getData();
    }

    public boolean contains(Integer data) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == data) return true;
            tmp = tmp.next;
        }
        return false;
    }

    public Integer get(int index) {
        // to be done by student
        return null;
    }

    public void printList() throws RuntimeException{
        if (isEmpty()) throw new RuntimeException("list is empty");
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
//        System.out.println(list.size());
        list.add(10);
//        System.out.println(list.size());
        list.add(20);
//        System.out.println(list.size());
//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list.size());
//        System.out.println(list.remove());
        list.add(30);
//        list.add(0, 5);
//        list.addFirst(5);
        list.add(0, 5);
        list.printList();
        list.add(4, 60);
        list.printList();
        list.add(3, 25);
        list.printList();
//        list.add(-1, 100);
//        list.printList();
//        System.out.println(list.contains(60));
//        list.removeLast();
//        list.printList();
//        System.out.println(list.contains(60));
        list.remove(25);
        list.printList();
        list.remove(5);
        list.printList();
        System.out.println(list.size());
        list.remove(60);
        list.printList();
        System.out.println(list.size());
    }

}















