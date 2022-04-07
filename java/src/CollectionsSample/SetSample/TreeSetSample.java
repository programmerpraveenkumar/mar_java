package CollectionsSample.SetSample;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
it will not allow for the duplicates.
insertion order will  not maintain.but it will sort the data based on ascending order.
 */
public class TreeSetSample {
    public static void main(String[] args) {
        TreeSet<String> obj = new TreeSet<String>();
        obj.add("test");
        obj.add("test4");
        obj.add("test4");//will not throw any error.but it will not add also.
        obj.add("test");//will not throw any error.but it will not add also.
        obj.add("test3");
        for(String tmp:obj){
            System.out.println(tmp);
        }
        TreeSet<Integer> objInt = new TreeSet<Integer>();
        objInt.add(10);
        objInt.add(9);
        objInt.add(1);//will not throw any error.but it will not add also.
        objInt.add(4);//will not throw any error.but it will not add also.
        objInt.add(5);
        //objInt.iterator()
        for(Integer tmp:objInt){
            System.out.println(tmp);
        }

    }
}
