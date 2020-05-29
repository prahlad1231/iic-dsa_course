package queue;

public class Queue {
    // to be completed by student
    private int capacity; // total capacity of the queue
    private int size = 0; // total number of elements in the queue
    private int head = -1;
    private int tail = -1;
    private int[] queue;

    public Queue() {
        this(100);
    }

    public Queue(int capacity) {
        this.capacity =capacity;
    }

    public void add(int element) throws RuntimeException{
        if (size == capacity) throw new RuntimeException("Queue is full!");
        if (head == -1) { // adding element for the first time
            queue = new int[capacity];
            queue[++head] = element;
            tail++;
        } else {
            queue[++tail] = element;
        }
        size++;
    }

    public int remove() throws RuntimeException{
        if(isEmpty()) throw new RuntimeException("Queue is empty!");
        if (size() == 1) { // if there is only one element in the queue
            tail = -1;
            head = -1;
            size = 0;
            return queue[0];
        }
        size--;
        return queue[head++];
    }

    public int element() {
        if (isEmpty()) throw new RuntimeException("Queue is empty!");
        return queue[head];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i, j;
        for (i = head, j = 1; j < size; ++i, ++j)
            sb.append(queue[i] + ", ");
        sb.append(queue[i] + "]");
        return sb.toString();
    }
}
