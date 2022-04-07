package CollectionsSample.MapSample;

import CollectionsSample.ListSample.ArraylistSample2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/*
HashMap has to be create with key and value
data will not maintain the insertion order.it uses hashcode to store the data.

 */
public class LinkedHashMapHashSet {
    public static void main(String[] args) {
        LinkedHashMap<Integer, HashSet<String>> obj = new LinkedHashMap<Integer, HashSet<String>>();//declare the hashmap.

        HashSet<String> hStr1= new HashSet<String>();
        hStr1.add("abc_str1");

        HashSet<String> hStr2= new HashSet<String>();
        hStr2.add("abc2_str1");
        hStr2.add("abc2_str2");
        hStr2.add("abc2_str3");

        HashSet<String> hStr3= new HashSet<String>();
        hStr3.add("abc3_str3");

        HashSet<String> hStr4= new HashSet<String>();
        hStr4.add("abc_str1");
        hStr4.add("abc_str2");
        hStr4.add("abc_str3");
        hStr4.add("abc_str4");

        obj.put(1,hStr1);
        obj.put(2,hStr2);
        obj.put(3,hStr3);
        obj.put(4,hStr4);



        System.out.println(obj);

        //lambda expression
        obj.values().forEach(o->{
            System.out.println("iteration--");
            o.forEach(s->{
                System.out.println(s);
            });
        });

    }
}
