package queue;

public class QueueTest {

    public static void main(String[] args) {
        // to be completed by student
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
//        System.out.println(queue.remove());
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.element());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.toString());
        queue.add(50);
        System.out.println(queue.size());
        System.out.println(queue.toString());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.toString());
        queue.add(100);
        System.out.println(queue.element());
        System.out.println(queue.toString());
    }
}
