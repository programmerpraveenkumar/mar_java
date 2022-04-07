package CollectionsSample;

import CollectionsSample.ListSample.People;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/*
it is FIFO->First in first out
 */
public class QueueSample {
    public static void main(String[] args) {
        PriorityQueue<String> obj = new PriorityQueue<>();
        obj.add("test2");
        obj.add("test");
        obj.add("test1");
        System.out.println(obj);
        obj.add("test4");
        System.out.println("head element "+obj.element());//first element
        System.out.println("head element "+obj.peek());//first element
        System.out.println("removing.."+obj.poll());//remove the first element
        System.out.println("after removal "+obj);//first element
        System.out.println("removing.."+obj.poll());//remove the first element
        System.out.println("after removal "+obj);//all element
        System.out.println(obj);
    }
}
