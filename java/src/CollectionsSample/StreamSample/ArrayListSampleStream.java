package CollectionsSample.StreamSample;

import CollectionsSample.ListSample.City;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSampleStream {
    public static void main(String[] args) {
        ArrayList<String> obj  = new ArrayList<>();
        obj.add("test");
        obj.add("test2");
        obj.add("abc");
        //stream classes
        obj.stream().forEach((o)->{
            System.out.println(o);
        });
        System.out.println("Filter the data starts with t");
        //obj.stream().filter((o)->o.startsWith("t"));

        obj.stream().filter((o)->o.startsWith("t")).forEach((o)->{
            System.out.println(o);
        });
        System.out.println("--------");

        List<String> objfilter = obj.stream().filter((o)->o.startsWith("t")).collect(Collectors.toList());
        System.out.println(objfilter);

        ArrayList<City> objCity  = new ArrayList<>();
        objCity.add(new City(1,"test"));
        objCity.add(new City(2,"test3"));
        objCity.add(new City(3,"test2"));
        objCity.add(new City(4,"test4"));
        objCity.add(new City(5,"test5"));
        objCity.stream().forEach((o)->{
            System.out.println(o.getId()+" "+o.getName());
        });

    }
}
