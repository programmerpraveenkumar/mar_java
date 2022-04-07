package CollectionsSample.MapSample;

import java.util.HashMap;
import java.util.TreeMap;

/*
HashMap has to be created with key and value
data will not maintain the insertion order.it sorts the data based on ascending order(key).

 */
public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<String,String> obj = new TreeMap<String ,String>();//declare the hashmap.
        obj.put("firstname","sample first name");//add the values to the hashmap.
        obj.put("lastname","sample last name");//add the values to the hashmap.
        obj.put("email","sample@gmail.com");//add the values to the hashmap.
        obj.put("mobile","546464");//add the values to the hashmap.s
        obj.put("address","sample address");//add the values to the hashmap.s
        System.out.println(obj);//print all the values of the hashmap.
        System.out.println(obj.get("email"));//print the value of the key
        System.out.println(obj.get("address"));//print the value of the key
    }
}
