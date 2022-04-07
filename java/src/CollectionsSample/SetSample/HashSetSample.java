package CollectionsSample.SetSample;

import java.util.HashSet;
/*
it will not allow for the duplicates.
insertion order will not maintain
hashset uses hashcode to store the data internally.so it does not maintain the insertion order.
 */
public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("test");
        obj.add("test4");
        obj.add("test4");//will not throw any error.but it will not add also.
        obj.add("test");
        obj.add("test3");
        for(String tmp:obj){
            System.out.println(tmp);
        }
    }
}
