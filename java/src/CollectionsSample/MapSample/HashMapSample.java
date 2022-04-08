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

        System.out.println("-----hashmap iteration---..");
        //iterate with the values.
        for(String o :obj.values()){
            System.out.println(o);

        }

        System.out.println("-----hashmap iteration with key---..");
        //iterate with the keys.
        for(String key:obj.keySet()){
            System.out.println(key+" -- "+obj.get(key));//using the key,access the values.
        }

        System.out.println("iteration with lambda expression---.");

        //lambda expression with key and value
        obj.forEach((key,value)->{
            System.out.println(key+" "+value);
        });

        //lambda expression with values
        obj.values().forEach(o->{
            System.out.println(o);
        });

        //lambda expression with keys
        obj.keySet().forEach(o->{
            System.out.println(o);
        });
    }
}
