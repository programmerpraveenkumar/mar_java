package CollectionsSample;

import java.util.PriorityQueue;
import java.util.Stack;

/*
it is LIFO->Last in first out
 */
public class StacakSample {
    public static void main(String[] args) {
        Stack<String> obj = new Stack<>();
        obj.add("test2");
        obj.add("test");
        obj.add("test1");
        obj.add("test4");
        System.out.println(obj);
        System.out.println("last element "+obj.peek());//last element
        System.out.println("last element "+obj.pop());//remove the last  element
        System.out.println("after removal "+obj);//all elements
        System.out.println("last element "+obj.pop());//remove the last  element
        System.out.println(obj);
    }
}
