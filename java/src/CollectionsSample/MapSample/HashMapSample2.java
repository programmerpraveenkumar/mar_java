package CollectionsSample.MapSample;

import java.util.HashMap;

/*
HashMap has to be create with key and value
data will not maintain the insertion order.it uses hashcode to store the data.

 */
public class HashMapSample2 {
    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<Integer ,String>();//declare the hashmap.
        obj.put(1,"sample first name");//add the values to the hashmap.
        obj.put(2,"sample last name");//add the values to the hashmap.
        obj.put(3,"sample@gmail.com");//add the values to the hashmap.
        obj.put(4,"546464");//add the values to the hashmap.s
        obj.put(5,"567567456");//add the values to the hashmap.s


        System.out.println(obj);//print all the values of the hashmap.
        System.out.println(obj.get(1));//print the value of the key
        System.out.println(obj.get(2));//print the value of the key
        System.out.println("--key iteration---");
        for(Integer k:obj.keySet()){
            System.out.println(k+" -- "+obj.get(k));
        }
    }
}
