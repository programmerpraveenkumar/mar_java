package CollectionsSample.ListSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSamplePojo {
    public static void main(String[] args) {
        ArrayList<City> obj = new ArrayList<City>();//string arraylist

        City london = new City();
        london.setId(7);
        london.setName("London");

        City mumbai = new City();
        mumbai.setId(1);
        mumbai.setName("Mumbai");

        City banglore = new City();
        banglore.setId(3);
        banglore.setName("Banglore");

        obj.add(london);
        obj.add(mumbai);
        obj.add(banglore);
        System.out.println("before sorting...");
        for(City c:obj){
            System.out.println(c.getId()+" "+c.getName());
        }
        /*
         obj.stream().filter((o)->o.getCourse().startsWith("t")).forEach((o)->{
            System.out.println(o);
        });
         obj.stream().filter((o)->o.getId() > 100).forEach((o)->{
            System.out.println(o);
        });
         */
        Collections.sort(obj,new NameComparator());//for pojo class,java does not know the data type to sort.So need to implement the interface called Comparator
        //Collections.sort(obj,new IdComparator().thenComparing(new NameComparator()));//usage of two comparators
        System.out.println("after sorting...");
        for(City c:obj){
            System.out.println(c.getId()+" "+c.getName());
        }

    }
}

class NameComparator implements Comparator<City>{
/*
1 -> 1st value is greater than 2nd value
0->both are same
-1->1st value is lesser than 2nd value.
*/
    @Override
    public int compare(City city1, City city2) {
        return city1.getName().compareTo(city2.getName());//return the int after comparing.
    }
}

class IdComparator implements Comparator<City>{
    @Override
    public int compare(City o1, City o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}