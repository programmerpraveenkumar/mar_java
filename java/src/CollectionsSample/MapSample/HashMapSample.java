package CollectionsSample.MapSample;

import java.util.HashMap;

/*
HashMap has to be create with key and value
data will not maintain the insertion order.it uses hashcode to store the data.

 */
public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String,String> obj = new HashMap<String ,String>();//declare the hashmap.
        obj.put("firstname","sample first name");//add the values to the hashmap.
        obj.put("lastname","sample last name");//add the values to the hashmap.
        obj.put("email","sample@gmail.com");//add the values to the hashmap.
        obj.put("mobile","546464");//add the values to the hashmap.s
        System.out.println(obj);//print all the values of the hashmap.
        System.out.println(obj.get("email"));//print the value of the key
        System.out.println(obj.get("address"));//print the value of the key

        System.out.println("hashmap iteration..");
        //iterate with the values.
        for(String o :obj.values()){
            System.out.println(o);
        }
    }
}
