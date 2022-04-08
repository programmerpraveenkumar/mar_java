package CollectionsSample.MapSample;

import CollectionsSample.ListSample.ArraylistSample2;
import CollectionsSample.ListSample.City;

import java.util.ArrayList;
import java.util.HashMap;

/*
HashMap has to be create with key and value
data will not maintain the insertion order.it uses hashcode to store the data.

 */
public class HashMapArrayistPojo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<City>> obj = new HashMap<String ,ArrayList<City>>();//declare the hashmap.

        ArrayList<City> str1 = new ArrayList<>();
        str1.add(new City(10,"abc"));
        str1.add(new City(11,"abc11"));
        str1.add(new City(12,"abc12"));

        ArrayList<City> str2 = new ArrayList<>();
        str2.add(new City(10,"abc"));
        str2.add(new City(11,"abc11"));

        obj.put("first_element",str1);
        obj.put("first_element1",str2);

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
               System.out.println(v.getId()+"-"+v.getName());
           });
        });
    }
}
