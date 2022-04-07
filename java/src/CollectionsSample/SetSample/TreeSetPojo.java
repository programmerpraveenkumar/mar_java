package CollectionsSample.SetSample;

import CollectionsSample.ListSample.City;
import CollectionsSample.ListSample.People;

import java.util.TreeSet;

/*
it will not allow for the duplicates.
insertion order will  not maintain.but it will sort the data based on ascending order.
 */
public class TreeSetPojo {
    public static void main(String[] args) {
        TreeSet<People> obj = new TreeSet<People>();
        obj.add(new People(5,"test5"));
        obj.add(new People(1,"test"));
        obj.add(new People(1,"test1"));//wil not allow the duplicates.
        obj.add(new People(2,"test2"));
        obj.add(new People(3,"test3"));
        for(People tmp:obj){
            System.out.println(tmp.getId()+tmp.getName());
        }


    }
}
