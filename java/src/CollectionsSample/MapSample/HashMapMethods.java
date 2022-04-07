package CollectionsSample.MapSample;

import java.util.HashMap;

/*
HashMap has to be create with key and value
data will not maintain the insertion order.it uses hashcode to store the data.

 */
public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String,String> obj = new HashMap<String ,String>();//declare the hashmap.
        obj.put("firstname","sample first name");//add the values to the hashmap.
        obj.put("lastname","sample last name");//add the values to the hashmap.
        obj.put("email","sample@gmail.com");//add the values to the hashmap.
        obj.put("mobile","546464");//add the values to the hashmap.s
        obj.put(null,"test");
        obj.put(null,"testasdf");
        System.out.println("to check the key "+obj.containsKey("address"));
        System.out.println("to check the key "+obj.containsKey("mobile"));
        System.out.println("to check the values "+obj.containsValue("testasdf"));
        ///putifabsent- if key is not exist,then add the values.
        obj.putIfAbsent("mobile","654646464");//when this key is not exist..then it will add.
        System.out.println("before remove -- "+obj);
        obj.remove("mobile");//remvoe based on the keye
        System.out.println("after remove -- "+obj);

//        System.out.println("--clear all the elements--");
//        obj.clear();//clear all the objects.
        System.out.println(obj);
        HashMap<String,String> obj2 = new HashMap<String ,String>();//declare the hashmap.
        obj2.put("address","sample address");
        obj2.put("street","sample street");
        System.out.println("--merging the maps--");
        obj.putAll(obj2);//merging the maps
        System.out.println(obj);
        System.out.println("--- replace the value with key--");
        obj.replace("address","updated address");//replace the values with key
        System.out.println(obj);
    }
}
