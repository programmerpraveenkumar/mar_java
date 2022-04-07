package CollectionsSample.MapSample;

import CollectionsSample.ListSample.City;

import java.util.HashMap;

/*
HashMap has to be create with key and value
data will not maintain the insertion order.it uses hashcode to store the data.

 */
public class HashMapPojo {
    public static void main(String[] args) {
        HashMap<String, City> obj = new HashMap<String ,City>();//declare the hashmap.

        City city1 = new City(1,"testcity");

        obj.put("city1",city1);
        obj.put("city2",new City(2,"test2"));
        obj.put("city3",new City(3,"test3"));
        System.out.println(obj);//values are in the objects.
        System.out.println("iteration with pojo class");
        obj.values().forEach(o->{
            System.out.println(o.getName()+"--"+o.getId());
        });

    }
}
