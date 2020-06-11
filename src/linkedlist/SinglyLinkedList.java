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

    public Integer getFirst() {
        return head.getData();
    }

    /*public Node getFirstNode() {
        return head;
    }*/

    public Integer getLast() {
        return tail.getData();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
//        System.out.println(list.size());
        list.add(10);
//        System.out.println(list.size());
        list.add(20);
//        System.out.println(list.size());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.size());
//        System.out.println(list.remove());
        list.add(30);
        System.out.println(list.size());
    }

}















