package CollectionsSample.MapSample;

import CollectionsSample.ListSample.ArraylistSample2;

import java.util.ArrayList;
import java.util.HashMap;

/*
HashMap has to be create with key and value
data will not maintain the insertion order.it uses hashcode to store the data.

 */
public class HashMapArrayList {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> obj = new HashMap<String ,ArrayList<String>>();//declare the hashmap.

        ArrayList<String> str1 = new ArrayList<>();
        str1.add("test");
        str1.add("test2");
        str1.add("test3");

        ArrayList<String> str2 = new ArrayList<>();
        str2.add("str1_test");
        str2.add("str2_test1");

        ArrayList<String> str3 = new ArrayList<>();
        str3.add("test");

        ArrayList<String> str4 = new ArrayList<>();
        str4.add("test");


        ArraylistSample2 arraylistSample2 = new ArraylistSample2();


        obj.put("first_element",str1);
        obj.put("first_element1",str2);
        obj.put("first_element2",str3);
        obj.put("first_element3",str4);
        obj.put("first_element4",str4);
        obj.put("first_element5",arraylistSample2.getArrayList());//adding value from the external class
        System.out.println(obj);
        System.out.println(obj.get("first_element1").get(1));//access  the arraylist using hashmap
        System.out.println("----lambda expression iteration----");
        //lambda expression for hashamp
        obj.forEach((key,values)->{
            System.out.println(values);
        });

        //lambda expression for hashmap  and arraylist
        obj.forEach((key,values)->{
            System.out.println("-----hashmap iteration----"+key);
            //arraylist itearation...
           values.forEach(v->{
               System.out.println(v);
           });
        });
    }
}
