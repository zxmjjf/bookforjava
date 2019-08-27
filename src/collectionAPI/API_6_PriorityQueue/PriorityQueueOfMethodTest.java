package collectionAPI.API_6_PriorityQueue;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueOfMethodTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random();

        for (int i = 0; i < 15; ++i){
            int num = random.nextInt(100);
            priorityQueue.add(num);
            System.out.println(num + " -> " + priorityQueue);
        }

        /** test forEach()方法 */
        priorityQueue.forEach(o -> System.out.print(o + "\t"));
        System.out.println();

        for (int i = 0; i < 15; ++i) {
            System.out.println(priorityQueue.remove() + " -> " + priorityQueue);
        }

    }
}
